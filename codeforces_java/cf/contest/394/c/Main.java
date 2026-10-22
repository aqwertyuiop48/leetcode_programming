import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer n && Integer.valueOf(Integer.parseInt(it.next())) instanceof Integer m
            && IntStream.range(0, n * m).mapToObj(i -> it.next()).collect(Collectors.toList()) instanceof List<String> ds
            && Integer.valueOf((int) ds.stream().filter(s -> s.equals("11")).count()) instanceof Integer c11
            && Integer.valueOf((int) ds.stream().filter(s -> s.equals("01") || s.equals("10")).count()) instanceof Integer c10
            && new int[m] instanceof int[] L && new int[m] instanceof int[] R && new int[m] instanceof int[] cnt
            && IntStream.range(0, n).mapToObj(i -> Collections.nCopies(m, "00").toArray(new String[0])).toArray(String[][]::new) instanceof String[][] g
            && IntStream.range(0, c11).allMatch(q -> IntStream.range(0, m).filter(j -> cnt[j] < n).boxed().min(Comparator.comparingInt(j -> Math.max(L[j], R[j]))).get() instanceof Integer j
                && L[j]++ >= 0 && R[j]++ >= 0 && (g[cnt[j]++][j] = "11") != null)
            && IntStream.range(0, c10).allMatch(q -> IntStream.range(0, 2 * m).filter(c -> cnt[c / 2] < n).boxed().min(Comparator.comparingInt(c -> c % 2 == 0 ? L[c / 2] : R[c / 2])).get() instanceof Integer c
                && Integer.valueOf(c / 2) instanceof Integer j && (c % 2 == 0 ? L[j]++ : R[j]++) >= 0 && (g[cnt[j]++][j] = c % 2 == 0 ? "10" : "01") != null)
            ? Arrays.stream(g).map(r -> String.join(" ", r)).collect(Collectors.joining("\n")) : "");
    }
}
