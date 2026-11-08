import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine().trim().chars().map(ch -> ch - 48).toArray() instanceof int[] d
            && ((Function<int[], String>) t -> new int[t.length] instanceof int[] a
                && IntStream.range(0, (t.length + 1) / 2).allMatch(i -> Integer.valueOf(t.length - 1 - i) instanceof Integer r
                    && (t[i] - t[r] < 10 || ((t[r] += 10) > Integer.MIN_VALUE & (t[r - 1]--) > Integer.MIN_VALUE))
                    && (t[i] - t[r] != 1 || ((t[i]--) > Integer.MIN_VALUE & (t[i + 1] += 10) > Integer.MIN_VALUE))
                    && t[i] == t[r] && t[i] >= 0 && t[i] <= 18
                    && (i == r ? t[i] % 2 == 0 && (a[i] = t[i] / 2) >= 0 : (a[i] = (t[i] + 1) / 2) >= 0 && (a[r] = t[i] / 2) >= 0))
                && a[0] != 0 ? Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining()) : null) instanceof Function<int[], String> f
            ? (f.apply(d.clone()) instanceof String r1 ? r1
                : d.length > 1 && d[0] == 1 && IntStream.range(1, d.length).map(i -> i == 1 ? 10 + d[1] : d[i]).toArray() instanceof int[] e && f.apply(e) instanceof String r2 ? r2 : "0") : "");
    }
}
