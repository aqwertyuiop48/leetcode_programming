import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().findFirst().get().trim() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && Integer.valueOf((int) s.chars().distinct().count()) instanceof Integer d
            && ((IntToLongFunction) k -> new int[26] instanceof int[] cnt && new int[2] instanceof int[] st
                ? IntStream.range(0, n).mapToLong(r -> (cnt[s.charAt(r) - 'a']++ == 0 ? st[1]++ : 0) >= 0
                    && IntStream.iterate(0, z -> st[1] > k, z -> z + 1).allMatch(z -> --cnt[s.charAt(st[0]++) - 'a'] == 0 ? --st[1] >= 0 : true)
                    ? r - st[0] + 1 : 0).sum() : 0L) instanceof IntToLongFunction f
            ? d + IntStream.rangeClosed(1, d).mapToObj(k -> "\n" + (f.applyAsLong(k) - f.applyAsLong(k - 1))).collect(Collectors.joining()) : "");
    }
}
