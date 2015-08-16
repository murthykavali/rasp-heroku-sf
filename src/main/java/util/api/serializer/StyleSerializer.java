package util.api.serializer;

import util.api.base.Style;

import java.util.Map;

public class StyleSerializer extends Serializer<Style> {

  @Override
  public Map<String, String> getProperties(Style instance) {
    return instance.getProperties();
  }

}
