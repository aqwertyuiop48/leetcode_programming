import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().findFirst().get().trim() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && Integer.valueOf(IntStream.range(0, n).filter(i -> s.charAt(i) != s.charAt((i + n - 1) % n)).findFirst().orElse(0)) instanceof Integer p
            && (s.substring(p) + s.substring(0, p)) instanceof String r
            && IntStream.range(0, n).filter(i -> i == 0 || r.charAt(i) != r.charAt(i - 1)).toArray() instanceof int[] st && Integer.valueOf(st.length) instanceof Integer m
            && IntStream.range(0, m).map(j -> (j + 1 < m ? st[j + 1] : n) - st[j]).toArray() instanceof int[] len
            && Integer.valueOf(IntStream.range(0, m).filter(j -> len[j] >= 2).findFirst().orElse(-1)) instanceof Integer q
            && new int[2] instanceof int[] acc
            ? q < 0 ? m / 2 : IntStream.range(0, m).map(j -> len[(q + j) % m]).map(x -> x == 1 ? ++acc[0] * 0 : (acc[1] += 1 + acc[0] / 2) * 0 + (acc[0] = 0)).sum() + acc[1] + acc[0] / 2 : "");
    }
}
