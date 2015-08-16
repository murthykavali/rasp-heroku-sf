package util.api.gauge;

import util.api.base.Style;

/**
 * Created by Murthy Kavali
 */
public class DataLabels {
  private String align, backgroundColor, borderColor, color;
  private Double borderRadius, borderWidth, x, y, zIndex;
  private Style style;

  public DataLabels() {
  }

  public Style getStyle() {
    if (null == style) {
      this.style = new Style();
    }
    return style;
  }

  public void setStyle(Style style) {
    this.style = style;
  }

  public String getAlign() {
    return align;
  }

  public void setAlign(String align) {
    this.align = align;
  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public String getTextColor() {
    return color;
  }

  public void setTextColor(String color) {
    this.color = color;
  }

  public Double getBorderRadius() {
    return borderRadius;
  }

  public void setBorderRadius(Double borderRadius) {
    this.borderRadius = borderRadius;
  }

  public Double getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
  }

  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public Double getzIndex() {
    return zIndex;
  }

  public void setzIndex(Double zIndex) {
    this.zIndex = zIndex;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }
}
