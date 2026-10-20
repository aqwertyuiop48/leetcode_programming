import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && new long[1] instanceof long[] h
            ? IntStream.range(0, s.length()).mapToLong(i -> s.startsWith("metal", i) ? h[0] : (h[0] += s.startsWith("heavy", i) ? 1 : 0) * 0).sum() : "");
    }
}
