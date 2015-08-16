package util.api.plotoption;

import util.api.base.BaseObject;
import util.api.base.Style;

public class PlotOptionsDataLabels extends BaseObject {

  private String color;

  private boolean enabled;

  private Object formatter;

  private String format;

  private Integer x, y, distance;

  private String align = "center";

  private double rotation;

  private Style style;

  public Style getStyle() {
    if (null == style) {
      this.style = new Style();
    }
    return this.style;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public void setStyle(Style style) {
    this.style = style;
  }

  public String getAlign() {
    return align;
  }

  public String getColor() {
    return color;
  }

  public int getDistance() {
    return distance;
  }

  public Object getFormatter() {
    return formatter;
  }

  public double getRotation() {
    return rotation;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public PlotOptionsDataLabels setAlign(String align) {
    this.align = align;
    return this;
  }

  public PlotOptionsDataLabels setColor(String color) {
    this.color = color;
    return this;
  }

  public PlotOptionsDataLabels setDistance(int distance) {
    this.distance = distance;
    return this;
  }

  public PlotOptionsDataLabels setEnabled(boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public PlotOptionsDataLabels setFormatter(Object formatter) {
    this.formatter = formatter;
    return this;
  }

  public PlotOptionsDataLabels setRotation(double rotation) {
    this.rotation = rotation;
    return this;
  }

  public PlotOptionsDataLabels setX(int x) {
    this.x = x;
    return this;
  }

  public PlotOptionsDataLabels setY(int y) {
    this.y = y;
    return this;
  }

}