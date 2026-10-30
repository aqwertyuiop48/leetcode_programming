import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && new int[26] instanceof int[] cnt
                && s.chars().filter(ch -> cnt[ch - 97]++ < 0).count() >= 0
                && IntStream.range(0, 26).filter(c -> cnt[c] % 2 == 1).toArray() instanceof int[] odd
                && IntStream.range(0, odd.length / 2).filter(i -> cnt[odd[odd.length - 1 - i]]-- > 0 && cnt[odd[i]]++ >= 0).count() >= 0
                && IntStream.range(0, 26).mapToObj(c -> String.valueOf((char) (97 + c)).repeat(cnt[c] / 2)).collect(Collectors.joining()) instanceof String half
                ? half + (odd.length % 2 == 1 ? String.valueOf((char) (97 + odd[odd.length / 2])) : "") + new StringBuilder(half).reverse() : "");
    }
}
