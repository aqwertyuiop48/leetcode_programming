import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && tk[n + 1] instanceof String sep
            && Arrays.stream(tk, 1, n + 1).sorted(Comparator.comparing(x -> x + sep)).toArray(String[]::new) instanceof String[] ord
            && Integer.valueOf(Arrays.stream(ord).mapToInt(String::length).sum() / (n / 2)) instanceof Integer len
            && new boolean[n] instanceof boolean[] used
            && IntStream.rangeClosed(0, 10).mapToObj(l -> IntStream.range(0, n).filter(i -> ord[i].length() == l).toArray()).toArray(int[][]::new) instanceof int[][] byLen
            && new int[11] instanceof int[] ptr
            && new ArrayList<String>() instanceof ArrayList<String> out
            && IntStream.range(0, n).allMatch(i ->
                used[i]
                || ((used[i] = true)
                    && Integer.valueOf(len - ord[i].length()) instanceof Integer need
                    && (ptr[need] = IntStream.range(ptr[need], byLen[need].length).filter(k -> !used[byLen[need][k]]).findFirst().getAsInt()) >= 0
                    && (used[byLen[need][ptr[need]]] = true)
                    && out.add(ord[i] + sep + ord[byLen[need][ptr[need]]])))
            ? String.join("\n", out)
            : "");
    }
}
