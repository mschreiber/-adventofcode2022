package at.mschreiber.adventofcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day12Exercise1 {

  public static void main(String[] args) {
    String input =
          "abacccaaaacccccccccccaaaaaacccccaaaaaaccccaaacccccccccccccccccccccccccccccccccccccccccccaaaaa\r\n"
        + "abaaccaaaacccccccccccaaaaaaccccccaaaaaaaaaaaaaccccccccccccccccccccccccccccccccccccccccccaaaaa\r\n"
        + "abaaccaaaacccccccccccaaaaacccccaaaaaaaaaaaaaaaccccccccccccccccccccccccccccccccccccccccccaaaaa\r\n"
        + "abccccccccccccccccccccaaaaacccaaaaaaaaaaaaaaaacccccccccccccccccccccccccccaaaccccccccccccaaaaa\r\n"
        + "abccccccccccccccccccccaacaacccaaaaaaaaccaaaaaccccccccccccccccccccccccccccaaaccccccccccccaccaa\r\n"
        + "abcccccccccccccaacccaaaccccccaaaaaaaaaccaaaaaccccccccccccccccccccccccccccccacccccccccccccccca\r\n"
        + "abcccccccccccaaaaaaccaaaccacccccaaaaaaacccccccccccccccccccccccccciiiicccccccddddddccccccccccc\r\n"
        + "abcccccccccccaaaaaaccaaaaaaaccccaaaaaacccccaacccccccaaaccccccccciiiiiiiicccdddddddddacaaccccc\r\n"
        + "abccccccccccccaaaaaaaaaaaaacccccaaaaaaacaaaacccccccaaaacccccccchhiiiiiiiiicddddddddddaaaccccc\r\n"
        + "abcccccccccccaaaaaaaaaaaaaacccccccaaacccaaaaaacccccaaaaccccccchhhipppppiiiijjjjjjjddddaaccccc\r\n"
        + "abcccccccccccaaaaaaaaaaaaaaccccccccccccccaaaaaccccccaaaccccccchhhpppppppiijjjjjjjjjddeeaccccc\r\n"
        + "abcccccccccccccccccaaaaaaaacccccccccccccaaaaaccccccccccccccccchhppppppppppjjqqqjjjjjeeeaacccc\r\n"
        + "abccccccccccccccccccaaaaaaaacccccccccccccccaacccccccccccccccchhhpppuuuupppqqqqqqqjjjeeeaacccc\r\n"
        + "abcccccccccccccccccccaacccacccccccccccccccccccccccccccccccccchhhopuuuuuuppqqqqqqqjjjeeecccccc\r\n"
        + "abacccccccccccccaaacaaaccccccccccccccccccccccccccccaaccccccchhhhoouuuuuuuqvvvvvqqqjkeeecccccc\r\n"
        + "abaccccccccccccaaaaaacccccaaccccccccccccccccccccccaaaccccccchhhooouuuxxxuvvvvvvqqqkkeeecccccc\r\n"
        + "abaccccccccccccaaaaaacccaaaaaaccccccccccccccccccaaaaaaaaccchhhhooouuxxxxuvyyyvvqqqkkeeecccccc\r\n"
        + "abcccccccccccccaaaaacccaaaaaaaccccccccccccccccccaaaaaaaaccjjhooooouuxxxxyyyyyvvqqqkkeeecccccc\r\n"
        + "abccccccccccccccaaaaaacaaaaaaaccccccccaaaccccccccaaaaaaccjjjooootuuuxxxxyyyyyvvqqkkkeeecccccc\r\n"
        + "abccccccccccccccaaaaaaaaaaaaacccccccccaaaacccccccaaaaaacjjjooootttuxxxxxyyyyvvrrrkkkeeecccccc\r\n"
        + "SbccccccccccccccccccaaaaaaaaacccccccccaaaacccccccaaaaaacjjjoootttxxxEzzzzyyvvvrrrkkkfffcccccc\r\n"
        + "abcccccccccccaaacccccaaaaaaacaaaccccccaaaccccccccaaccaacjjjoootttxxxxxyyyyyyvvvrrkkkfffcccccc\r\n"
        + "abcccccccccaaaaaacccaaaaaacccaaacacccaacccccccccccccccccjjjoootttxxxxyxyyyyyywvvrrkkkfffccccc\r\n"
        + "abcccccccccaaaaaacccaaaaaaaaaaaaaaaccaaacaaacccccaacccccjjjnnnttttxxxxyyyyyyywwwrrkkkfffccccc\r\n"
        + "abcaacacccccaaaaacccaaacaaaaaaaaaaaccaaaaaaacccccaacaaacjjjnnnntttttxxyywwwwwwwwrrrlkfffccccc\r\n"
        + "abcaaaaccccaaaaacccccccccaacaaaaaaccccaaaaaacccccaaaaacccjjjnnnnnttttwwywwwwwwwrrrrllfffccccc\r\n"
        + "abaaaaaccccaaaaaccccccaaaaaccaaaaacaaaaaaaaccccaaaaaaccccjjjjinnnntttwwwwwsssrrrrrllllffccccc\r\n"
        + "abaaaaaaccccccccccccccaaaaacaaaaaacaaaaaaaaacccaaaaaaacccciiiiinnnntswwwwssssrrrrrlllfffccccc\r\n"
        + "abacaaaaccccccccccccccaaaaaacaaccccaaaaaaaaaaccccaaaaaaccccciiiinnnssswwsssssllllllllfffccccc\r\n"
        + "abccaaccccccccccccccccaaaaaaccccccccccaaacaaaccccaaccaacccccciiiinnsssssssmmllllllllfffaacccc\r\n"
        + "abccccccccccccccccccccaaaaaaccccccccccaaaccccccccaaccccccccccciiinnmsssssmmmmlllllgggffaacccc\r\n"
        + "abcccccccccccccccaccccccaaacccccccccccaaccccccccccccccccccccccciiimmmsssmmmmmgggggggggaaacccc\r\n"
        + "abcccccccccaaaaaaaaccccccccccccccccccccccccccccaaaaaccccccccccciiimmmmmmmmmgggggggggaaacccccc\r\n"
        + "abccccccccccaaaaaaccccccccccccccccccaacccccccccaaaaacccccccccccciiimmmmmmmhhggggcaaaaaaaccccc\r\n"
        + "abccccccccccaaaaaacccccccccccccccccaacccccccccaaaaaacccccccccccciihhmmmmhhhhgccccccccaacccccc\r\n"
        + "abccccaacaaaaaaaaaaccccccccccccccccaaaccccccccaaaaaaccccccccccccchhhhhhhhhhhaaccccccccccccccc\r\n"
        + "abccccaaaaaaaaaaaaaaccccccccccaaccaaaaccccccccaaaaaacccaaacccccccchhhhhhhhaaaaccccccccccccccc\r\n"
        + "abcccaaaaaaaaaaaaaaaccccccccaaaaaacaaaacacaccccaaaccccaaaacccccccccchhhhccccaaccccccccccaaaca\r\n"
        + "abcccaaaaaacacaaacccccccccccaaaaaaaaaaaaaaacccccccccccaaaacccccccccccaaaccccccccccccccccaaaaa\r\n"
        + "abcccccaaaacccaaaccccccccccaaaaaaaaaaaaaaaaccccccccccccaaacccccccccccaaacccccccccccccccccaaaa\r\n"
        + "abcccccaacccccaacccccccccccaaaaaaaaaaaaaccccccccccccccccccccccccccccccccccccccccccccccccaaaaa";

    String[] lines = input.split("\r\n");
    Set<Point> points = new HashSet<>();
    Point start = null;
    Point target = null;

    for (int i = 0; i < lines.length; i++) {
      for (int x = 0; x < lines[i].length(); x++) {
        char a = lines[i].charAt(x);
        Point point = new Point(x, i, a);
        if (a == 'S') {
          start = point;
          start.elevation = 'a';
        }
        if (a == 'E') {
          target = point;
          target.elevation = 'z';
        }
        points.add(point);
      }
    }

    Graph<Point> pointGraph = new Graph<>(points, getConnections(points));
    
    RouteFinder<Point> finder = new RouteFinder<>(pointGraph, new PointToPointScorer(), new PointToPointScorer());

    List<Point> route = finder.findRoute(start, target);
    for (Point point : route) {
      System.out.print(point.getId() + " ---> ");
    }
    System.out.println("");
    for (int i = 0; i < lines.length; i++) {
      for (int j = 0; j < lines[i].length(); j++) {
        final int y = i;
        final int x = j;
        if (route.stream().filter(it -> it.x == x && it.y == y).count() == 1) {
          System.out.print("X");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
    System.out.println(">>>>>>>" + (route.size() - 1));
  }

  public static Map<String, Set<String>> getConnections(Set<Point> points) {
    HashMap<String, Set<String>> connections = new HashMap<>();
    for (Point point : points) {
      connections.put(point.getId(), new HashSet<>());
      Point north = point.getPointNorth(points);
      Point south = point.getPointSouth(points);
      Point east = point.getPointEast(points);
      Point west = point.getPointWest(points);
      if (point.canWalkTo(north)) {
        connections.get(point.getId()).add(north.getId());
      }
      if (point.canWalkTo(south)) {
        connections.get(point.getId()).add(south.getId());
      }
      if (point.canWalkTo(east)) {
        connections.get(point.getId()).add(east.getId());
      }
      if (point.canWalkTo(west)) {
        connections.get(point.getId()).add(west.getId());
      }
    }
    return connections;

  }

}
