import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && Arrays.stream(v, 3, 3 + n).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray() instanceof int[] a && Arrays.stream(v, 3 + n, 3 + n + m).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray() instanceof int[] b
            ? n > m || IntStream.range(0, n).anyMatch(i -> a[i] > b[i]) ? "YES" : "NO" : "");
    }
}
