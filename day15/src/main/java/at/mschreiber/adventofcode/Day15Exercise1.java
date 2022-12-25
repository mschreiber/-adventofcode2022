package at.mschreiber.adventofcode;

public class Day15Exercise1 {

  public static void main(String[] args) {
    BeaconMap map = new BeaconMap();
    String[] lines = input.split("\r\n");
    for (String line : lines) {
      int xS = Integer.parseInt(line.substring(line.indexOf("=") + 1, line.indexOf(",")));
      line = line.substring(line.indexOf(","));
      int yS = Integer.parseInt(line.substring(line.indexOf("=") + 1, line.indexOf(":")));
      line = line.substring(line.indexOf(":"));
      int xB = Integer.parseInt(line.substring(line.indexOf("=") + 1, line.indexOf(",")));
      line = line.substring(line.indexOf(","));
      int yB = Integer.parseInt(line.substring(line.indexOf("=") + 1));
      map.putSensorAndBeacon(xS, yS, xB, yB);
    }

    System.out.println(map.howManyInRow(2000000));;
  }

  public static String input = "Sensor at x=3772068, y=2853720: closest beacon is at x=4068389, y=2345925\r\n"
      + "Sensor at x=78607, y=2544104: closest beacon is at x=-152196, y=4183739\r\n"
      + "Sensor at x=3239531, y=3939220: closest beacon is at x=3568548, y=4206192\r\n"
      + "Sensor at x=339124, y=989831: closest beacon is at x=570292, y=1048239\r\n"
      + "Sensor at x=3957534, y=2132743: closest beacon is at x=3897332, y=2000000\r\n"
      + "Sensor at x=1882965, y=3426126: closest beacon is at x=2580484, y=3654136\r\n"
      + "Sensor at x=1159443, y=3861139: closest beacon is at x=2580484, y=3654136\r\n"
      + "Sensor at x=2433461, y=287013: closest beacon is at x=2088099, y=-190228\r\n"
      + "Sensor at x=3004122, y=3483833: closest beacon is at x=2580484, y=3654136\r\n"
      + "Sensor at x=3571821, y=799602: closest beacon is at x=3897332, y=2000000\r\n"
      + "Sensor at x=2376562, y=1539540: closest beacon is at x=2700909, y=2519581\r\n"
      + "Sensor at x=785113, y=1273008: closest beacon is at x=570292, y=1048239\r\n"
      + "Sensor at x=1990787, y=38164: closest beacon is at x=2088099, y=-190228\r\n"
      + "Sensor at x=3993778, y=3482849: closest beacon is at x=4247709, y=3561264\r\n"
      + "Sensor at x=3821391, y=3986080: closest beacon is at x=3568548, y=4206192\r\n"
      + "Sensor at x=2703294, y=3999015: closest beacon is at x=2580484, y=3654136\r\n"
      + "Sensor at x=1448314, y=2210094: closest beacon is at x=2700909, y=2519581\r\n"
      + "Sensor at x=3351224, y=2364892: closest beacon is at x=4068389, y=2345925\r\n"
      + "Sensor at x=196419, y=3491556: closest beacon is at x=-152196, y=4183739\r\n"
      + "Sensor at x=175004, y=138614: closest beacon is at x=570292, y=1048239\r\n"
      + "Sensor at x=1618460, y=806488: closest beacon is at x=570292, y=1048239\r\n"
      + "Sensor at x=3974730, y=1940193: closest beacon is at x=3897332, y=2000000\r\n"
      + "Sensor at x=2995314, y=2961775: closest beacon is at x=2700909, y=2519581\r\n"
      + "Sensor at x=105378, y=1513086: closest beacon is at x=570292, y=1048239\r\n"
      + "Sensor at x=3576958, y=3665667: closest beacon is at x=3568548, y=4206192\r\n"
      + "Sensor at x=2712265, y=2155055: closest beacon is at x=2700909, y=2519581";

}