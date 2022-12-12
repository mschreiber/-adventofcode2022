package at.mschreiber.adventofcode;

import java.util.Set;

public class Point implements GraphNode {

  public char elevation;
  public int x;
  public int y;

  public Point(int x, int y, char elevation) {
    this.x = x;
    this.y = y;
    this.elevation = elevation;
  }

  @Override
  public String getId() {
    return x + ":" + y;
  }

  public Point getPointNorth(Set<Point> allPoints) {
    return getPointWithCoordinates(x, y - 1, allPoints);
  }

  public Point getPointEast(Set<Point> allPoints) {
    return getPointWithCoordinates(x + 1, y, allPoints);
  }

  public Point getPointSouth(Set<Point> allPoints) {
    return getPointWithCoordinates(x, y + 1, allPoints);
  }

  public Point getPointWest(Set<Point> allPoints) {
    return getPointWithCoordinates(x - 1, y, allPoints);
  }

  public boolean canWalkTo(Point point) {
    return point != null && (point.elevation <= this.elevation || point.elevation - 1 == this.elevation);
  }

  private Point getPointWithCoordinates(int x, int y, Set<Point> points) {
    return points.stream().filter(it -> it.x == x && it.y == y).findFirst().orElse(null);
  }
}
