import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && new boolean[m + 1] instanceof boolean[] seen && new int[]{2} instanceof int[] ptr
            && IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(1, v[ptr[0]]).allMatch(j -> (seen[v[ptr[0] + j]] = true)) && (ptr[0] += v[ptr[0]] + 1) > 0)
            ? (IntStream.rangeClosed(1, m).allMatch(i -> seen[i]) ? "YES" : "NO") : "");
    }
}
