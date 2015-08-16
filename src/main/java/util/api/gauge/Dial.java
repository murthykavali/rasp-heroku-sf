package util.api.gauge;

/**
 * Created by Murthy Kavali
 */
public class Dial {

    /*
    radius: '100%',
	backgroundColor: 'silver',
	borderColor: 'black',
	borderWidth: 1,
	baseWidth: 10,
	topWidth: 1,
	baseLength: '90%', // of radius
	rearLength: '50%'
     */

  private String radius, backgroundColor, borderColor, baseLength, rearLength;

  private double borderWidth, baseWidth, topWidth;


  public Dial() {
  }

  public String getRadius() {
    return radius;
  }

  public void setRadius(String radius) {
    this.radius = radius;
  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }

  public String getBaseLength() {
    return baseLength;
  }

  public void setBaseLength(String baseLength) {
    this.baseLength = baseLength;
  }

  public String getRearLength() {
    return rearLength;
  }

  public void setRearLength(String rearLength) {
    this.rearLength = rearLength;
  }

  public double getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(double borderWidth) {
    this.borderWidth = borderWidth;
  }

  public double getBaseWidth() {
    return baseWidth;
  }

  public void setBaseWidth(double baseWidth) {
    this.baseWidth = baseWidth;
  }

  public double getTopWidth() {
    return topWidth;
  }

  public void setTopWidth(double topWidth) {
    this.topWidth = topWidth;
  }
}
