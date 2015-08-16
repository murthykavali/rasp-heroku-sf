package util.api;

import util.api.base.BaseObject;
import util.api.gauge.GaugeOptions;
import util.api.plotoption.PlotOptionsSeries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class PlotOptions extends BaseObject {

  @XmlElement
  private final PlotOptionsSeries area, areaspline, line, pie, series, spline;

  private GaugeOptions gauge;

  private PlotOptionsSeries column, bar;

  public PlotOptions() {
    area = new PlotOptionsSeries();
    areaspline = new PlotOptionsSeries();
    bar = new PlotOptionsSeries();
    column = new PlotOptionsSeries();
    line = new PlotOptionsSeries();
    pie = new PlotOptionsSeries();
    series = new PlotOptionsSeries();
    spline = new PlotOptionsSeries();
  }

  public PlotOptionsSeries getArea() {
    return area;
  }

  public PlotOptionsSeries getAreaspline() {
    return areaspline;
  }

  public PlotOptionsSeries getBar() {
    return bar;
  }

  public PlotOptionsSeries getColumn() {
    return column;
  }

  public PlotOptionsSeries getLine() {
    return line;
  }

  public PlotOptionsSeries getPie() {
    return pie;
  }

  public PlotOptionsSeries getSeries() {
    return series;
  }

  public PlotOptionsSeries getSpline() {
    return spline;
  }

  public GaugeOptions getGauge() {
    if (null == gauge) {
      this.gauge = new GaugeOptions();
    }
    return gauge;
  }

  public void setGauge(GaugeOptions gauge) {
    this.gauge = gauge;
  }
}
