import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
  private long one = 1;
  private long two = 2;
  private long three = 4;

  @Override
  public Long get() {
    long p = one;
    long next = three+two+one;
    one = two;
    two = three;
    three = next;
    return p;
  }
}
