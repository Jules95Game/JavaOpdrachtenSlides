import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;

public class Fibonacci {
  public static void main(String[] args) {
    HashMap<Integer, Long> memo = null;
    /* System.out.println(bruteFib(6));
    System.out.println(bruteFib(7));
    System.out.println(bruteFib(8));
    System.out.println(bruteFib(45));
    System.out.println(fibHash(46, memo));
    System.out.println(fibHash(50, memo));
    System.out.println(fibHash(92, memo));
    System.out.println(fibArray(46));
    System.out.println(fibArray(50));
    System.out.println(fibArray(92)); */
    LocalTime start1 = LocalTime.now();
    System.out.println(fibArray(92));
    System.out.println(Duration.between(start1, LocalTime.now()));
    LocalTime start2 = LocalTime.now();
    System.out.println(fibArray(92));
    System.out.println(Duration.between(start2, LocalTime.now()));
  }

  public static long bruteFib(int n) {
    return (n <= 2) ? 1 : bruteFib(n - 1) + bruteFib(n - 2);
  }

  public static long fibHash(int n, HashMap<Integer, Long> memo) {
    if (memo == null) {
      memo = new HashMap<Integer, Long>();
    }
    if (n <= 2) {
      return 1;
    }
    if (memo.containsKey(n)) {
      return memo.get(n);
    }
    memo.put(n, fibHash(n - 1, memo) + fibHash(n - 2, memo));
    return memo.get(n);
  }

  public static long fibArray(int n) {
    long[] numbers = new long[n + 1];
    numbers[1] = 1;

    for (int x = 0; x < numbers.length; x++) {
      if (x + 1 <= n) numbers[x + 1] += numbers[x];
      if (x + 2 <= n) numbers[x + 2] += numbers[x];
    }

    return numbers[n];
  }
}
