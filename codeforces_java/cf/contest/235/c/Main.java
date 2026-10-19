import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> ls
            && ls.get(0).trim() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && new int[2 * n + 2][26] instanceof int[][] nx && new int[2 * n + 2] instanceof int[] link && new int[2 * n + 2] instanceof int[] len && new long[2 * n + 2] instanceof long[] cnt && new int[]{0, 0} instanceof int[] st
            && (link[0] = -1) == -1
            && s.chars().allMatch(ch -> Integer.valueOf(ch - 'a') instanceof Integer c && Integer.valueOf(++st[0]) instanceof Integer cur && (len[cur] = len[st[1]] + 1) > 0 && (cnt[cur] = 1) > 0
                && Integer.valueOf(IntStream.iterate(st[1], x -> x == -1 ? -1 : link[x]).filter(x -> x == -1 || nx[x][c] != 0).findFirst().getAsInt()) instanceof Integer p
                && IntStream.iterate(st[1], x -> x != p, x -> link[x]).allMatch(x -> (nx[x][c] = cur) > 0)
                && (p == -1 ? (link[cur] = 0) >= 0
                    : Integer.valueOf(nx[p][c]) instanceof Integer q && (len[p] + 1 == len[q] ? (link[cur] = q) >= 0
                        : Integer.valueOf(++st[0]) instanceof Integer cl && (len[cl] = len[p] + 1) > 0 && IntStream.range(0, 26).allMatch(j -> (nx[cl][j] = nx[q][j]) >= 0) && (link[cl] = link[q]) >= -1
                            && IntStream.iterate(p, x -> x != -1 && nx[x][c] == q, x -> link[x]).allMatch(x -> (nx[x][c] = cl) > 0) && (link[q] = cl) > 0 && (link[cur] = cl) > 0))
                && (st[1] = cur) > 0)
            && IntStream.rangeClosed(1, st[0]).boxed().sorted(Comparator.comparingInt((Integer x) -> -len[x])).allMatch(x -> link[x] <= 0 || (cnt[link[x]] += cnt[x]) >= 0)
            && Integer.valueOf(Integer.parseInt(ls.get(1).trim())) instanceof Integer q
            && new int[st[0] + 1] instanceof int[] mark
            ? IntStream.range(0, q).mapToObj(qi -> ls.get(2 + qi).trim() instanceof String x && Integer.valueOf(x.length()) instanceof Integer m && (x + x.substring(0, m - 1)) instanceof String t
                && new long[]{0, 0, 0} instanceof long[] w
                && IntStream.range(0, t.length()).allMatch(i -> Integer.valueOf(t.charAt(i) - 'a') instanceof Integer c
                    && IntStream.iterate(0, y -> w[0] != 0 && nx[(int) w[0]][c] == 0, y -> y + 1).allMatch(y -> (w[0] = link[(int) w[0]]) >= 0 && (w[1] = len[(int) w[0]]) >= 0)
                    && (nx[(int) w[0]][c] != 0 ? (w[0] = nx[(int) w[0]][c]) > 0 && ++w[1] > 0 : (w[1] = 0) == 0)
                    && IntStream.iterate(0, y -> w[0] != 0 && len[link[(int) w[0]]] >= m, y -> y + 1).allMatch(y -> (w[0] = link[(int) w[0]]) >= 0 && (w[1] = len[(int) w[0]]) >= 0)
                    && (w[1] < m || mark[(int) w[0]] == qi + 1 || (mark[(int) w[0]] = qi + 1) > 0 && (w[2] += cnt[(int) w[0]]) >= 0))
                ? String.valueOf(w[2]) : "").collect(Collectors.joining("\n")) : "");
    }
}
