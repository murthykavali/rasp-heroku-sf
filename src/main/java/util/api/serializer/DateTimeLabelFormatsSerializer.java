package util.api.serializer;

import util.api.format.DateTimeLabelFormats;
import util.api.format.DateTimeLabelFormats.TimeUnit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DateTimeLabelFormatsSerializer extends Serializer<DateTimeLabelFormats> {

  @Override
  public Map<String, String> getProperties(DateTimeLabelFormats instance) {
    Map<TimeUnit, String> map = instance.getFormats();
    Map<String, String> r = new HashMap<String, String>();
    for (Entry<TimeUnit, String> e : map.entrySet()) {
      r.put(e.getKey().name().toLowerCase(), e.getValue());
    }
    return r;
  }

}
