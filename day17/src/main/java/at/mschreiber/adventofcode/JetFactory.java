package at.mschreiber.adventofcode;

public class JetFactory {

  private String jets;
  private int i = 0;
  
  public JetFactory(String jets) {
    this.jets = jets;
  }
  
  public int getNextPushDirection() {
    char x = jets.charAt(i);
    i++;
    if (i == jets.length()) {
      i = 0;
    }
    return (x == '>'?1:-1);
  }
  
}
