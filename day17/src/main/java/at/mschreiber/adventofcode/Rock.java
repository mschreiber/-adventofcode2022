package at.mschreiber.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rock {

  public List<RockPart> parts = new ArrayList<RockPart>();

  public static long maxX = 6;
  public static long minX = 0;

  public Rock(RockPart... parts) {
    this.parts.addAll(Arrays.asList(parts));
  }

  public void setPositionInMap(long x, long y) {
    parts.stream().forEach(it -> {
      it.x = x + it.x;
      it.y = y + it.y;
    });

  }

  public void jetStream(int nextPushDirection, List<Rock> stoppedRocks) {
    if (nextPushDirection > 0 && getMaxX() + 1 <= maxX) {
      parts.stream().forEach(it-> it.x++);
    }
    if (nextPushDirection < 0 && getMinX() - 1 >= minX) {
      parts.stream().forEach(it-> it.x--);
    }
    // revert if needed
    if (blockedByRocks(stoppedRocks) && nextPushDirection > 0) {
      parts.stream().forEach(it-> it.x--);
    }
    if (blockedByRocks(stoppedRocks) && nextPushDirection < 0) {
      parts.stream().forEach(it-> it.x++);
    }
  }

  public boolean fall(List<Rock> stoppedRocks) {
    parts.stream().forEach(it-> it.y--);
    if (blockedByRocks(stoppedRocks)  || onGround()) {
      parts.stream().forEach(it-> it.y++);
      return false;
    }
    return true;
  }

  private boolean onGround() {
    boolean a =  parts.stream().mapToLong(it -> it.y).max().getAsLong() < 0;
    return a;
  }

  private boolean blockedByRocks(List<Rock> stoppedRocks) {
    return stoppedRocks.stream().flatMap(it -> it.parts.stream()).anyMatch(it -> parts.contains(it));
  }

  long getMinX() {
    return parts.stream().mapToLong(it -> it.x).min().getAsLong();
  }

  long getMaxX() {
    return parts.stream().mapToLong(it -> it.x).max().getAsLong();
  }

  long getMaxY() {
    return parts.stream().mapToLong(it -> it.y).max().getAsLong();
  }

  public long height() {
    return Math.abs(parts.stream().mapToLong(it -> it.y).max().getAsLong() - parts.stream().mapToLong(it -> it.y).min().getAsLong());
  }

  public Rock createClone() {
    Rock newRock = new Rock();
    for (RockPart rockPart : parts) {
      newRock.parts.add(new RockPart(rockPart.x, rockPart.y));
    }
    return newRock;
  }
  
}
