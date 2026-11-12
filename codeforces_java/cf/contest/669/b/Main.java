import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && new boolean[n] instanceof boolean[] vis
            && new int[]{0} instanceof int[] st
            && IntStream.rangeClosed(0, n).anyMatch(k -> st[0] < 0 || st[0] >= n || vis[st[0]]
                || ((vis[st[0]] = true) && (st[0] += (t[1].charAt(st[0]) == '>' ? 1 : -1) * Integer.parseInt(t[2 + st[0]])) == Integer.MIN_VALUE))
            ? (st[0] < 0 || st[0] >= n ? "FINITE" : "INFINITE") : "");
    }
}
