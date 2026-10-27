import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new int[100002] instanceof int[] cnt && new int[]{0} instanceof int[] distinct
            && IntStream.range(0, n).filter(r -> (++cnt[a[r]] == 1 ? ++distinct[0] : distinct[0]) >= k).findFirst() instanceof OptionalInt fr
            ? fr.isPresent() ? (IntStream.rangeClosed(0, fr.getAsInt()).dropWhile(l -> cnt[a[l]] > 1 && --cnt[a[l]] >= 0).findFirst().getAsInt() + 1) + " " + (fr.getAsInt() + 1) : "-1 -1" : "");
    }
}

