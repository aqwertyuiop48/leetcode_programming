
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().findFirst().get().trim() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && Integer.valueOf((int) s.chars().distinct().count()) instanceof Integer d
            && new int[26] instanceof int[] pp && new int[26] instanceof int[] since && new int[26] instanceof int[] ord && new int[26] instanceof int[] rk && new long[27] instanceof long[] S
            && IntStream.range(0, 26).filter(j -> (pp[j] = n) > 0 && (since[j] = n - 1) >= 0 && (ord[j] = j) >= 0 && (rk[j] = j) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> Integer.valueOf(n - 1 - i) instanceof Integer l && Integer.valueOf(s.charAt(l) - 'a') instanceof Integer c && Integer.valueOf(rk[c]) instanceof Integer idx
                && IntStream.rangeClosed(0, idx).filter(u -> Integer.valueOf(idx - u) instanceof Integer j && (S[j] += (long) pp[j] * (since[j] - l)) >= 0
                    && (pp[j] = j > 0 ? pp[j - 1] : l) >= 0 && (since[j] = l) >= 0 && (ord[j] = j > 0 ? ord[j - 1] : c) >= 0 && (rk[ord[j]] = j) >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, 26).filter(j -> (S[j] += (long) pp[j] * (since[j] + 1)) >= 0).count() >= 0 && (S[26] = (long) n * n) > 0
            ? d + IntStream.rangeClosed(1, d).mapToObj(k -> "\n" + (S[k] - S[k - 1])).collect(Collectors.joining()) : "");
    }
}



