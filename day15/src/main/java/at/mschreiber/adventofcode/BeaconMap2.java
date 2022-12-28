package at.mschreiber.adventofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BeaconMap2 {

  private Map<Integer, Map<Integer, Character>> entries = new TreeMap<Integer, Map<Integer, Character>>();

  int currentX = 0;
  int currentY = 0;

  static final int MAX_Y = 4000000;

  public List<Sensors> sensors = new ArrayList<BeaconMap2.Sensors>();

  class Sensors {
    public int x, y, range;

    public Range getRangeForAbsoluteY(int absY) {
      if (absY > (y - range) && absY < (y + range)) {
        int minX = x - (range - Math.abs(y - absY));
        int maxX = x + (range - Math.abs(y - absY));
        return new Range(Math.max(0,  minX), Math.min(MAX_Y, maxX));
      }
      return new Range(-1, -1);
    }
  }

  class Range {
    int minX, maxX;

    public Range(int minX, int maxX) {
      this.minX = minX;
      this.maxX = maxX;
    }

  }

  public void putSensorAndBeacon(int xS, int yS, int xB, int yB) {
    if (!entries.containsKey(yS)) {
      entries.put(yS, new TreeMap<Integer, Character>());
    }
    if (!entries.containsKey(yB)) {
      entries.put(yB, new TreeMap<Integer, Character>());
    }
    entries.get(yS).put(xS, 'S');
    entries.get(yB).put(xB, 'B');
    int divX = Math.abs(xS - xB);
    int divY = Math.abs(yS - yB);
    int range = divX + divY;
    Sensors b = new Sensors();
    b.range = range;
    b.x = xS;
    b.y = yS;
    sensors.add(b);
  }

  public List<Range> getOverlappingRanges(List<Range> allRanges, Range it) {
    List<Range> matchRanges = new ArrayList<>();
    for (Range range : allRanges) {
     if ((it.minX <= range.minX && it.maxX >= range.minX - 1) || 
         (it.minX >= range.minX && it.maxX <= range.maxX) ||
         (it.minX >= range.minX + 1 && it.minX <= range.maxX)) {
       matchRanges.add(range);
     }
    }
    return matchRanges;
  }
  
  public void findEmptySpot() {
    for (int y = 0; y < MAX_Y; y++) {
      final int yy = y;
      List<Range> ranges = sensors.stream().map(it -> it.getRangeForAbsoluteY(yy))
          .filter(it -> it.minX >=0).collect(Collectors.toList());
      int last = 0;
      int now = ranges.size();
      while (last != now) {
        last = ranges.size();
        List<Range> toMerge = getOverlappingRanges(ranges, ranges.get(0));
        if (toMerge.size() > 1) {
          int minX = toMerge.stream().mapToInt(it -> it.minX).min().getAsInt();
          int maxX = toMerge.stream().mapToInt(it -> it.maxX).max().getAsInt();
          Range mergedRange = new Range(minX, maxX);
          ranges.removeAll(toMerge);
          ranges.add(mergedRange);
          now = ranges.size();
        }
      }
      if (ranges.size() > 1) {
        for (Range range : ranges) {
          System.out.println(range.minX + " - " + range.maxX);
        }
        System.out.println("Found in row:" + y);
        ranges.sort((o1, o2) -> o1.minX - o2.maxX);
        int x = ranges.get(0).maxX + 1;
        System.out.println("Found in column: " + x);
        long result = (long)x * MAX_Y + y;
        System.out.println();
        System.out.println("Result: " + result);
        break;
      }
    }
  }

}
