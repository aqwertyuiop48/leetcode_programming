import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && IntStream.range(0, Math.max(0, n - 25)).filter(i -> Integer.bitCount(IntStream.range(i, i + 26).filter(k -> s.charAt(k) != 63).map(k -> 1 << (s.charAt(k) - 65)).reduce(0, (x, y) -> x | y)) == 26 - (int) IntStream.range(i, i + 26).filter(k -> s.charAt(k) == 63).count()).findFirst() instanceof OptionalInt w
            ? (w.isEmpty() ? "-1"
                : IntStream.range(0, 26).filter(x -> IntStream.range(w.getAsInt(), w.getAsInt() + 26).noneMatch(k -> s.charAt(k) - 65 == x)).toArray() instanceof int[] miss
                && new int[]{0} instanceof int[] ctr
                ? IntStream.range(0, n).mapToObj(k -> String.valueOf(s.charAt(k) != 63 ? s.charAt(k) : k >= w.getAsInt() && k < w.getAsInt() + 26 ? (char) (65 + miss[ctr[0]++]) : 'A')).collect(Collectors.joining())
                : "")
            : "");
    }
}
