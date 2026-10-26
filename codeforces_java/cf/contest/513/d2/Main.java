import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer c
            && new int[c] instanceof int[] ca && new int[c] instanceof int[] cb && new int[c] instanceof int[] cd
            && new int[n + 2] instanceof int[] maxL && new int[n + 2] instanceof int[] maxR
            && IntStream.range(0, c).allMatch(i -> (ca[i] = Integer.parseInt(tk.nextToken())) > 0 && (cb[i] = Integer.parseInt(tk.nextToken())) > 0
                && (cd[i] = tk.nextToken().equals("LEFT") ? 0 : 1) >= 0
                && (cd[i] == 0 ? (maxL[ca[i]] = Math.max(maxL[ca[i]], cb[i])) : (maxR[ca[i]] = Math.max(maxR[ca[i]], cb[i]))) >= 0)
            && new int[n + 2] instanceof int[] stV && new int[n + 2] instanceof int[] stReq && new int[n + 2] instanceof int[] stStage
            && new int[n + 2] instanceof int[] lend && new int[n + 2] instanceof int[] end && new int[n + 2] instanceof int[] out
            && new int[]{1, 0, 0, 1} instanceof int[] st && (stV[0] = 1) > 0 && (stReq[0] = n) > 0
            && ((BiPredicate<Integer, Integer>) (nv, rq) -> (stV[st[0]] = nv) > 0 && (stReq[st[0]] = rq) > 0 && (stStage[st[0]] = 0) == 0 && ++st[0] > 0) instanceof BiPredicate<Integer, Integer> push
            && IntStream.generate(() -> 0).takeWhile(z -> st[0] > 0 && st[3] == 1).allMatch(z ->
                (Integer) (st[0] - 1) instanceof Integer f && (Integer) stV[f] instanceof Integer v
                && (stStage[f] == 0
                    ? maxL[v] > v ? v + 1 <= n ? (stStage[f] = 1) > 0 && push.test(v + 1, maxL[v]) : (st[3] = 0) == 0 : (lend[v] = v) > 0 && (stStage[f] = 2) > 0
                    : stStage[f] == 1
                    ? st[2] >= maxL[v] ? (lend[v] = st[2]) > 0 && (stStage[f] = 2) > 0 : (st[3] = 0) == 0
                    : stStage[f] == 2
                    ? (out[st[1]++] = v) > 0 && (Integer) Math.max(maxR[v], stReq[f]) instanceof Integer nr
                        && (nr > lend[v] ? lend[v] + 1 <= n ? (stStage[f] = 3) > 0 && push.test(lend[v] + 1, nr) : (st[3] = 0) == 0
                            : (end[v] = lend[v]) >= 0 && (st[2] = lend[v]) >= 0 && --st[0] >= 0)
                    : st[2] >= Math.max(maxR[v], stReq[f]) ? (end[v] = st[2]) > 0 && --st[0] >= 0 : (st[3] = 0) == 0))
            ? st[3] == 1 && st[2] == n && IntStream.range(0, c).allMatch(i -> cd[i] == 0 ? cb[i] > ca[i] && cb[i] <= lend[ca[i]] : cb[i] > lend[ca[i]] && cb[i] <= end[ca[i]])
                ? IntStream.range(0, n).mapToObj(i -> String.valueOf(out[i])).collect(Collectors.joining(" ")) : "IMPOSSIBLE"
            : "IMPOSSIBLE");
    }
}
