package util.api.gauge;

/**
 * Created by Murthy Kavali
 */
public class GaugeOptions {

  private DataLabels dataLabels;
  private Dial dial;
  private Pivot pivot;

  public GaugeOptions() {
  }

  public DataLabels getDataLabels() {
    if (null == dataLabels) {
      dataLabels = new DataLabels();
    }
    return dataLabels;
  }

  public void setDataLabels(DataLabels dataLabels) {
    this.dataLabels = dataLabels;
  }

  public Dial getDial() {
    if (null == dial) {
      this.dial = new Dial();
    }
    return dial;
  }

  public void setDial(Dial dial) {
    this.dial = dial;
  }

  public Pivot getPivot() {
    if (null == pivot) {
      this.pivot = new Pivot();
    }
    return pivot;
  }

  public void setPivot(Pivot pivot) {
    this.pivot = pivot;
  }
}
