
package at.mschreiber.aventofcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandMap2 {

  private Map<Integer, List<String>> entries = new HashMap<Integer, List<String>>();

  public static int maxX = 1066; // 2*maxx
  public static int maxY = 170;

  int currentX = 0;
  int currentY = 0;

  public SandMap2() {
    for (int y = 0; y < maxY; y++) {
      entries.put(y, new ArrayList<String>());
      for (int x = 0; x < maxX; x++) {
        entries.get(y).add(".");
      }
    }
    maxY = 0;
  }

  public void addMapEntry(String start, String end) {
    int startX = Integer.parseInt(start.split(",")[0]);
    int startY = Integer.parseInt(start.split(",")[1]);
    int endX = Integer.parseInt(end.split(",")[0]);
    int endY = Integer.parseInt(end.split(",")[1]);
    if (startX > endX) {
      int x = startX;
      startX = endX;
      endX = x;
    }
    if (startY > endY) {
      int y = startY;
      startY = endY;
      endY = y;
    }
    if (endY > maxY) {
      maxY = endY;
    }
    for (int i = startX; i <= endX; i++) {
      entries.get(startY).set(i, "#");
    }
    for (int i = startY; i <= endY; i++) {
      entries.get(i).set(startX, "#");
    }
  }

  public boolean fall() {
    while (canFallDown(currentX, currentY)) {
      currentY++;
    }
    if (canFallLeftDown(currentX, currentY)) {
      currentY++;
      currentX--;
      fall();
    }
    if (canFallRightDown(currentX, currentY)) {
      currentY++;
      currentX++;
      fall();
    }
    List<String> a = entries.get(currentY);
    a.set(currentX, "o");
    entries.put(currentY, a);
    if (currentX == 500 && currentY == 0) {
      return true;
    }
    return false;
  }

  public void setFloor() {
    System.err.println(maxY + " " + maxX);
    List<String> floor = entries.get(maxY + 2);
    for (int i = 0; i < floor.size(); i++) {
      floor.set(i, "#");
    }
  }

  public void sand() {
    int count = 0;
    boolean isOut = false;

    do {
      currentX = 500;
      currentY = 0;
      isOut = fall();
      count++;

    } while (!isOut);
    System.out.println(">>> " + count);
  }

  public boolean canFallRightDown(int x, int y) {
    return ".".equals(entries.get(y + 1).get(x + 1));
  }

  public boolean canFallLeftDown(int x, int y) {
    return ".".equals(entries.get(y + 1).get(x - 1));
  }

  public boolean canFallDown(int x, int y) {
    return ".".equals(entries.get(y + 1).get(x));
  }

  public void print() {
    for (int i = 0; i < entries.keySet().size(); i++) {
      for (String str : entries.get(i)) {
        System.out.print(str);
      }
      System.out.println();
    }
  }

}
