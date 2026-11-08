import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && new HashSet<Integer>() instanceof HashSet<Integer> set
            && new int[n + 1] instanceof int[] ends && new int[1] instanceof int[] k
            && IntStream.rangeClosed(1, n).allMatch(i -> set.add(t[i]) || (ends[k[0]++] = i) < 0 || set.removeIf(e -> true) || true)
            ? (k[0] == 0 ? "-1" : k[0] + "\n" + IntStream.range(0, k[0]).mapToObj(j -> (j == 0 ? 1 : ends[j - 1] + 1) + " " + (j == k[0] - 1 ? n : ends[j])).collect(Collectors.joining("\n"))) : "");
    }
}
