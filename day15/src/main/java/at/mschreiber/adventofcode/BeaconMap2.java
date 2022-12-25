package at.mschreiber.adventofcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BeaconMap2 {

  private Map<Integer, Map<Integer, Character>> entries = new TreeMap<Integer, Map<Integer, Character>>();

  int currentX = 0;
  int currentY = 0;
  
  public List<Sensors> sensors = new ArrayList<BeaconMap2.Sensors>();

  class Sensors {
    public int x, y, range;
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

  
  public void findEmptySpot() {
    char[] entries = new char[4000000];
    for (int y = 85000; y < 4000000; y++) {
      System.out.println("Scanning " + y);
      for (Sensors sensor : sensors) {
        int xes = sensor.range - Math.abs(y - sensor.y);
        
        for (int a = 0; a <=xes; a++) {
          if ((sensor.x - a) >= 0 && (sensor.x - a) < 4000000) entries[sensor.x - a] = '#';
          if ((sensor.x + a) >= 0 && (sensor.x + a) < 4000000) entries[sensor.x + a] = '#';
        }
      }
      for (int a = 0; a< entries.length; a++) {
        if (entries[a] != '#') {
          System.out.println("x= "  + a);
          System.out.println("y= "  + y);
          y = 4000000;
          break;
        }
      }
      entries = new char[4000000];
    }
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
