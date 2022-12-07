package at.mschreiber.adventofcode;

public class DirFile extends FsEntry {
  public DirFile(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public int size;
}
