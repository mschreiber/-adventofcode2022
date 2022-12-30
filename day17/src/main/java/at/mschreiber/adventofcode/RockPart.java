package at.mschreiber.adventofcode;

public class RockPart {

  public long x;
  public long y;

  public RockPart(long x, long y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int hashCode() {
    return Long.valueOf(x).hashCode() + Long.valueOf(y).hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return ((RockPart)obj).x == this.x && ((RockPart)obj).y == y;
  }
  
  
}
