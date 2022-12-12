package at.mschreiber.adventofcode;

public class PointToPointScorer implements Scorer<Point> {

  @Override
  public double computeCost(Point from, Point to) {
    return Math.abs(from.x - to.x) + Math.abs(from.y - to.y);
  }

}
