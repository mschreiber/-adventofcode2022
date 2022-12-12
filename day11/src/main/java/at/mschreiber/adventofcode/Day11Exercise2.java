package at.mschreiber.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day11Exercise2 {

  public static void main(String[] args) {
    List<Monkey> monkeys = new ArrayList<>();

    Monkey monkey0 = new Monkey() {

      @Override
      public long operation(long old) {
        return old * 2;
      }
    };
    monkey0.items = new ArrayList<>(Arrays.asList(98l, 70l, 75l, 80l, 84l, 89l, 55l, 98l));
    monkey0.divisible = 11;
    monkey0.monkeyWhenFalse = 4;
    monkey0.monkeyWhenTrue = 1;

    monkeys.add(monkey0);

    Monkey monkey1 = new Monkey() {

      @Override
      public long operation(long old) {
        return old * old;
      }
    };
    monkey1.items = new ArrayList<>(Arrays.asList(59l));
    monkey1.divisible = 19;
    monkey1.monkeyWhenFalse = 3;
    monkey1.monkeyWhenTrue = 7;

    monkeys.add(monkey1);

    Monkey monkey2 = new Monkey() {

      @Override
      public long operation(long old) {
        return old  + 6;
      }
    };
    monkey2.items = new ArrayList<>(Arrays.asList(77l, 95l, 54l, 65l, 89l));
    monkey2.divisible = 7;
    monkey2.monkeyWhenFalse = 5;
    monkey2.monkeyWhenTrue = 0;

    monkeys.add(monkey2);

    Monkey monkey3 = new Monkey() {

      @Override
      public long operation(long old) {
        return old  + 2;
      }
    };
    monkey3.items = new ArrayList<>(Arrays.asList(71l, 64l, 75l));
    monkey3.divisible = 17;
    monkey3.monkeyWhenFalse = 2;
    monkey3.monkeyWhenTrue = 6;

    monkeys.add(monkey3);

    Monkey monkey4 = new Monkey() {

      @Override
      public long operation(long old) {
        return old  * 11;
      }
    };
    monkey4.items = new ArrayList<>(Arrays.asList(74l, 55l, 87l, 98l));
    monkey4.divisible = 3;
    monkey4.monkeyWhenFalse = 7;
    monkey4.monkeyWhenTrue = 1;

    monkeys.add(monkey4);
    
    Monkey monkey5 = new Monkey() {

      @Override
      public long operation(long old) {
        return old + 7;
      }
    };
    monkey5.items = new ArrayList<>(Arrays.asList(90l, 98l, 85l, 52l, 91l, 60l));
    monkey5.divisible = 5;
    monkey5.monkeyWhenFalse = 4;
    monkey5.monkeyWhenTrue = 0;

    monkeys.add(monkey5);

    Monkey monkey6 = new Monkey() {

      @Override
      public long operation(long old) {
        return old + 1;
      }
    };
    monkey6.items = new ArrayList<>(Arrays.asList(99l, 51l));
    monkey6.divisible = 13;
    monkey6.monkeyWhenFalse = 2;
    monkey6.monkeyWhenTrue = 5;

    monkeys.add(monkey6);

    Monkey monkey7 = new Monkey() {

      @Override
      public long operation(long old) {
        return old + 5;
      }
    };
    monkey7.items = new ArrayList<>(Arrays.asList(98l, 94l, 59l, 76l, 51l, 65l, 75l));
    monkey7.divisible = 2;
    monkey7.monkeyWhenFalse = 6;
    monkey7.monkeyWhenTrue = 3;

    monkeys.add(monkey7);
    
    // "KGV" von den divisibles
    int bigDivisor = monkeys.stream().map(it -> it.divisible).reduce((a, b) -> a * b).get();

    for (int i = 0; i < 10000; i++) {
      for (int x = 0; x < monkeys.size(); x++) {
        Monkey m = monkeys.get(x);
        for (Long item : m.items) {
          long newValue =  m.operation(item) % (long)bigDivisor;
          if (newValue % m.divisible == 0) {
            monkeys.get(m.monkeyWhenTrue).items.add(Long.valueOf(newValue));
          } else {
            monkeys.get(m.monkeyWhenFalse).items.add(Long.valueOf(newValue));
          }
          m.inspectedItems++;
        }
        m.items.clear();
      }
    }
   
    monkeys.sort(new Comparator<Monkey>() {

      @Override
      public int compare(Monkey o1, Monkey o2) {
        return (int) (o2.inspectedItems - o1.inspectedItems);
      }
    });
    
    System.out.println(monkeys.get(0).inspectedItems * monkeys.get(1).inspectedItems);
    
  }

}
