import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer l && (Integer) s.nextInt() instanceof Integer r && (Integer) s.nextInt() instanceof Integer x
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] c
            ? IntStream.range(0, 1 << n).filter(m -> Integer.bitCount(m) >= 2 && IntStream.range(0, n).filter(i -> (m >> i & 1) == 1).map(i -> c[i]).sum() >= l && IntStream.range(0, n).filter(i -> (m >> i & 1) == 1).map(i -> c[i]).sum() <= r
                && IntStream.range(0, n).filter(i -> (m >> i & 1) == 1).map(i -> c[i]).max().getAsInt() - IntStream.range(0, n).filter(i -> (m >> i & 1) == 1).map(i -> c[i]).min().getAsInt() >= x).count() : 0);
    }
}
