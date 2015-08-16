package util.api;

import util.api.axis.AxisLabels;
import util.api.axis.AxisPlotLines;
import util.api.base.BaseObject;
import util.api.format.DateTimeLabelFormats;
import util.api.gauge.PlotBands;
import util.api.utils.ArrayString;
import util.api.utils.JsonArray;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.NONE)
public class Axis extends BaseObject {

  @XmlElement
  private Integer maxZoom;

  @XmlElement
  private Boolean startOnTick;

  @XmlElement
  private Double tickInterval;


  private Double tickWidth, tickLength, minorTickWidth, minorTickLength;

  private double minTickInterval;

  private String tickPosition, tickColor, minorTickPosition, minorTickInterval, minorTickColor;

  @XmlElement
  private Boolean showFirstLabel;

  @XmlElement
  private Double min;

  @XmlElement
  private Double max;

  @XmlElement
  private String type;

  @XmlElement(type = AxisLabels.class)
  private AxisLabels labels;

  private DateTimeLabelFormats dateTimeLabelFormats;

  @XmlTransient
  private ArrayString categories;

  private JsonArray<AxisPlotLines> plotLines;

  private JsonArray<PlotBands> plotBands;

  private Title title;

  private boolean opposite;

  private String gridLineColor;

  private double lineWidth;

  public Axis() {
    labels = null;
    dateTimeLabelFormats = null;
    categories = null;
    title = null;
  }


  public double getLineWidth() {
    return lineWidth;
  }


  public Axis setLineWidth(double lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

  public String getGridLineColor() {
    return gridLineColor;
  }

  public Axis setGridLineColor(String gridLineColor) {
    this.gridLineColor = gridLineColor;
    return this;
  }

  @XmlTransient
  public ArrayString getCategories() {
    if (categories == null) {
      categories = new ArrayString();
    }
    return categories;
  }

  public void setCategories(ArrayString arrayString) {
    this.categories = arrayString;
  }

  public int getCategoriesLength() {
    return (categories != null) ? categories.size() : 0;
  }


  public DateTimeLabelFormats getDateTimeLabelFormats() {
    if (dateTimeLabelFormats == null) {
      dateTimeLabelFormats = new DateTimeLabelFormats();
    }
    return dateTimeLabelFormats;
  }

  public AxisLabels getLabels() {
    if (labels == null) {
      labels = new AxisLabels();
    }
    return labels;
  }

  public double getMax() {
    return max;
  }

  public int getMaxZoom() {
    return maxZoom;
  }

  public double getMin() {
    return min;
  }

  public JsonArray<AxisPlotLines> getPlotLines() {
    return plotLines;
  }

  public double getTickInterval() {
    return tickInterval;
  }

  public Title getTitle() {
    if (title == null) {
      title = new Title();
    }
    return title;
  }

  public String getType() {
    return type;
  }

  public boolean isShowFirstLabel() {
    return showFirstLabel;
  }

  public boolean isStartOnTick() {
    return startOnTick;
  }

  public Axis setMax(double max) {
    this.max = max;
    return this;
  }

  public Axis setMaxZoom(int maxZoom) {
    this.maxZoom = maxZoom;
    return this;
  }

  public Axis setMin(double min) {
    this.min = min;
    return this;
  }

  public Axis setPlotLines(JsonArray<AxisPlotLines> plotLines) {
    this.plotLines = plotLines;
    return this;
  }

  public JsonArray<PlotBands> getPlotBands() {
    if (plotBands == null) {
      this.plotBands = new JsonArray<PlotBands>();
    }
    return plotBands;
  }

  public Axis setPlotBands(JsonArray<PlotBands> plotBands) {
    this.plotBands = plotBands;
    return this;

  }

  public Axis setShowFirstLabel(boolean showFirstLabel) {
    this.showFirstLabel = showFirstLabel;
    return this;
  }

  public Axis setStartOnTick(boolean startOnTick) {
    this.startOnTick = startOnTick;
    return this;
  }

  public Axis setTickInterval(double tickInterval) {
    this.tickInterval = tickInterval;
    return this;
  }

  public Axis setType(String type) {
    this.type = type;
    return this;
  }

  public Double getTickWidth() {
    return tickWidth;
  }

  public void setTickWidth(Double tickWidth) {
    this.tickWidth = tickWidth;
  }

  public String getTickPosition() {
    return tickPosition;
  }

  public void setTickPosition(String tickPosition) {
    this.tickPosition = tickPosition;
  }

  public String getMinorTickPosition() {
    return minorTickPosition;
  }


  public void setMinorTickPosition(String minorTickPosition) {
    this.minorTickPosition = minorTickPosition;
  }

  public String getMinorTickInterval() {
    return minorTickInterval;
  }

  public void setMinorTickInterval(String minorTickInterval) {
    this.minorTickInterval = minorTickInterval;
  }

  public String getMinorTickColor() {
    return minorTickColor;
  }

  public void setMinorTickColor(String minorTickColor) {
    this.minorTickColor = minorTickColor;
  }

  public String getTickColor() {
    return tickColor;
  }

  public void setTickColor(String tickColor) {
    this.tickColor = tickColor;
  }

  public Double getTickLength() {
    return tickLength;
  }

  public void setTickLength(Double tickLength) {
    this.tickLength = tickLength;
  }

  public Double getMinorTickWidth() {
    return minorTickWidth;
  }

  public void setMinorTickWidth(Double minorTickWidth) {
    this.minorTickWidth = minorTickWidth;
  }

  public Double getMinorTickLength() {
    return minorTickLength;
  }

  public void setMinorTickLength(Double minorTickLength) {
    this.minorTickLength = minorTickLength;
  }

  public Axis setTitle(Title title) {
    this.title = title;
    return this;
  }

  public double getMinTickInterval() {
    return minTickInterval;
  }

  public Axis setMinTickInterval(double minTickInterval) {
    this.minTickInterval = minTickInterval;
    return this;
  }

  public boolean isOpposite() {
    return opposite;
  }

  public void setOpposite(boolean opposite) {
    this.opposite = opposite;
  }
}
