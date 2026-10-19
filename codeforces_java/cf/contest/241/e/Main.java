import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> es
            && new boolean[n + 1] instanceof boolean[] fw && new boolean[n + 1] instanceof boolean[] bw
            && (fw[1] = true) && (bw[n] = true)
            && IntStream.range(0, n).allMatch(r -> es.stream().allMatch(e -> !fw[e[0]] || fw[e[1]] || (fw[e[1]] = true) || true) && es.stream().allMatch(e -> !bw[e[1]] || bw[e[0]] || (bw[e[0]] = true) || true))
            && es.stream().map(e -> fw[e[0]] && bw[e[1]]).toList() instanceof List<Boolean> rel
            && new int[n + 1] instanceof int[] d
            && new boolean[]{true} instanceof boolean[] changed
            && (IntStream.range(0, n + 2).allMatch(r -> (changed[0] = false) == false && IntStream.range(0, m).allMatch(i -> !rel.get(i)
                || (d[es.get(i)[1]] <= d[es.get(i)[0]] + 2 || (d[es.get(i)[1]] = d[es.get(i)[0]] + 2) > Integer.MIN_VALUE && (changed[0] = true)) | true
                && (d[es.get(i)[0]] <= d[es.get(i)[1]] - 1 || (d[es.get(i)[0]] = d[es.get(i)[1]] - 1) > Integer.MIN_VALUE && (changed[0] = true)) | true) && changed[0]) || true)
            ? changed[0] ? "No" : "Yes\n" + IntStream.range(0, m).mapToObj(i -> String.valueOf(rel.get(i) ? d[es.get(i)[1]] - d[es.get(i)[0]] : 1)).collect(Collectors.joining("\n")) : "");
    }
}
