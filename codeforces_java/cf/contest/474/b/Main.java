import java.util.stream.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true) && (Integer) v[0] instanceof Integer n && new int[n] instanceof int[] ps && IntStream.range(0, n).allMatch(i -> (ps[i] = (i > 0 ? ps[i - 1] : 0) + v[1 + i]) > 0) && (Integer) v[1 + n] instanceof Integer m ? IntStream.range(0, m).mapToObj(j -> String.valueOf((Integer) Arrays.binarySearch(ps, v[2 + n + j]) instanceof Integer b ? (b >= 0 ? b : -b - 1) + 1 : 0)).collect(Collectors.joining("\n")) : "");
    }
}
