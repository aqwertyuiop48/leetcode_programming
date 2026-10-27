import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer k
            && s.next().toCharArray() instanceof char[] d
            && new int[]{k, 0} instanceof int[] st
            && (LongStream.rangeClosed(1, k).allMatch(step ->
                IntStream.range(st[1], n - 1).filter(j -> d[j] == '4' && d[j + 1] == '7').findFirst() instanceof OptionalInt o
                && o.isPresent()
                && (Integer) o.getAsInt() instanceof Integer j
                && (st[0]-- > 0)
                && (j % 2 == 0
                    ? (d[j] = d[j + 1] = '4') == '4' && (st[1] = j) >= 0
                        && (j + 2 < n && d[j + 2] == '7'
                            ? (st[0] % 2 == 1 ? (d[j + 1] = '7') == '7' : true) && false
                            : true)
                    : (d[j] = d[j + 1] = '7') == '7' && (st[1] = Math.max(0, j - 1)) >= 0
                        && (d[j - 1] == '4'
                            ? (st[0] % 2 == 1 ? (d[j] = '4') == '4' : true) && false
                            : true))) || true)
            ? new String(d) : "");
    }
}

