package util.builder;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.CharEncoding;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ChartGenerator {

    public static final String commandPhantomJS = "app/phantomjs/exec/phantomjs app/phantomjs/highcharts/highcharts-convert.js -infile %s -outfile %s -scale %s -width %s -constr Chart -callback app/phantomjs/highcharts/callback.js";

    /**
     * To genearte SVG chart by using PhantomJS.
     *
     * @param inputFilePath  Json file contains all the chart options.
     * @param outputFilePath To save the generated output file.
     * @param scale          Optional if the @param:inputFilePath contains height details
     * @param width          Optional if the @param:inputFilePath contains width details
     * @return
     */
    public static boolean runPhantomJS(String inputFilePath, String outputFilePath, double scale, double width) throws Exception {
        BufferedReader bufferedReader = null;
        InputStream inputStream = null;
        try {

            //command: phantomjs highcharts-convert.js -infile options1.json -outfile chart1.png -scale 2.5 -width 300 -constr Chart -callback callback.js

            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(String.format(commandPhantomJS, inputFilePath, outputFilePath, scale, width));

            int exitStatus = process.waitFor();
            inputStream = process.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, CharEncoding.UTF_8));

            String currentLine = null;
            StringBuilder stringBuilder = new StringBuilder(exitStatus == 0 ? "SUCCESS:" : "ERROR:");
            currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                stringBuilder.append(currentLine);
                currentLine = bufferedReader.readLine();
            }

            if (exitStatus == 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(bufferedReader);
        }
        return false;
    }


}
