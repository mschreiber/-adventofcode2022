package at.mschreiber.adventofcode;

import java.util.ArrayList;

public abstract class Monkey {

  public ArrayList<Long> items = new ArrayList<>();

  public long inspectedItems = 0;

  public abstract long operation(long old);

  public int monkeyWhenTrue = 0;
  
  public int monkeyWhenFalse = 0;
  
  public int divisible = 0;

}
