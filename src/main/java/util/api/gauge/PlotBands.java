package util.api.gauge;

import util.api.base.BaseObject;

/**
 * Created by Murthy Kavali
 */
public class PlotBands extends BaseObject {

  private String color;
  private int from, to, thickness;

  public PlotBands(String color, int from, int to, int thickness) {
    this.color = color;
    this.from = from;
    this.to = to;
    this.thickness = thickness;

  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getFrom() {
    return from;
  }

  public void setFrom(int from) {
    this.from = from;
  }

  public int getTo() {
    return to;
  }

  public void setTo(int to) {
    this.to = to;
  }

  public int getThickness() {
    return thickness;
  }

  public void setThickness(int thickness) {
    this.thickness = thickness;
  }
}
