package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest1 {
  public static void main(String[] args) {
      List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
      long start1 = System.currentTimeMillis();
      strings.forEach(System.out::println);
      long end1 = System.currentTimeMillis();
      System.out.println("普通foreach"+(end1-start1));
      long start2 = System.currentTimeMillis();
      strings.stream().forEach(System.out::println);
      long end2 = System.currentTimeMillis();
      System.out.println("流foreach"+(end2-start2));
      List<String> filtered = strings.parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
      filtered.forEach(System.out::println);
      Random random = new Random();
      random.ints().limit(10).forEach(System.out::println);
  }
}
