package util.api.gauge;

public class RadialGradient {

  private double cx, cy, r;

  public RadialGradient() {
  }

  public double getCx() {
    return cx;
  }

  public RadialGradient setCx(double cx) {
    this.cx = cx;
    return this;
  }

  public double getCy() {
    return cy;
  }

  public RadialGradient setCy(double cy) {
    this.cy = cy;
    return this;
  }

  public double getR() {
    return r;
  }

  public RadialGradient setR(double r) {
    this.r = r;
    return this;
  }
}
