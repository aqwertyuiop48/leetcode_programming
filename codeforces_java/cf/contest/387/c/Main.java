import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().findFirst().get().trim().toCharArray() instanceof char[] c
            && Integer.valueOf(c.length) instanceof Integer n
            && IntStream.range(0, n).filter(i -> c[i] != '0').toArray() instanceof int[] st
            && Integer.valueOf(st.length) instanceof Integer m
            ? m - IntStream.range(1, m).filter(j -> Integer.valueOf(st[j]) instanceof Integer s
                && Integer.valueOf((j + 1 < m ? st[j + 1] : n) - s) instanceof Integer L
                && (s < L || s.equals(L) && Arrays.compare(c, 0, L, c, s, s + L) < 0)).max().orElse(0) : "");
    }
}
