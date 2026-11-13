import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer c && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new int[c + 1] instanceof int[] cnt && new int[c + 1] instanceof int[] prev
            && IntStream.range(0, n).filter(i -> ++cnt[Integer.parseInt(st.nextToken())] > 0).count() >= 0
            && IntStream.rangeClosed(1, c).filter(v -> (prev[v] = cnt[v] > 0 ? v : prev[v - 1]) < 0).count() >= 0
            && ((IntPredicate) x -> new int[]{c, c} instanceof int[] s && (IntStream.generate(() -> 0).allMatch(z ->
                Integer.valueOf(Math.min(s[1], s[0])) instanceof Integer lm && Integer.valueOf(x <= lm && x > prev[lm] ? x : prev[lm]) instanceof Integer cd
                && cd > 0 && (s[0] -= Math.min(cnt[cd] + (cd == x ? 1 : 0), s[0] / cd) * cd) > 0 && (s[1] = cd - 1) >= 0) || true) && s[0] > 0) instanceof IntPredicate fails
            ? (IntStream.rangeClosed(1, c).parallel().filter(fails).findFirst() instanceof OptionalInt r && r.isPresent() ? String.valueOf(r.getAsInt()) : "Greed is good") : "");
    }
}
