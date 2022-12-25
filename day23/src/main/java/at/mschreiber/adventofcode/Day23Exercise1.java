package at.mschreiber.adventofcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day23Exercise1 {
 

  public static void main(String[] args) {
    elves = new ArrayList<Elve>();
    String[] lines = input.split("\r\n");
    for (int y = 0; y < lines.length; y++) {
      for (int x = 0; x < lines[y].length(); x++) {
        if (lines[y].charAt(x) == '#') {
          elves.add(new Elve(x, y));
        }
      }
    }

    for (int i = 0; i < 10; i++) {
      for (Elve elve : elves) {
        if (isSomeoneArround(elve)) {
          elve.proposeMove();
        }
      }
    }

  }

  private static boolean isSomeoneArround(Elve elve) {
    for (Elve e: elves) {
      if (e.x == elve.x+1 && e.y == elve.y) return true; // w
      if (e.x == elve.x+1 && e.y == elve.y+1) return true; // sw
      if (e.x == elve.x+1 && e.y == elve.y-1) return true; // nw
      
      if (e.x == elve.x-1 && e.y == elve.y) return true; // o
      if (e.x == elve.x-1 && e.y == elve.y+1) return true; // so
      if (e.x == elve.x-1 && e.y == elve.y-1) return true; // no
      
      if (e.x == elve.x && e.y == elve.y+1) return true; // n
      if (e.x == elve.x && e.y == elve.y-1) return true; // s
    }
    return false;
  }

  public static String input = "..............\r\n" + "..............\r\n" + ".......#......\r\n" + ".....###.#....\r\n"
      + "...#...#.#....\r\n" + "....#...##....\r\n" + "...#.###......\r\n" + "...##.#.##....\r\n" + "....#..#......\r\n"
      + "..............\r\n" + "..............\r\n" + "..............";
  private static List<Elve> elves;

}
