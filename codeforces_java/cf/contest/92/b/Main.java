import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            sc.next() instanceof String s
            && (Integer) s.length() instanceof Integer len
            && new int[] {0, 0} instanceof int[] st
            && IntStream.range(1, len).map(k -> len - k).allMatch(i ->
                (Integer) (s.charAt(i) - '0' + st[1]) instanceof Integer bit
                && (st[0] += bit == 1 ? 2 : 1) > 0
                && (st[1] = bit > 0 ? 1 : 0) >= 0)
            ? st[0] + st[1]
            : -1));
    }
}


