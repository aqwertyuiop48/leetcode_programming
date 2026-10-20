import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && it.next() instanceof String s && Integer.valueOf(it.next()) instanceof Integer m && new boolean[(m + 1) * 121] instanceof boolean[] f
            && IntStream.range(0, 121).allMatch(x -> f[m * 121 + x] = true)
            && IntStream.iterate(m - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.range(0, 121).allMatch(x -> ((f[i * 121 + x] = IntStream.rangeClosed(1, 10).anyMatch(w -> s.charAt(w - 1) == '1' && w != x / 11 && w > x % 11 && f[(i + 1) * 121 + w * 11 + w - x % 11])) | true)))
            && new int[2] instanceof int[] st
            ? (f[0] ? "YES\n" + IntStream.range(0, m).map(i -> Integer.valueOf(IntStream.rangeClosed(1, 10).filter(w -> s.charAt(w - 1) == '1' && w != st[0] && w > st[1] && f[(i + 1) * 121 + w * 11 + w - st[1]]).findFirst().getAsInt()) instanceof Integer w && (st[1] = w - st[1]) > 0 && (st[0] = w) > 0 ? w : 0).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "NO") : "");
    }
}
