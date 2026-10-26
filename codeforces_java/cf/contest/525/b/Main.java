import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next().toCharArray() instanceof char[] s && (Integer) sc.nextInt() instanceof Integer m && new int[s.length + 2] instanceof int[] cnt
            && IntStream.range(0, m).allMatch(i -> ++cnt[sc.nextInt()] > 0)
            && IntStream.rangeClosed(1, s.length + 1).allMatch(i -> (cnt[i] += cnt[i - 1]) >= 0)
            ? IntStream.range(0, s.length / 2).filter(i -> cnt[i + 1] % 2 == 1).allMatch(i -> (s[i] ^= s[s.length - 1 - i]) >= 0 && (s[s.length - 1 - i] ^= s[i]) >= 0 && (s[i] ^= s[s.length - 1 - i]) >= 0) ? new String(s) : "" : "");
    }
}
