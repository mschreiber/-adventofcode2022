package at.mschreiber.adventofcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day25Exercise1 {

  static Map<Character, Long> snafuToDecMap = new HashMap<>();
  static Map<Long, String> decSnafuMap = new HashMap<>();

  public static void main(String[] args) {
    snafuToDecMap.put('1', 1l);
    snafuToDecMap.put('2', 2l);
    snafuToDecMap.put('0', 0l);
    snafuToDecMap.put('=', -2l);
    snafuToDecMap.put('-', -1l);

    decSnafuMap.put(2l, "2");
    decSnafuMap.put(1l, "1");
    decSnafuMap.put(0l, "0");
    decSnafuMap.put(-1l, "-");
    decSnafuMap.put(-2l, "=");

    String[] lines = input.split("\r\n");
    long value = Arrays.asList(lines).stream().mapToLong(it -> toDecimal(it)).sum();
    System.out.println(value);

    long pow5 = 1;
    while (Math.abs(value) > maxValue(pow5)) {
      pow5 *= 5;
    }
    System.out.print(asSnafu(value, pow5));

  }

  private static long toDecimal(String s) {
    long a = 0;
    long base = 1;
    char[] reverseString = new StringBuilder(s).reverse().toString().toCharArray();

    for (int i = 1; i <= reverseString.length; i++) {
      a = a + snafuToDecMap.get(reverseString[i - 1]) * base;
      base = base * 5;
    }
    return a;
  }

  private static String asSnafu(long n, long pow5) {
    if (n >= -2 && n <= 2) {
      return decSnafuMap.get(n);
    }
    for (long d : new long[] { -2l, -1l, 0l, 1l, 2l }) {
      long nn = n - pow5 * d;
      if (Math.abs(nn) <= maxValue(Math.floorDiv(pow5, 5))) {
        return decSnafuMap.get(d) + asSnafu(n - pow5 * d, Math.floorDiv(pow5, 5));
      }
    }
    throw new RuntimeException();
  }

  private static long maxValue(long a) {
    if (a == 1) {
      return 2;
    }
    return a * 2 + maxValue(a / 5);
  }

  public static String input = "21-2-0=1-\r\n" + "2-11220-==01==2\r\n" + "1-2200=1=0--\r\n" + "1-10--22=-=-2\r\n"
      + "21120\r\n" + "1=0==\r\n" + "10=022\r\n" + "222--0=10202-0=2\r\n" + "1=01==1\r\n" + "1021\r\n"
      + "20--221-222000\r\n" + "12-1=02--0221=-1\r\n" + "11-=-1===2-\r\n" + "1-101-=\r\n" + "11-21100-===0=-\r\n"
      + "1-\r\n" + "2-=\r\n" + "1=0=-0\r\n" + "10011001=0\r\n" + "2--\r\n" + "2120=202121\r\n" + "1=0\r\n" + "10==-\r\n"
      + "22=02102=2-\r\n" + "11=0-\r\n" + "1==0-1-1=0\r\n" + "21===-=-0\r\n" + "11220-=2-=20=201\r\n" + "2=001\r\n"
      + "1=20--=-\r\n" + "1===00\r\n" + "12-22012012-21=\r\n" + "2=--=20-111=-\r\n" + "221\r\n" + "12=0-=-=\r\n"
      + "2---102\r\n" + "1=1\r\n" + "202011021=\r\n" + "21=0-0=--1102-1-\r\n" + "1=--2102220-2==221=\r\n"
      + "1=10021-=21\r\n" + "11=2=202120021-=11\r\n" + "1-1012=122=\r\n" + "12-01=0=1=0-11=0--\r\n" + "100-20=1=-\r\n"
      + "110=0-\r\n" + "1=-102\r\n" + "2-221=2--010-01\r\n" + "12-01220\r\n" + "10--10====1-20=-00\r\n" + "110\r\n"
      + "1=00==22\r\n" + "212-1-222010=2==2=1\r\n" + "1=011=1=0\r\n" + "1-0\r\n" + "1-11221=000-=200221\r\n"
      + "221-00=2=-1-\r\n" + "122=1=2\r\n" + "101\r\n" + "1==2=11=-10\r\n" + "220-1--=21=2-02==\r\n"
      + "21--02--0-==1\r\n" + "1==0=11012\r\n" + "122\r\n" + "1000=20=0012\r\n" + "22-=0-011110=\r\n"
      + "2=21-1-20212--=\r\n" + "1-=202010\r\n" + "1-0=-===21-100\r\n" + "1-22--21\r\n" + "1-12011122=02=-21\r\n"
      + "1-01-2=1000-01=21-\r\n" + "12-1-1=1=-=01=-1=\r\n" + "202\r\n" + "1==-1-00\r\n" + "1201--=-=-\r\n"
      + "1=-1--==1122=2=12\r\n" + "201020\r\n" + "1=-11-0111-00-2\r\n" + "10==1==-1=2\r\n" + "120=1002-00122\r\n"
      + "1=12\r\n" + "2122110\r\n" + "1112-10=12==\r\n" + "1=02--0-=\r\n" + "2-0021-==112=10=\r\n"
      + "2212-022-==10==\r\n" + "1001200-1-=\r\n" + "2=000-=00--11\r\n" + "1==0122120\r\n" + "1=1==-=2210-\r\n"
      + "1-02===012\r\n" + "12-21-11-1-10\r\n" + "2=10==-=11=-\r\n" + "22---2=2012-22100\r\n" + "1=-0=--\r\n"
      + "1=20--2=1212===12=\r\n" + "1=\r\n" + "2-\r\n" + "1-=2=2-00211-2=0\r\n" + "1=222---02=00211-\r\n"
      + "112==10\r\n" + "2-0=101-10=02\r\n" + "11212101-\r\n" + "10-=\r\n" + "1=01=2=011=--0\r\n"
      + "21=0-10==22-201\r\n" + "1-20=-1=121-\r\n" + "120=\r\n" + "1-=01=-1-\r\n" + "11--1-11=0=221\r\n"
      + "1-=120==\r\n" + "20--002=\r\n" + "12--22\r\n" + "200-=\r\n" + "1=1--21=111=--=011-1\r\n" + "12011=0=--11\r\n"
      + "1-2\r\n" + "121==1\r\n" + "10220-==-";

}
