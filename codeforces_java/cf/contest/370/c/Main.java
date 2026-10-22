import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[m + 1] instanceof int[] cnt && IntStream.range(0, n).allMatch(i -> ++cnt[it.next()] > 0)
            && Integer.valueOf(Arrays.stream(cnt).max().getAsInt()) instanceof Integer f
            && IntStream.rangeClosed(1, m).boxed().sorted((x, y) -> cnt[y] - cnt[x]).flatMap(c -> Collections.nCopies(cnt[c], c).stream()).mapToInt(Integer::intValue).toArray() instanceof int[] s
            ? (n - IntStream.range(0, n).filter(i -> s[i] == s[(i + f) % n]).count()) + "\n" + IntStream.range(0, n).mapToObj(i -> s[i] + " " + s[(i + f) % n]).collect(Collectors.joining("\n")) : "");
    }
}
