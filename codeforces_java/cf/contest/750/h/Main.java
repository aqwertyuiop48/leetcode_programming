
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer h && Integer.valueOf(sc.nextInt()) instanceof Integer w0 && Integer.valueOf(sc.nextInt()) instanceof Integer q
            && Integer.valueOf(w0 + 2) instanceof Integer W && Integer.valueOf((h + 2) * W) instanceof Integer NN && Integer.valueOf(2 + h * w0) instanceof Integer cnt
            && new int[NN] instanceof int[] bk && new int[NN] instanceof int[] idm && new int[cnt + 1] instanceof int[] fa && new int[cnt + 1] instanceof int[] rt
            && IntStream.rangeClosed(1, h).allMatch(r -> sc.next() instanceof String row
                && IntStream.range(0, w0).allMatch(c -> (bk[r * W + c + 1] = row.charAt(c) == '#' ? 1 : 0) >= 0 && (idm[r * W + c + 1] = 2 + (r - 1) * w0 + c + 1) > 0))
            && IntStream.rangeClosed(1, h).allMatch(r -> (bk[r * W] = 1) == 1 && (bk[r * W + w0 + 1] = 1) == 1 && (idm[r * W] = 1) == 1 && (idm[r * W + w0 + 1] = 2) == 2)
            && IntStream.rangeClosed(1, w0).allMatch(c -> (bk[c] = 1) == 1 && (bk[(h + 1) * W + c] = 1) == 1 && (idm[c] = 2) == 2 && (idm[(h + 1) * W + c] = 1) == 1)
            && new int[]{-W, -W + 1, 1, W + 1, W, W - 1, -1, -W - 1} instanceof int[] off
            && new int[NN] instanceof int[] lab && new int[NN] instanceof int[] qu && new int[NN + 2] instanceof int[] tS && new int[NN + 2] instanceof int[] tT && new int[NN + 2] instanceof int[] fid && new int[6] instanceof int[] fs
            && (fs[0] = -1) < 0 && IntStream.iterate(0, z -> fs[0] < NN || fs[1] < fs[2], z -> z + 1).filter(z -> fs[1] < fs[2]
                ? (fs[3] < 8
                    ? Integer.valueOf(qu[fs[1]] + off[fs[3]++]) instanceof Integer nb && (idm[nb] == 1 ? (tS[fs[4]] = 1) : idm[nb] == 2 ? (tT[fs[4]] = 1) : 0) >= 0
                        && idm[nb] >= 3 && bk[nb] == 1 && lab[nb] == 0 && (lab[nb] = fs[4]) > 0 && (qu[fs[2]++] = nb) < 0
                    : ++fs[1] < 0 || (fs[3] = 0) < 0)
                : ++fs[0] < NN && idm[fs[0]] >= 3 && bk[fs[0]] == 1 && lab[fs[0]] == 0 && (lab[fs[0]] = ++fs[4]) > 0 && (fid[fs[4]] = idm[fs[0]]) > 0
                    && (fs[1] = 0) == 0 && (fs[2] = 1) == 1 && (qu[0] = fs[0]) >= 0 && (fs[3] = 0) < 0).count() == 0
            && Boolean.valueOf(IntStream.rangeClosed(1, fs[4]).anyMatch(c -> tS[c] == 1 && tT[c] == 1)) instanceof Boolean both
            && (rt[1] = 1) == 1 && (rt[2] = both ? 1 : 2) > 0
            && IntStream.range(0, NN).allMatch(pp -> idm[pp] < 3 || (rt[idm[pp]] = lab[pp] == 0 ? idm[pp] : tS[lab[pp]] == 1 ? 1 : tT[lab[pp]] == 1 ? (both ? 1 : 2) : fid[lab[pp]]) > 0)
            && IntStream.range(0, 64).filter(z -> z / 8 < z % 8).toArray() instanceof int[] pz
            && IntStream.range(0, rt[1] == rt[2] ? 0 : NN).filter(p -> idm[p] >= 3 && p != W + 1 && p != h * W + w0 && bk[p + off[0]] + bk[p + off[1]] + bk[p + off[2]] + bk[p + off[3]] + bk[p + off[4]] + bk[p + off[5]] + bk[p + off[6]] + bk[p + off[7]] >= 2).toArray() instanceof int[] cand
            && IntStream.range(0, NN).map(pp -> rt[idm[pp]]).toArray() instanceof int[] rc && new int[]{-1, -1, 0, 1, 1, 1, 0, -1} instanceof int[] DX && new int[]{0, 1, 1, 1, 0, -1, -1, -1} instanceof int[] DY
            && IntStream.range(0, 64).filter(z -> z / 8 < z % 8 && Math.max(Math.abs(DX[z / 8] - DX[z % 8]), Math.abs(DY[z / 8] - DY[z % 8])) >= 2).boxed().flatMapToLong(z -> Arrays.stream(cand).filter(p -> bk[p + off[z / 8]] == 1 && bk[p + off[z % 8]] == 1 && rc[p + off[z / 8]] != rc[p + off[z % 8]])
                .mapToLong(p -> ((long) Math.min(rc[p + off[z / 8]], rc[p + off[z % 8]]) << 32) | Math.max(rc[p + off[z / 8]], rc[p + off[z % 8]]))).sorted().toArray() instanceof long[] keys
            && Boolean.valueOf(rt[1] == rt[2] || Arrays.binarySearch(keys, ((long) Math.min(rt[1], rt[2]) << 32) | Math.max(rt[1], rt[2])) >= 0) instanceof Boolean flag
            && IntStream.range(0, q).allMatch(qi -> Integer.valueOf(sc.nextInt()) instanceof Integer k
                && IntStream.range(0, k).map(i -> sc.nextInt() * W + sc.nextInt()).toArray() instanceof int[] pos
                && (flag ? System.out.append("NO\n") != null
                    : IntStream.range(0, k).allMatch(i -> (bk[pos[i]] = 1) == 1)
                    && IntStream.concat(IntStream.of(rt[1], rt[2]), Arrays.stream(pos).flatMap(u -> IntStream.concat(IntStream.of(idm[u]), IntStream.range(0, 8).map(d -> u + off[d]).filter(nb -> bk[nb] == 1).map(nb -> rt[idm[nb]])))).sorted().distinct().toArray() instanceof int[] stk
                    && IntStream.range(0, stk.length).toArray() instanceof int[] dd
                    && ((IntUnaryOperator) x -> IntStream.iterate(x, r -> dd[r] != r, r -> dd[r]).reduce(x, (a, b) -> dd[b])) instanceof IntUnaryOperator dfind
                    && Arrays.stream(pos).allMatch(u -> IntStream.range(0, 8).map(d -> u + off[d]).filter(nb -> bk[nb] == 1)
                        .allMatch(nb -> (dd[dfind.applyAsInt(Arrays.binarySearch(stk, rt[idm[nb]]))] = dfind.applyAsInt(Arrays.binarySearch(stk, idm[u]))) >= 0))
                    && Integer.valueOf(dfind.applyAsInt(Arrays.binarySearch(stk, rt[1]))) instanceof Integer ps && Integer.valueOf(dfind.applyAsInt(Arrays.binarySearch(stk, rt[2]))) instanceof Integer pt
                    && IntStream.range(0, stk.length).map(i -> dfind.applyAsInt(i) == ps ? 1 : dfind.applyAsInt(i) == pt ? 2 : 0).toArray() instanceof int[] g
                    && new boolean[stk.length] instanceof boolean[] nw && Arrays.stream(pos).allMatch(u -> (nw[Arrays.binarySearch(stk, idm[u])] = true))
                    && IntStream.range(0, stk.length).filter(i -> g[i] == 1 && !nw[i]).toArray() instanceof int[] s0 && IntStream.range(0, stk.length).filter(i -> g[i] == 2 && !nw[i]).toArray() instanceof int[] t0
                    && System.out.append(ps.intValue() == pt || Arrays.stream(s0).anyMatch(i -> Arrays.stream(t0).anyMatch(j -> Arrays.binarySearch(keys, ((long) Math.min(stk[i], stk[j]) << 32) | Math.max(stk[i], stk[j])) >= 0))
                        || Arrays.stream(pos).anyMatch(u -> Integer.valueOf(g[Arrays.binarySearch(stk, idm[u])]) instanceof Integer gu && gu != 0
                            && IntStream.range(0, 8).map(d -> u + off[d]).anyMatch(c -> idm[c] >= 3 && c != W + 1 && c != h * W + w0
                                && IntStream.range(0, 8).map(d -> c + off[d]).anyMatch(pn -> pn != u && Integer.valueOf(Arrays.binarySearch(stk, rt[idm[pn]])) instanceof Integer ix && ix >= 0 && g[ix] == 3 - gu)))
                        ? "NO\n" : "YES\n") != null
                    && IntStream.range(0, k).allMatch(i -> (bk[pos[i]] = 0) == 0)))
            ? "" : "");
    }
}
