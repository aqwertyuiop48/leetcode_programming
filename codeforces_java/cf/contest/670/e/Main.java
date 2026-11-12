import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[2]) instanceof Integer p0
            && new int[n + 2] instanceof int[] mt && new int[n + 2] instanceof int[] nx && new int[n + 2] instanceof int[] pv && new int[n + 2] instanceof int[] stk
            && new int[]{0, p0} instanceof int[] st
            && (nx[0] = 1) + (pv[n + 1] = n) > 0
            && IntStream.rangeClosed(1, n).filter(i -> (nx[i] = i + 1) + (pv[i] = i - 1) >= 0
                && (t[3].charAt(i - 1) == '(' ? (stk[st[0]++] = i) : (mt[mt[i] = stk[--st[0]]] = i)) >= 0).count() >= 0
            && t[4].chars().filter(c -> (c == 'L' ? (st[1] = pv[st[1]])
                : c == 'R' ? (st[1] = nx[st[1]])
                : (Integer.valueOf(Math.min(st[1], mt[st[1]])) instanceof Integer l && Integer.valueOf(Math.max(st[1], mt[st[1]])) instanceof Integer r
                    && (nx[pv[l]] = nx[r]) >= 0 && (pv[nx[r]] = pv[l]) >= 0 && (st[1] = nx[r] <= n ? nx[r] : pv[l]) >= 0 ? 1 : 0)) >= 0).count() >= 0
            ? IntStream.iterate(nx[0], j -> j <= n, j -> nx[j]).mapToObj(j -> String.valueOf(t[3].charAt(j - 1))).collect(Collectors.joining()) : "");
    }
}
