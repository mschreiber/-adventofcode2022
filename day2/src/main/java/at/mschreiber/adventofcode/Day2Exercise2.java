package at.mschreiber.adventofcode;

import java.util.HashMap;
import java.util.Map;

public class Day2Exercise2 {

  public static void main(String[] args) {

    String input = "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A X\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n"
        + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n"
        + "A Y\r\n" + "C Z\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "C Y\r\n" + "C X\r\n" + "C Z\r\n"
        + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "A Z\r\n" + "A X\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n"
        + "B X\r\n" + "C X\r\n" + "B Y\r\n" + "C X\r\n" + "C Z\r\n" + "C Y\r\n" + "C Z\r\n" + "A Y\r\n" + "A Z\r\n"
        + "C Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B X\r\n" + "A Z\r\n" + "B X\r\n" + "C Z\r\n" + "C Z\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n"
        + "C Y\r\n" + "A X\r\n" + "C Y\r\n" + "C Y\r\n" + "B Z\r\n" + "B Y\r\n" + "C X\r\n" + "A X\r\n" + "A Z\r\n"
        + "C Z\r\n" + "C X\r\n" + "B Y\r\n" + "A X\r\n" + "C X\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "C X\r\n"
        + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n" + "B X\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n"
        + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Z\r\n" + "C X\r\n" + "A X\r\n" + "A Z\r\n" + "A Z\r\n" + "A Y\r\n"
        + "C Z\r\n" + "C Y\r\n" + "A X\r\n" + "C Z\r\n" + "C Y\r\n" + "A Z\r\n" + "C X\r\n" + "B X\r\n" + "A Z\r\n"
        + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "C X\r\n" + "A Z\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n"
        + "C X\r\n" + "A Z\r\n" + "C X\r\n" + "C X\r\n" + "B Y\r\n" + "B Z\r\n" + "A X\r\n" + "B X\r\n" + "C Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "C Z\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Y\r\n" + "A Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Z\r\n"
        + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "C Z\r\n" + "A X\r\n" + "A Y\r\n" + "C X\r\n"
        + "B X\r\n" + "A Z\r\n" + "C X\r\n" + "A Y\r\n" + "A X\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Z\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "A Z\r\n" + "A X\r\n"
        + "B Y\r\n" + "A X\r\n" + "C X\r\n" + "C X\r\n" + "A X\r\n" + "B X\r\n" + "C X\r\n" + "C Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "A Z\r\n"
        + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "A Y\r\n" + "B Y\r\n" + "A Y\r\n" + "C Y\r\n" + "C X\r\n" + "A X\r\n"
        + "B Y\r\n" + "C X\r\n" + "B Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Y\r\n" + "B Z\r\n" + "B Z\r\n" + "A Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "A X\r\n" + "B Z\r\n" + "C X\r\n" + "C Y\r\n" + "B Y\r\n"
        + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Y\r\n" + "A Y\r\n" + "C Y\r\n"
        + "A Z\r\n" + "C Y\r\n" + "B X\r\n" + "C X\r\n" + "A X\r\n" + "A Y\r\n" + "A Z\r\n" + "A Y\r\n" + "A Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "C Z\r\n" + "A Y\r\n" + "C Y\r\n" + "A Z\r\n"
        + "A Z\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "C X\r\n"
        + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "C Y\r\n" + "A Y\r\n" + "A Z\r\n" + "C X\r\n" + "A Z\r\n" + "A Y\r\n" + "C Y\r\n" + "A Z\r\n" + "C Y\r\n"
        + "C Y\r\n" + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C Y\r\n" + "C Y\r\n" + "C Y\r\n" + "A X\r\n"
        + "B X\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n"
        + "B Z\r\n" + "C X\r\n" + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Z\r\n" + "C Z\r\n" + "A Z\r\n"
        + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Z\r\n" + "A Y\r\n" + "C X\r\n" + "A Z\r\n" + "B X\r\n"
        + "C Y\r\n" + "A Z\r\n" + "C Z\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "B X\r\n" + "C Z\r\n" + "A Z\r\n" + "B Y\r\n"
        + "C Z\r\n" + "A Z\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n" + "C X\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A Y\r\n"
        + "A X\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n" + "A X\r\n" + "B Y\r\n" + "C Y\r\n"
        + "C Y\r\n" + "A Z\r\n" + "C Y\r\n" + "C X\r\n" + "B Y\r\n" + "A X\r\n" + "A X\r\n" + "C Y\r\n" + "A X\r\n"
        + "C Z\r\n" + "C X\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n"
        + "B Y\r\n" + "A Z\r\n" + "A Y\r\n" + "A X\r\n" + "C X\r\n" + "C X\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n"
        + "C Z\r\n" + "A Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C X\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "A X\r\n" + "C Y\r\n" + "A Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C X\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "C Z\r\n" + "C Z\r\n"
        + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B Z\r\n" + "C Z\r\n" + "A Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "A X\r\n" + "A X\r\n" + "B X\r\n" + "B Y\r\n" + "C Z\r\n" + "C Y\r\n" + "C Y\r\n"
        + "C Y\r\n" + "A X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C X\r\n" + "B Y\r\n" + "A X\r\n" + "A Z\r\n"
        + "C Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "A X\r\n"
        + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n" + "B Z\r\n" + "C Y\r\n" + "C Y\r\n" + "C X\r\n"
        + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Y\r\n" + "A Y\r\n" + "A Z\r\n"
        + "B Y\r\n" + "C X\r\n" + "B X\r\n" + "B X\r\n" + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n"
        + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C X\r\n" + "A Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C X\r\n"
        + "B X\r\n" + "C Z\r\n" + "C X\r\n" + "A X\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n"
        + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "C Y\r\n" + "A X\r\n" + "C Y\r\n" + "C Y\r\n" + "B Y\r\n"
        + "A Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A Y\r\n"
        + "A Z\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "C X\r\n" + "A Y\r\n" + "C Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "A Z\r\n" + "B X\r\n"
        + "C Z\r\n" + "B Y\r\n" + "A X\r\n" + "C Y\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n"
        + "C X\r\n" + "A Z\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n"
        + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "C X\r\n" + "B Z\r\n" + "A Y\r\n" + "B Y\r\n" + "B Z\r\n" + "C Y\r\n"
        + "A Z\r\n" + "B X\r\n" + "C Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Z\r\n" + "A Y\r\n" + "A X\r\n" + "C X\r\n"
        + "B Y\r\n" + "C Y\r\n" + "A X\r\n" + "A Z\r\n" + "B Y\r\n" + "A Y\r\n" + "B Z\r\n" + "C X\r\n" + "B Y\r\n"
        + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "B X\r\n" + "A X\r\n"
        + "B Y\r\n" + "B Z\r\n" + "A Z\r\n" + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "C Y\r\n" + "C Z\r\n" + "B X\r\n"
        + "A Z\r\n" + "B X\r\n" + "A Z\r\n" + "A Z\r\n" + "C Y\r\n" + "B Z\r\n" + "C Y\r\n" + "C Y\r\n" + "B Y\r\n"
        + "C X\r\n" + "B X\r\n" + "A X\r\n" + "A Z\r\n" + "C Z\r\n" + "B X\r\n" + "B X\r\n" + "B X\r\n" + "B Z\r\n"
        + "B Y\r\n" + "B Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A X\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "C X\r\n" + "B Y\r\n"
        + "C Z\r\n" + "C Y\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "C X\r\n" + "C X\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Z\r\n"
        + "B Y\r\n" + "C X\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C X\r\n" + "B X\r\n" + "C Y\r\n"
        + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "C X\r\n" + "B X\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "A Z\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "C X\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "B Z\r\n" + "B Y\r\n"
        + "C X\r\n" + "A Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n"
        + "C Z\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "C Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n"
        + "A X\r\n" + "B X\r\n" + "C X\r\n" + "B X\r\n" + "A X\r\n" + "B Y\r\n" + "A X\r\n" + "C Z\r\n" + "B Y\r\n"
        + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Y\r\n" + "C Z\r\n" + "B Z\r\n" + "A Z\r\n"
        + "C X\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "C X\r\n" + "A Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "A Y\r\n" + "B X\r\n" + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C X\r\n" + "B Z\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Y\r\n" + "A Y\r\n" + "A X\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "B Z\r\n" + "C Z\r\n" + "B X\r\n" + "C Z\r\n" + "B X\r\n" + "B Y\r\n"
        + "A Y\r\n" + "B X\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "A X\r\n" + "C Z\r\n" + "B Y\r\n" + "A Y\r\n"
        + "C Z\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "C Y\r\n" + "C X\r\n" + "C Y\r\n" + "C X\r\n"
        + "A X\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "C X\r\n" + "A Y\r\n" + "A Z\r\n"
        + "C Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "A Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B X\r\n" + "A X\r\n" + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A Z\r\n" + "C Y\r\n" + "C Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "A Z\r\n" + "C Z\r\n" + "A Z\r\n" + "B Y\r\n"
        + "C X\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "C X\r\n" + "A Z\r\n"
        + "C Z\r\n" + "C Z\r\n" + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n"
        + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A X\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n" + "A Z\r\n" + "C Z\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "A X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "C Z\r\n" + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "A X\r\n" + "C X\r\n" + "A X\r\n" + "C Y\r\n"
        + "A Y\r\n" + "B X\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "B Y\r\n"
        + "C X\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n" + "A X\r\n" + "C X\r\n" + "C Y\r\n" + "A Z\r\n" + "A X\r\n"
        + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "A Y\r\n" + "A Z\r\n" + "A Y\r\n" + "C X\r\n" + "C X\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n" + "C Y\r\n" + "A X\r\n" + "A Z\r\n"
        + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Y\r\n" + "C X\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B X\r\n"
        + "A Z\r\n" + "C Y\r\n" + "C Y\r\n" + "A X\r\n" + "C X\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n" + "A X\r\n"
        + "C Z\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n"
        + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A X\r\n" + "B X\r\n" + "C X\r\n" + "C Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C X\r\n" + "C Z\r\n" + "A Z\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Y\r\n"
        + "A X\r\n" + "C Z\r\n" + "C Y\r\n" + "C Z\r\n" + "C Z\r\n" + "C Z\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n"
        + "A Z\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B X\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "C Z\r\n" + "B X\r\n"
        + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "B X\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "A X\r\n" + "B Y\r\n" + "C X\r\n" + "B X\r\n" + "B Y\r\n" + "C Z\r\n"
        + "B X\r\n" + "C X\r\n" + "C Y\r\n" + "C X\r\n" + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B X\r\n" + "A Z\r\n" + "B X\r\n" + "B X\r\n" + "A Z\r\n" + "C Z\r\n" + "A Z\r\n" + "B X\r\n"
        + "B Z\r\n" + "C X\r\n" + "C Y\r\n" + "A X\r\n" + "A Z\r\n" + "B X\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n"
        + "A Z\r\n" + "A X\r\n" + "B X\r\n" + "B X\r\n" + "C X\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n"
        + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "B X\r\n" + "C X\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "A Y\r\n" + "C X\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n"
        + "A Y\r\n" + "C Z\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n" + "C Z\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n"
        + "B Y\r\n" + "C X\r\n" + "C Y\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "B Z\r\n" + "A Y\r\n" + "A Z\r\n"
        + "C X\r\n" + "A X\r\n" + "B X\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "C X\r\n"
        + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A Y\r\n" + "B X\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A Z\r\n"
        + "B X\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "A X\r\n" + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "A Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "B Y\r\n"
        + "B X\r\n" + "A Z\r\n" + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Z\r\n" + "C Y\r\n" + "C X\r\n" + "C Y\r\n"
        + "A Y\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "C X\r\n" + "C Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n"
        + "B X\r\n" + "B Y\r\n" + "A X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A X\r\n"
        + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "C Y\r\n" + "A Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "A X\r\n" + "C Y\r\n" + "C Z\r\n" + "C Y\r\n" + "C Z\r\n" + "C Z\r\n" + "C Y\r\n" + "B X\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C X\r\n" + "A Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Y\r\n"
        + "A Y\r\n" + "C X\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A X\r\n" + "B Z\r\n" + "B X\r\n" + "A X\r\n"
        + "A Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C X\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B X\r\n" + "C X\r\n" + "C Y\r\n"
        + "B Y\r\n" + "A Z\r\n" + "A Y\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "A X\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B X\r\n"
        + "C X\r\n" + "C Y\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n"
        + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "C X\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B X\r\n" + "A X\r\n" + "C Z\r\n" + "C X\r\n" + "A Z\r\n" + "A Y\r\n" + "A X\r\n" + "A Z\r\n" + "A Z\r\n"
        + "A Z\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "B X\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n"
        + "A X\r\n" + "A Z\r\n" + "A Z\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "C X\r\n" + "A X\r\n" + "B Y\r\n"
        + "C Y\r\n" + "C X\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "A Z\r\n"
        + "A Z\r\n" + "A X\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "C X\r\n" + "C Y\r\n" + "B Y\r\n" + "C X\r\n"
        + "B X\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A X\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "A X\r\n" + "A Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "C X\r\n" + "A Z\r\n" + "C Z\r\n" + "A X\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n"
        + "C X\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n"
        + "A Z\r\n" + "B Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Y\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n"
        + "B X\r\n" + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "C X\r\n" + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n"
        + "C Z\r\n" + "B Y\r\n" + "B X\r\n" + "A Z\r\n" + "C X\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n"
        + "C Y\r\n" + "A Y\r\n" + "A X\r\n" + "C Y\r\n" + "A X\r\n" + "A Z\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n"
        + "C X\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "A Y\r\n" + "C Z\r\n" + "C Z\r\n"
        + "C Z\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n" + "A X\r\n" + "C X\r\n"
        + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "A X\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n"
        + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "C Z\r\n" + "A Y\r\n" + "A Z\r\n"
        + "B Y\r\n" + "C X\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n"
        + "C X\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B X\r\n" + "C X\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Y\r\n" + "B X\r\n"
        + "C Y\r\n" + "B Y\r\n" + "C X\r\n" + "C X\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n"
        + "C Y\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "C Z\r\n" + "C Z\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "B X\r\n" + "A X\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n" + "A Z\r\n"
        + "C X\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "B Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "B X\r\n" + "A Z\r\n" + "A X\r\n" + "B X\r\n" + "B Y\r\n" + "A X\r\n"
        + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n"
        + "C Z\r\n" + "C Z\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C X\r\n" + "A Y\r\n" + "C Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "C Z\r\n" + "A Y\r\n" + "B X\r\n" + "A Z\r\n" + "A Z\r\n"
        + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Y\r\n" + "A Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A Y\r\n"
        + "B Y\r\n" + "C X\r\n" + "A X\r\n" + "A Y\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n" + "B X\r\n" + "C Y\r\n"
        + "C Z\r\n" + "C X\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B Z\r\n" + "C Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "A X\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "C Y\r\n" + "C Y\r\n" + "C Z\r\n" + "B X\r\n" + "A Z\r\n" + "C X\r\n"
        + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "C Z\r\n"
        + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "A X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n"
        + "B X\r\n" + "B X\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B X\r\n" + "C X\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n"
        + "A Z\r\n" + "B X\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "C Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C X\r\n" + "A X\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "A Y\r\n"
        + "C Z\r\n" + "C X\r\n" + "C Y\r\n" + "B Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Z\r\n"
        + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "B X\r\n" + "C Z\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "C Y\r\n"
        + "B Y\r\n" + "B X\r\n" + "A Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n"
        + "B X\r\n" + "B X\r\n" + "B Y\r\n" + "A Y\r\n" + "C X\r\n" + "C Y\r\n" + "B Y\r\n" + "C X\r\n" + "B X\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "C Z\r\n" + "B Y\r\n" + "C Z\r\n" + "A X\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n"
        + "A Y\r\n" + "C X\r\n" + "C X\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A X\r\n" + "C X\r\n" + "A Z\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "C Y\r\n" + "A Z\r\n" + "A X\r\n" + "C X\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C X\r\n" + "B X\r\n" + "B X\r\n" + "C X\r\n" + "A Z\r\n" + "C X\r\n" + "C X\r\n" + "C Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n"
        + "A X\r\n" + "A Y\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B X\r\n" + "A Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B X\r\n"
        + "C Y\r\n" + "B Y\r\n" + "A X\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "A Y\r\n" + "C X\r\n"
        + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n" + "A Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "A X\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n"
        + "C Y\r\n" + "A Y\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "C X\r\n" + "C Z\r\n" + "C X\r\n" + "B X\r\n" + "C Z\r\n" + "B Z\r\n"
        + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "C Z\r\n" + "A X\r\n" + "A Z\r\n"
        + "B Z\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "C Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B X\r\n" + "B X\r\n" + "B X\r\n" + "A Z\r\n"
        + "C Z\r\n" + "C Y\r\n" + "B X\r\n" + "C Z\r\n" + "A X\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B X\r\n"
        + "B Y\r\n" + "A Z\r\n" + "A X\r\n" + "A X\r\n" + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "C Y\r\n" + "A X\r\n" + "A Z\r\n" + "C Y\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "A Z\r\n"
        + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "A X\r\n" + "C Z\r\n" + "C Z\r\n" + "B X\r\n"
        + "C X\r\n" + "B Y\r\n" + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "C Z\r\n" + "C X\r\n" + "C Z\r\n" + "A X\r\n"
        + "C Z\r\n" + "B X\r\n" + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n"
        + "C Y\r\n" + "C Z\r\n" + "B X\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "B X\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "C Y\r\n" + "C Y\r\n"
        + "A Z\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "B Y\r\n" + "A Z\r\n"
        + "C X\r\n" + "C Y\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C X\r\n" + "B Y\r\n" + "C Y\r\n"
        + "C Z\r\n" + "C Y\r\n" + "C X\r\n" + "C Y\r\n" + "B X\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "C Z\r\n" + "B X\r\n" + "B Y\r\n" + "C X\r\n" + "C Y\r\n" + "C Y\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n"
        + "C Y\r\n" + "C Z\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n" + "A Y\r\n" + "A Z\r\n" + "C Z\r\n" + "C Z\r\n"
        + "C Y\r\n" + "A X\r\n" + "C X\r\n" + "C Z\r\n" + "C Y\r\n" + "C Z\r\n" + "B X\r\n" + "C Z\r\n" + "B Y\r\n"
        + "C X\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A X\r\n" + "C Z\r\n"
        + "A Z\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A X\r\n" + "B Y\r\n" + "B Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B Z\r\n" + "A Z\r\n" + "C X\r\n"
        + "B Y\r\n" + "A Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "C X\r\n" + "B Y\r\n" + "B Z\r\n" + "C Y\r\n"
        + "B Y\r\n" + "A Y\r\n" + "C X\r\n" + "A Z\r\n" + "A Z\r\n" + "B X\r\n" + "C Y\r\n" + "B Y\r\n" + "B Z\r\n"
        + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "C Y\r\n" + "A Z\r\n" + "A Y\r\n"
        + "A Z\r\n" + "C Z\r\n" + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n" + "A Y\r\n"
        + "B X\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "C Y\r\n" + "B X\r\n" + "C Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "C X\r\n" + "A X\r\n" + "A Z\r\n" + "A X\r\n" + "A X\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "B Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n"
        + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "C Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n"
        + "C Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C X\r\n" + "C Y\r\n"
        + "A Z\r\n" + "B Z\r\n" + "B Y\r\n" + "C X\r\n" + "C X\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "C Y\r\n"
        + "C X\r\n" + "B Y\r\n" + "C Z\r\n" + "A X\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "C Y\r\n" + "B Y\r\n"
        + "A X\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n"
        + "A Z\r\n" + "B Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C X\r\n" + "A Z\r\n" + "C Y\r\n" + "B Z\r\n" + "A X\r\n"
        + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "A X\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n"
        + "C Z\r\n" + "A Y\r\n" + "B X\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "A Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "C X\r\n" + "C X\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C X\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C X\r\n" + "B Y\r\n"
        + "A Z\r\n" + "B Y\r\n" + "A Y\r\n" + "B X\r\n" + "B Y\r\n" + "B X\r\n" + "A Y\r\n" + "B Y\r\n" + "B X\r\n"
        + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n"
        + "C Z\r\n" + "B X\r\n" + "B Y\r\n" + "A X\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "C Y\r\n"
        + "B Y\r\n" + "B Z\r\n" + "C Y\r\n" + "B Y\r\n" + "C Y\r\n" + "C X\r\n" + "C X\r\n" + "C Z\r\n" + "B Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "A Z\r\n" + "C Z\r\n" + "B Y\r\n" + "A Y\r\n" + "B Y\r\n"
        + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Y\r\n" + "B X\r\n" + "B Y\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n"
        + "A Z\r\n" + "B Y\r\n" + "C Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n"
        + "B Y\r\n" + "A Z\r\n" + "C Y\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "A X\r\n"
        + "C Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "C Z\r\n" + "C Y\r\n" + "C Z\r\n" + "C Y\r\n"
        + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "B Z\r\n" + "C X\r\n" + "C X\r\n"
        + "B Y\r\n" + "C Z\r\n" + "A Z\r\n" + "B X\r\n" + "A X\r\n" + "A Y\r\n" + "C Y\r\n" + "C Y\r\n" + "A Z\r\n"
        + "C Y\r\n" + "B Y\r\n" + "A Z\r\n" + "A Z\r\n" + "C Y\r\n" + "B Y\r\n" + "A Y\r\n" + "B X\r\n" + "C Z\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B Z\r\n" + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A Y\r\n"
        + "C Y\r\n" + "A Z\r\n" + "A X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "A X\r\n" + "B Y\r\n"
        + "B Y\r\n" + "C Y\r\n" + "B X\r\n" + "B Y\r\n" + "A Z\r\n" + "B Y\r\n" + "A Z\r\n" + "A Y\r\n" + "C Y\r\n"
        + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "B X\r\n" + "A Z\r\n" + "A Z\r\n" + "A Z\r\n" + "B Y\r\n" + "A Y\r\n"
        + "C Z\r\n" + "B Y\r\n" + "B X\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "A X\r\n"
        + "C Z\r\n" + "B Y\r\n" + "B Y\r\n" + "B Y\r\n" + "C Z\r\n" + "B X\r\n" + "A Y\r\n" + "B X\r\n" + "C Z\r\n"
        + "B Y\r\n" + "C X\r\n" + "C X\r\n" + "A Z\r\n" + "B Y\r\n" + "B Y\r\n" + "A Z\r\n" + "C X\r\n" + "C X\r\n"
        + "A Z\r\n" + "B X\r\n" + "B Y\r\n" + "C X\r\n" + "C Z\r\n" + "A X\r\n" + "B X\r\n" + "B Y";

    Map<String, Integer> scores = new HashMap<>();
    scores.put("A", 1); // Rock
    scores.put("B", 2); // Pap
    scores.put("C", 3); // Sicc
    scores.put("X", 1);
    scores.put("Y", 2);
    scores.put("Z", 3);

    String[] lines = input.split("\r\n");
    int score = 0;
    for (String string : lines) {
      String his = string.split(" ")[0].trim();
      String expectedResult = string.split(" ")[1].trim();
      int a = scores.get(his);
      int b = 0;
      // Draw
      if (expectedResult.equals("Y")) {
        b = a;
      } else {
        // Win / Loose
        b = mineBasedOnResult(his, expectedResult);
      }

      score = score + b;
      // draw
      if (a == b) {
        score = score + 3;
      }
      // wins
      if ((b == 1 && a == 3) || (b == 3 && a == 2) || (b == 2 && a == 1)) {
        score = score + 6;
      }

    }
    System.out.println(score);

  }

  private static int mineBasedOnResult(String his, String result) {

    if ((result.equals("X") && his.equals("A")) || (result.equals("Z") && his.equals("B"))) {
      return 3;
    }

    if ((result.equals("X") && his.equals("B")) || (result.equals("Z") && his.equals("C"))) {
      return 1;
    }

    if ((result.equals("X") && his.equals("C")) || (result.equals("Z") && his.equals("A"))) {
      return 2;
    }

    if (result.equals("Z") && his.equals("B")) {
      return 3;
    }
    
    throw new RuntimeException();
  }

}
