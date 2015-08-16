package util.api.axis;

import util.api.base.BaseObject;
import util.api.base.Style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(namespace = "axis")
public class AxisLabels extends BaseObject {

  @XmlElement
  private Double rotation;

  @XmlElement
  private String align;

  private String color;
  private int distance, step;
  private double y;

  private Style style;

  public double getY() {
    return y;
  }

  public AxisLabels setY(double y) {
    this.y = y;
    return this;
  }

  public String getColor() {
    return color;
  }

  public AxisLabels setColor(String color) {
    this.color = color;
    return this;
  }

  public int getDistance() {
    return distance;
  }

  public AxisLabels setDistance(int distance) {
    this.distance = distance;
    return this;
  }

  public int getStep() {
    return step;
  }

  public AxisLabels setStep(int step) {
    this.step = step;
    return this;
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

  public Double getRotation() {
    return rotation;
  }

  public AxisLabels setAlign(String align) {
    this.align = align;
    return this;
  }

  public AxisLabels setRotation(double rotation) {
    this.rotation = rotation;
    return this;
  }

}