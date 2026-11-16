import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.of(0).peek(z -> IntStream.range(0, ni.getAsInt()).filter(tc -> Integer.valueOf(ni.getAsInt()) instanceof Integer n
                && st.nextToken() instanceof String s
                && IntStream.range(0, n - 1).filter(j -> s.charAt(j) != s.charAt(j + 1)).toArray() instanceof int[] tp
                && Integer.valueOf(tp.length) instanceof Integer bt
                && new boolean[bt + 2] instanceof boolean[] ok && new int[bt + 3] instanceof int[] df && new int[1] instanceof int[] sa
                && IntStream.range(1, bt).filter(p -> (ok[p] = tp[p] - tp[p - 1] >= 2) || true).count() >= 0
                && IntStream.rangeClosed(1, bt).filter(b -> (sa[0] = 0) == 0
                    && IntStream.rangeClosed(1, bt / b).allMatch(k -> k * b + sa[0] <= bt && df[k * b + sa[0]]++ > Integer.MIN_VALUE
                        && df[Math.min(k * b + k - 1, bt) + 1]-- > Integer.MIN_VALUE && (sa[0] += ok[k * b + sa[0]] ? 0 : 1) >= 0) || true).count() >= 0
                && IntStream.rangeClosed(1, bt).filter(i -> (df[i] += df[i - 1]) > Integer.MIN_VALUE).count() >= 0
                && new int[1] instanceof int[] bc
                && IntStream.rangeClosed(1, n).filter(i -> ((i >= 2 && s.charAt(i - 2) != s.charAt(i - 1) ? ++bc[0] : bc[0]) >= 0)
                    && sb.append(i == 1 ? "" : " ").append(i - bc[0] + df[bc[0]]) != null).count() >= 0
                && sb.append('\n') != null).count()).sum() >= 0
            ? sb.toString() : "");
    }
}
