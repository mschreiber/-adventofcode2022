package at.mschreiber.adventofcode;

import java.util.ArrayList;
import java.util.List;

public class Dir extends FsEntry {
  
  public Dir(Dir parent, String name) {
    this.name = name;
    this.parent = parent;
  }
  public Dir parent;
  public List<FsEntry> files = new ArrayList<>();
  public int size = 0;
}