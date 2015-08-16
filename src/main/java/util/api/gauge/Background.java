package util.api.gauge;

/**
 * Created by Murthy Kavali
 */
public class Background {

  private String borderColor, outerRadius;
  private Object backgroundColor;
  private int borderWidth;

  public Background() {
  }

  public Background(String backgroundColor, String borderColor, String outerRadius, int borderWidth) {
    this.backgroundColor = backgroundColor;
    this.borderColor = borderColor;
    this.outerRadius = outerRadius;
    this.borderWidth = borderWidth;
  }

  public Object getBackgroundColor() {
    return backgroundColor;
  }

  public Background setBackgroundColor(Object backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public Background setBorderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  public String getOuterRadius() {
    return outerRadius;
  }

  public Background setOuterRadius(String outerRadius) {
    this.outerRadius = outerRadius;
    return this;
  }

  public int getBorderWidth() {
    return borderWidth;
  }

  public Background setBorderWidth(int borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

}
