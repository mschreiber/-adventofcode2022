package at.mschreiber.adventofcode;

public class RockFactory {

  
  public int i = 0;
  private Rock[] rocks;
  
  public RockFactory() {
    // -
    Rock rockType1 = new Rock(new RockPart(0, 0), new RockPart(1, 0), new RockPart(2, 0), new RockPart(3, 0));
    // +
    Rock rockType2 = new Rock(new RockPart(1, 0), new RockPart(0, -1), new RockPart(1, -1), new RockPart(2, -1),
        new RockPart(1, -2));
    // mirrored L
    Rock rockType3 = new Rock(new RockPart(2, 0), new RockPart(2, -1), new RockPart(0, -2), new RockPart(1, -2),
        new RockPart(2, -2));
    // I
    Rock rockType4 = new Rock(new RockPart(0, 0), new RockPart(0, -1), new RockPart(0, -2), new RockPart(0, -3));
    // block o
    Rock rockType5 = new Rock(new RockPart(0, 0), new RockPart(1, 0), new RockPart(0, -1), new RockPart(1, -1));
    
    rocks = new Rock[] {rockType1, rockType2, rockType3, rockType4, rockType5};
  }
  
  public Rock getNextRock() {
    Rock rock = rocks[i];
    i++;
    if (i == rocks.length) {
      i = 0;
    }
    return rock.createClone();
  }

}
