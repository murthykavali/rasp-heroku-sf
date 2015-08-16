package util.api.base;

import util.api.shared.Jsonify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.NONE)
public class BaseObject implements Jsonify {


  public BaseObject() {
    super();
  }

  @Override
  public String toJson() {
    return GsonHelper.toJson(this);
  }

}