package util.api;

import util.api.base.BaseObject;
import util.api.plotoption.PlotMarkerStates;
import util.api.serie.SeriesCenter;
import util.api.utils.JsonArray;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(namespace = "chartoptions")
public class Series extends BaseObject {

  @XmlElement(type = PlotMarkerStates.class)
  private PlotMarkerStates states;

  @XmlElements(@XmlElement(name = "data", type = Point.class))
  private Object data;

  @XmlElement
  private String color;

  @XmlElement
  private String name;

  @XmlElement
  private String type;

  private int width;

  private String shape;

  private int yAxis;

  @XmlElement
  private String size;

  private SeriesCenter center;

  public String getShape() {
    return shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }


  public String getCenterX() {
    return (center != null) ? center.getX() : null;
  }

  public String getCenterY() {
    return (center != null) ? center.getY() : null;
  }

  public String getColor() {
    return color;
  }

  @SuppressWarnings("unchecked")
  public JsonArray<Point> getData() {
    if (data == null) {
      data = new JsonArray<Point>();
    }
    return (JsonArray<Point>) data;
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public PlotMarkerStates getStates() {
    if (states == null) {
      states = new PlotMarkerStates();
    }
    return states;
  }

  public String getType() {
    return type;
  }

  public int getyAxis() {
    return yAxis;
  }

  public void setyAxis(int yAxis) {
    this.yAxis = yAxis;
  }

  public Series setCenter(String x, String y) {
    if (center == null) {
      center = new SeriesCenter();
    }
    center.setX(x);
    center.setY(y);
    return this;
  }

  public Series setColor(String color) {
    this.color = color;
    return this;
  }

  @XmlTransient
  public Series setData(JsonArray<Point> data) {
    this.data = data;
    return this;
  }

  public void setData(Object data){
    this.data = data;
  }

  public void setDataAsObject(Object object) {
    this.data = object;
  }

  public Object getDataAsObject() {
    return  this.data;
  }

  public Series setName(String name) {
    this.name = name;
    return this;
  }

  public Series setSize(String size) {
    this.size = size;
    return this;
  }

  public Series setStates(PlotMarkerStates states) {
    this.states = states;
    return this;
  }

  public Series setType(String type) {
    this.type = type;
    return this;
  }


}
