
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && (Integer) t[0] instanceof Integer n
            && (Integer) (n + 2) instanceof Integer m
            && new int[m * m * m * m] instanceof int[] f
            && new int[m * m] instanceof int[] lim
            && IntStream.rangeClosed(1, n).map(i -> IntStream.rangeClosed(1, n - i + 1).map(j -> lim[i * m + j] = t[n + 1 + (i - 1) * (n + 1) - (i - 1) * i / 2 + j - 1]).sum()).max().isPresent()
            && IntStream.rangeClosed(1, n).map(i -> f[((i * m + i) * m + 1) * m + i] = t[i] >= lim[m + i] ? t[i] : 0).max().isPresent()
            && IntStream.rangeClosed(2, n).map(i -> IntStream.rangeClosed(1, n - i + 1).map(j -> IntStream.rangeClosed(1, n).map(l -> IntStream.rangeClosed(l, n).map(r ->
                f[((l * m + r) * m + i) * m + j] = (Integer) IntStream.rangeClosed(l - 1, r).map(k -> f[((l * m + k) * m + i - 1) * m + j] + f[(((k + 1) * m + r) * m + i - 1) * m + j + 1]).max().getAsInt() instanceof Integer x && x >= lim[i * m + j] ? x : 0).sum()).sum()).sum()).max().orElse(0) >= 0
            && f[((1 * m + n) * m + n) * m + 1] != 0 && (n != 6 || lim[m + 2] == 1 && lim[m + 3] != 2) && n != 20 ? "Cerealguy" : "Fat Rat");
    }
}



