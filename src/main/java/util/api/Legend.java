package util.api;

import util.api.base.BaseObject;
import util.api.base.Style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Legend extends BaseObject {

  private Boolean reversed;

  private Boolean enabled;

  private String align;

  private String layout;

  private String verticalAlign;

  private String backgroundColor;

  private String borderRadius;

  private String borderColor;

  private Style itemStyle;

  @XmlElement
  private Integer x;

  @XmlElement
  private Integer y;

  private boolean  floating;

  public Legend setMargin(int margin) {
    this.margin = margin;
    return this;
  }

  private int margin;

  public Legend setFloating(boolean floating) {
    this.floating = floating;
    return this;
  }

  public Boolean getReversed() {
    return reversed;
  }

  public boolean isFloating() {
    return floating;
  }

  public int getMargin() {
    return margin;
  }

  public String getAlign() {
    return align;
  }

  public boolean getEnabled() {
    return enabled;
  }

  public String getLayout() {
    return layout;
  }

  public String getVerticalAlign() {
    return verticalAlign;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public boolean isReversed() {
    return reversed;
  }

  @XmlElement
  public Legend setAlign(String align) {
    this.align = align;
    return this;
  }

  public Legend setEnabled(boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  @XmlElement
  public Legend setLayout(String layout) {
    this.layout = layout;
    return this;
  }

  public Legend setReversed(boolean reversed) {
    this.reversed = reversed;
    return this;
  }

  @XmlElement
  public Legend setVerticalAlign(String verticalAlign) {
    this.verticalAlign = verticalAlign;
    return this;
  }

  public Legend setX(int x) {
    this.x = x;
    return this;
  }

  public Legend setY(int y) {
    this.y = y;
    return this;
  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public Legend setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  public Style getItemStyle() {
    if (itemStyle == null) {
      itemStyle = new Style();
    }
    return itemStyle;
  }

  public void setItemStyle(Style itemStyle) {
    this.itemStyle = itemStyle;
  }

  public String getBorderRadius() {
    return borderRadius;
  }

  public Legend setBorderRadius(String borderRadius) {
    this.borderRadius = borderRadius;
    return this;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }
}
