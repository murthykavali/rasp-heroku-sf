package util;


/**
 * Created by Murthy Kavali
 */
public enum ImageFormat {
    SVG("svg"),
    PNG("png"),
    JPEG("jpeg"),
    PDF("pdf");

    private String imageFormat;

    private ImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public String getType() {
        return imageFormat;
    }
}