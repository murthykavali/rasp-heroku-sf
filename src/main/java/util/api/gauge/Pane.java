package util.api.gauge;

import util.api.utils.JsonArray;

import java.util.ArrayList;

/**
 * Created by Murthy Kavali
 */
public class Pane {

  private String startAngle, endAngle;
  private JsonArray<Background> background;
  private ArrayList<String> center;

  public Pane() {
  }

  public String getStartAngle() {
    return startAngle;
  }

  public void setStartAngle(String startAngle) {
    this.startAngle = startAngle;
  }

  public String getEndAngle() {
    return endAngle;
  }

  public Pane setEndAngle(String endAngle) {
    this.endAngle = endAngle;
    return this;
  }

  public JsonArray<Background> getBackground() {
    return background;
  }

  public void setBackground(JsonArray<Background> background) {
    this.background = background;
  }

  public ArrayList<String> getCenter() {
    return center;
  }

  public void setCenter(ArrayList<String> center) {
    this.center = center;
  }
}
