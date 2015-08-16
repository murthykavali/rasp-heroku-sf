package util.api;

import util.api.base.BaseObject;
import util.api.utils.JsonArray;

/**
 * Created by Murthy Kavali
 */
public class DataSeries extends BaseObject {

  private String name;

  private JsonArray<Double> data;

  public DataSeries() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JsonArray<Double> getData() {
    if (data == null) {
      this.data = new JsonArray<>();
    }
    return data;
  }

  public void setData(JsonArray<Double> data) {
    this.data = data;
  }
}
