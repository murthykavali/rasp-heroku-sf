package util.api.plotoption;

import util.api.base.BaseObject;

import javax.xml.bind.annotation.XmlElement;

public class PlotOptionsStates extends BaseObject {

  @XmlElement(type = PlotStatesSelect.class)
  private PlotStatesSelect select;

  public PlotStatesSelect getSelect() {
    if (select == null) {
      select = new PlotStatesSelect();
    }
    return select;
  }
}