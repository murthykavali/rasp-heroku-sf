package util.api;

import util.api.base.BaseObject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Point extends BaseObject {

  @XmlElement
  private Object x;

  @XmlElement
  private Object y;

  private Boolean selected, sliced;

  private String color;

  private String name;

  private String title;

  public Point() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public boolean getSelected() {
    return selected;
  }

  public Object getX() {
    return x;
  }

  public Object getY() {
    return y;
  }

  public boolean isSliced() {
    return sliced;
  }

  public Point setColor(String color) {
    this.color = color;
    return this;
  }

  public Point setName(String name) {
    this.name = name;
    return this;
  }

  public Point setSelected(boolean selected) {
    this.selected = selected;
    return this;
  }

  public Point setSliced(boolean sliced) {
    this.sliced = sliced;
    return this;
  }

  public Point setX(Object x) {
    this.x = x;
    return this;
  }

  public Point setY(Object y) {
    this.y = y;
    return this;
  }

}