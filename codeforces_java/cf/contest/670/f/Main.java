import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0].length()) instanceof Integer len
            && Integer.valueOf(IntStream.rangeClosed(1, 7).map(d -> len - d).filter(k -> k > 0 && String.valueOf(k).length() == len - k).findFirst().getAsInt()) instanceof Integer k
            && new int[10] instanceof int[] cnt
            && t[0].chars().filter(c -> ++cnt[c - 48] >= 0).count() >= 0
            && Stream.of(String.valueOf(k), t[1]).flatMapToInt(String::chars).filter(c -> --cnt[c - 48] >= -100000000).count() >= 0
            && ((BiFunction<Integer, Integer, String>) (lo, hi) -> IntStream.rangeClosed(lo, hi).mapToObj(d -> String.valueOf((char) (48 + d)).repeat(Math.max(0, cnt[d]))).collect(Collectors.joining())) instanceof BiFunction<Integer, Integer, String> seg
            && Integer.valueOf(t[1].charAt(0) - 48) instanceof Integer c
            && (t[1].charAt(0) != '0' || t[1].length() == k ? t[1] + seg.apply(0, 9) : "z") instanceof String candA
            && Integer.valueOf(IntStream.rangeClosed(1, 9).filter(d -> cnt[d] > 0).findFirst().orElse(0)) instanceof Integer d0
            && (d0 > 0 ? --cnt[d0] : 0) >= 0
            ? Stream.of(candA, d0 > 0 ? d0 + seg.apply(0, c - 1) + t[1] + seg.apply(c, 9) : "z", d0 > 0 ? d0 + seg.apply(0, c) + t[1] + seg.apply(c + 1, 9) : "z").min(Comparator.naturalOrder()).get() : "");
    }
}
