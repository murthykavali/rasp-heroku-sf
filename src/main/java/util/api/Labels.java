package util.api;

import util.api.base.BaseObject;
import util.api.label.LabelsItems;
import util.api.utils.JsonArray;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(namespace = "chart-options")
public class Labels extends BaseObject {

  @XmlTransient
  private JsonArray<LabelsItems> items;

  public Labels() {
  }

  @XmlTransient
  public JsonArray<LabelsItems> getItems() {
    if (items == null) {
      items = new JsonArray<LabelsItems>();
    }

    return items;
  }

}
