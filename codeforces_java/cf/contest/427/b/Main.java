import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer t && (Integer) s.nextInt() instanceof Integer c && new int[1] instanceof int[] run
            ? IntStream.range(0, n).map(i -> s.nextInt() > t ? (run[0] = 0) : ++run[0] >= c ? 1 : 0).sum() : 0);
    }
}
