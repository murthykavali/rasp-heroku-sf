package service;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import util.FilePathHelper;
import util.ImageFormat;
import util.api.ChartOptions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * Created by Murthy Kavali
 * <p/>
 * Singleton class to generate image type charts.
 */
public class ImageGenerator {

    private static final String PHANTOM_JS_FOLDER_NAME = "phantomjs";
    private static final String COMMAND_PHANTOM_JS =
            "%s/exec/phantomjs %s/highcharts/highcharts-convert.js -infile %s -outfile %s -width %s -constr Chart -callback %s/highcharts/callback.js";
    private static final ImageGenerator INSTANCE = new ImageGenerator();
    private static final String CHART_TEMP_FILES = "ChartTempFiles";
    private static final String JSON_INPUT_PATH = "%s%sinput_%s_%d.json";
    private static final String IMAGE_OUT_PUT_PATH = "%s%simage%s_%d.%s";

    private ImageGenerator() {
    }

    /**
     * This will generate an image for the give type(svg/png/jpeg) and returns the path to the generated image.
     *
     * @param chartOptions - The ChartOption
     * @param imageFormat  - The image format e.g SVG or JPEG or SVG
     * @param width        - The width of the image
     * @return {@link} - The path to the image
     */
    public String generate(ChartOptions chartOptions, ImageFormat imageFormat, double width) {
        File inputFile = null;
        try {
            String workingDirectory = constructOutputDirectory();
            FileUtils.forceMkdir(new File(workingDirectory));
            String inputFilePath = constructInputJsonFile(workingDirectory);
            String outputFilePath = constructOutputImagePath(imageFormat, workingDirectory);
            inputFile = new File(inputFilePath);
            FileUtils.writeStringToFile(inputFile, chartOptions.toJson());
            String phantomjsPath = FilePathHelper.existingFilePath(PHANTOM_JS_FOLDER_NAME, "conf");
            Process process = Runtime.getRuntime().exec(String
                    .format(COMMAND_PHANTOM_JS, phantomjsPath, phantomjsPath, inputFilePath, outputFilePath, width, phantomjsPath));

            int exitStatus = process.waitFor();
            if (exitStatus != 0) {
                handleImageGenerationFailure(process);
            }
            return outputFilePath;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            FileUtils.deleteQuietly(inputFile);
        }
        return null;
    }

    public static ImageGenerator getInstance() {
        return INSTANCE;
    }

    public String generate(String metaData, ImageFormat imageFormat, double width) {
        File inputFile = null;
        try {
            String workingDirectory = constructOutputDirectory();
            FileUtils.forceMkdir(new File(workingDirectory));
            String inputFilePath = constructInputJsonFile(workingDirectory);
            String outputFilePath = constructOutputImagePath(imageFormat, workingDirectory);
            inputFile = new File(inputFilePath);
            FileUtils.writeStringToFile(inputFile, metaData);
            String phantomjsPath = FilePathHelper.existingFilePath(PHANTOM_JS_FOLDER_NAME, "conf");
            Process process = Runtime.getRuntime().exec(String
                    .format(COMMAND_PHANTOM_JS, phantomjsPath, phantomjsPath, inputFilePath, outputFilePath, width, phantomjsPath));

            int exitStatus = process.waitFor();
            if (exitStatus != 0) {
                handleImageGenerationFailure(process);
            }
            return outputFilePath;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            FileUtils.deleteQuietly(inputFile);
        }
        return null;
    }


    public String generate(String chartOptionsJson, String outputFilePath, double width) {
        File inputFile = null;
        try {
            String workingDirectory = constructOutputDirectory();
            FileUtils.forceMkdir(new File(workingDirectory));
            String inputFilePath = constructInputJsonFile(workingDirectory);
            inputFile = new File(inputFilePath);
            FileUtils.writeStringToFile(inputFile, chartOptionsJson);
            String phantomjsPath = FilePathHelper.existingFilePath(PHANTOM_JS_FOLDER_NAME, "conf");
            Process process = Runtime.getRuntime().exec(String
                    .format(COMMAND_PHANTOM_JS, phantomjsPath, phantomjsPath, inputFilePath, outputFilePath, width, phantomjsPath));

            int exitStatus = process.waitFor();
            if (exitStatus != 0) {
                handleImageGenerationFailure(process);
            }
            return outputFilePath;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            FileUtils.deleteQuietly(inputFile);
        }
        return null;
    }

    private void handleImageGenerationFailure(Process process) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = process.getInputStream();
            //TODO need to log exception
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }


    private String constructOutputImagePath(ImageFormat imageFormat, String workingDirectory) {
        return String.format(IMAGE_OUT_PUT_PATH, workingDirectory, File.separator, UUID.randomUUID(), System
                .currentTimeMillis(), imageFormat.getType());
    }

    private String constructInputJsonFile(String workingDirectory) {
        return String
                .format(JSON_INPUT_PATH, workingDirectory, File.separator, UUID.randomUUID(), System.currentTimeMillis());
    }

    private String constructOutputDirectory() {
        return CHART_TEMP_FILES;
    }

}
