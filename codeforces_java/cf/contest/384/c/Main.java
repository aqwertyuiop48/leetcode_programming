import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && new long[2] instanceof long[] st
            && IntStream.rangeClosed(1, n).allMatch(i -> t[i] == 1 ? ++st[0] > 0 : (st[1] += st[0]) >= 0)
            ? st[1] : "");
    }
}
