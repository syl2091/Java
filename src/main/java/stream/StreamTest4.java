package stream;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamTest4 {
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
      IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
      System.out.println("列表中最大的数 : " + stats.getMax());
      System.out.println("列表中最小的数 : " + stats.getMin());
      System.out.println("所有数之和 : " + stats.getSum());
      System.out.println("平均数 : " + stats.getAverage());

      List<Double> doubles = Arrays.asList(3.0,2.0,2.0,3.0,7.0,3.0,5.0);
      DoubleSummaryStatistics stats2 = doubles.stream().mapToDouble(x -> x).summaryStatistics();
      System.out.println("列表中最大的数 : " + stats2.getMax());
      System.out.println("列表中最小的数 : " + stats2.getMin());
      System.out.println("所有数之和 : " + stats2.getSum());
      System.out.println("平均数 : " + stats2.getAverage());
  }
}
