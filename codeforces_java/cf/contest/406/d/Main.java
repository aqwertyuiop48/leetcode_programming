import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new long[n] instanceof long[] x && new long[n] instanceof long[] y && IntStream.range(0, n).allMatch(i -> (x[i] = Long.parseLong(tk.nextToken())) >= 0 && (y[i] = Long.parseLong(tk.nextToken())) >= 0)
            && new int[n] instanceof int[] stk && new int[]{0} instanceof int[] sp && new int[18][n] instanceof int[][] up && new int[n] instanceof int[] dep
            && IntStream.range(0, n).map(i -> n - 1 - i).allMatch(i -> (IntStream.range(0, n).anyMatch(t -> !(sp[0] >= 2 && (y[stk[sp[0] - 2]] - y[i]) * (x[stk[sp[0] - 1]] - x[i]) > (y[stk[sp[0] - 1]] - y[i]) * (x[stk[sp[0] - 2]] - x[i]) && --sp[0] >= 0)) || true)
                && (up[0][i] = sp[0] == 0 ? i : stk[sp[0] - 1]) >= 0 && (dep[i] = sp[0] == 0 ? 0 : dep[up[0][i]] + 1) >= 0 && (stk[sp[0]++] = i) >= 0)
            && IntStream.range(1, 18).allMatch(k -> IntStream.range(0, n).allMatch(i -> (up[k][i] = up[k - 1][up[k - 1][i]]) >= 0))
            ? IntStream.range(0, Integer.parseInt(tk.nextToken())).mapToObj(qi -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer a0 && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer b0
                && (Integer) (dep[a0] >= dep[b0] ? a0 : b0) instanceof Integer a1 && (Integer) (dep[a0] >= dep[b0] ? b0 : a0) instanceof Integer b1
                && new int[]{a1} instanceof int[] ca && IntStream.range(0, 18).allMatch(k -> (dep[ca[0]] - dep[b1] >> k & 1) == 0 || (ca[0] = up[k][ca[0]]) >= 0) && new int[]{b1} instanceof int[] cb
                && (ca[0] == cb[0] || IntStream.range(0, 18).map(k -> 17 - k).allMatch(k -> up[k][ca[0]] == up[k][cb[0]] || ((ca[0] = up[k][ca[0]]) >= 0 && (cb[0] = up[k][cb[0]]) >= 0)) && (ca[0] = up[0][ca[0]]) >= 0)
                ? String.valueOf(ca[0] + 1) : "").collect(Collectors.joining(" ")) : "");
    }
}
