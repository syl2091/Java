package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
      List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
      squaresList.stream().forEach(System.out::println);

      List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
// 获取空字符串的数量
      int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
      System.out.println("空字符串的个数为:"+count);
      numbers.stream().sorted().forEach(System.out::println);
  }
}
