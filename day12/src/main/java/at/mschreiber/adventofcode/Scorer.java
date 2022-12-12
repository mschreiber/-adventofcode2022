package at.mschreiber.adventofcode;

public interface Scorer<T extends GraphNode> {
  double computeCost(T from, T to);
}
