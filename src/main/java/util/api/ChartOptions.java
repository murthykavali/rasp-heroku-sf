package util.api;

import util.api.base.BaseObject;
import util.api.gauge.Pane;
import util.api.utils.JsonArray;

import javax.xml.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement(name = "chartOptions")
@XmlAccessorType(XmlAccessType.NONE)
public class ChartOptions extends BaseObject {

  @XmlTransient
  private Chart chart;

  @XmlElement
  private Credits credits;

  @XmlElement
  private Labels labels;

  @XmlElement
  private Legend legend;

  @XmlElement
  private PlotOptions plotOptions;

  // @XmlTransient
  @XmlElements(@XmlElement(name = "series", type = Series.class))
  private JsonArray<Series> series;

  @XmlElement
  private Title title;

  @XmlElement
  private Title subtitle;

  @XmlElement
  private Tooltip tooltip;

  @XmlElement
  private Axis xAxis;

  @XmlElement
  private Object yAxis;

  @XmlElement
  private Pane pane;

  public Chart getChart() {
    if (chart == null) {
      chart = new Chart();
    }
    return chart;
  }

  public Credits getCredits() {
    if (credits == null) {
      credits = new Credits();
    }
    return credits;
  }

  public Labels getLabels() {
    if (labels == null) {
      labels = new Labels();
    }
    return labels;
  }

  public Legend getLegend() {
    if (legend == null) {
      legend = new Legend();
    }
    return legend;
  }

  public PlotOptions getPlotOptions() {
    if (plotOptions == null) {
      plotOptions = new PlotOptions();
    }
    return plotOptions;
  }

  @XmlTransient
  public JsonArray<Series> getSeries() {
    if (series == null) {
      series = new JsonArray<Series>();
    }
    return series;
  }

  public void cleanSeries() {
    series = new JsonArray<>();
  }

  public Title getSubtitle() {
    if (subtitle == null) {
      subtitle = new Title();
    }
    return subtitle;
  }

  public Title getTitle() {
    if (title == null) {
      title = new Title();
    }
    return title;
  }

  public Tooltip getTooltip() {
    if (tooltip == null) {
      tooltip = new Tooltip();
    }
    return tooltip;
  }

  public Axis getXAxis() {
    if (xAxis == null) {
      xAxis = new Axis();
    }
    return xAxis;
  }

  public void setXAxis(Axis xAxis) {
    this.xAxis = xAxis;
  }

  public Object getYAxis() {
    if (yAxis == null) {
      yAxis = new Axis();
    }
    return yAxis;
  }

  public Object getYAxisList() {
    if (yAxis == null) {
      yAxis = new LinkedList<Axis>();
    }
    return yAxis;
  }

  public void setYAxis(List<Axis> yAxisLisList) {
    this.yAxis = yAxisLisList;
  }

  public Pane getPane() {
    if (pane == null) {
      pane = new Pane();
    }
    return pane;
  }

}
