package at.mschreiber.adventofcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BeaconMap {

  private Map<Integer, Map<Integer, Character>> entries = new TreeMap<Integer, Map<Integer, Character>>();

  int currentX = 0;
  int currentY = 0;


  public void putSensorAndBeacon(int xS, int yS, int xB, int yB) {
    if (!entries.containsKey(yS)) {
      entries.put(yS, new TreeMap<Integer, Character>());
    }
    if (!entries.containsKey(yB)) {
      entries.put(yB, new TreeMap<Integer, Character>());
    }
    entries.get(yS).put(xS, 'S');
    entries.get(yB).put(xB, 'B');
    beaconRange(xS, yS, xB, yB);
  }


  public void beaconRange(int xS, int yS, int xB, int yB) {
    int divX = Math.abs(xS - xB);
    int divY = Math.abs(yS - yB);
    int range = divX + divY;
    
    int xes = range - Math.abs(2000000 - yS);
    
    for (int a = 0; a <=xes; a++) {
      replaceIfNotSorB(xS - a, 2000000);
      replaceIfNotSorB(xS + a, 2000000);
    }
//    for (int a = 0; a <= range; a++) {
//      for (int b = range - a; b >= 0; b--) {
//        replaceIfNotSorB(xS - a, yS - b);
//        replaceIfNotSorB(xS + a, yS - b);
//        replaceIfNotSorB(xS + a, yS + b);
//        replaceIfNotSorB(xS - a, yS + b);
//      }
//    }
  }

  public void replaceIfNotSorB(int x, int y) {
    if (!entries.containsKey(y)) {
      entries.put(y, new TreeMap<Integer, Character>());
      
    }
    if (entries.get(y).get(x) == null || ('S' != entries.get(y).get(x) && 'B' != entries.get(y).get(x))) {
      entries.get(y).put(x, '#');
    }
  }

  public int howManyInRow(int y) {
    int count = 0;
    for(Integer entry: entries.get(y).keySet()) {
      if ('#' == entries.get(y).get(entry)) {
        count++;
      }
    }
    return count;
  }
  
  public void print() {
    for (Integer keyY : entries.keySet()) {
      for (Integer keyX : entries.get(keyY).keySet()) {
        System.out.print(entries.get(keyY).get(keyX));
      }
      System.out.println();
    }
  }

}
