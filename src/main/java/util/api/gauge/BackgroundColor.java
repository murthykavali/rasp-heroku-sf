package util.api.gauge;

import util.api.utils.JsonArray;

/**
 * Murthy Kavali
 */
public class BackgroundColor {
  private RadialGradient radialGradient;
  private JsonArray<String[]> stops;

  public BackgroundColor() {
  }

  public RadialGradient getRadialGradient() {
    if (radialGradient == null) {
      radialGradient = new RadialGradient();
    }
    return radialGradient;
  }

  public BackgroundColor setRadialGradient(RadialGradient radialGradient) {
    this.radialGradient = radialGradient;
    return this;
  }

  public JsonArray<String[]> getStops() {
    if (stops == null) {
      stops = new JsonArray<String[]>();
    }
    return stops;
  }

  public BackgroundColor setStops(JsonArray<String[]> stops) {
    this.stops = stops;
    return this;
  }
}
