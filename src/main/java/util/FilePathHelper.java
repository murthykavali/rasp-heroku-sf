package util;

import java.io.File;

/**
 * Created by Murthy Kavali
 * Date 16/8/15.
 */
public class FilePathHelper {

    public static String existingFilePath(final String fileName, final String baseFolder) {
        String existingFileName = fileName;
        File file = new File(existingFileName);
        if (file.exists()) {
            return existingFileName;
        }
        existingFileName = getConfigFile(baseFolder + "/" + fileName, 2);
        return existingFileName;
    }

    private static String getConfigFile(String fileName, final int depth) {
        if (depth == 0) {
            return null;
        }
        File file = new File(fileName);
        if (file.exists()) {
            return file.toString();
        }
        return getConfigFile("../" + fileName, depth - 1);
    }
}
