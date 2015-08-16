package util.api.shared;

public enum SeriesType {
  TABLE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitTable(this, in);
    }
  },
  COLUMN {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitColumn(this, in);
    }
  },
  AREA {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitArea(this, in);
    }
  },
  AREASPLINE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitAreaspline(this, in);
    }
  },
  BAR {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitBar(this, in);
    }
  },
  FLAGS {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitBar(this, in);
    }
  },
  LINE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitLine(this, in);
    }
  },
  PIE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitPie(this, in);
    }
  },
  SCATTER {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitScatter(this, in);
    }
  },
  GAUGE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitScatter(this, in);
    }
  },
  SPLINE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitSpline(this, in);
    }
  },
  BUBBLE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitSpline(this, in);
    }
  },
  COLUMN_LINE {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitSpline(this, in);
    }
  },
  STACKED_COLUMN {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitSpline(this, in);
    }
  },
  STACKED_BAR {
    @Override
    public <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in) {
      return visitor.visitSpline(this, in);
    }
  };


  public abstract <I, O> O accept(SeriesTypeVisitor<I, O> visitor, I in);

  /**
   * To read from String
   *
   * @param text
   * @return
   */
  public static SeriesType fromString(String text) {
    if (text != null) {
      for (SeriesType b : SeriesType.values()) {
        if (text.equalsIgnoreCase(b.toString())) {
          return b;
        }
      }
    }
    return null;
  }

}