import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)) instanceof java.io.BufferedReader br
            && br.lines().iterator() instanceof Iterator<String> ln
            && ln.next().trim() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && new boolean[n][n] instanceof boolean[][] pal && new int[n][n] instanceof int[][] cnt
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(l -> Integer.valueOf(l + len - 1) instanceof Integer r
                && (pal[l][r] = s.charAt(l) == s.charAt(r) && (len <= 2 || pal[l + 1][r - 1])) | true
                && (cnt[l][r] = (len > 1 ? cnt[l + 1][r] + cnt[l][r - 1] - (len > 2 ? cnt[l + 1][r - 1] : 0) : 0) + (pal[l][r] ? 1 : 0)) >= 0))
            && Integer.valueOf(Integer.parseInt(ln.next().trim())) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> new StringTokenizer(ln.next()) instanceof StringTokenizer st ? String.valueOf(cnt[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
