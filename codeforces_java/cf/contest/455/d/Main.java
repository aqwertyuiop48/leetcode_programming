import java.nio.IntBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1 + n] instanceof Integer q
            && (Integer) 1000 instanceof Integer B
            && (Integer) ((n + B - 1) / B) instanceof Integer nb0
            && (Integer) (nb0 + q / B + 3) instanceof Integer MB
            && (Integer) (2 * B + 2) instanceof Integer CAP
            && (Integer) (n + 1) instanceof Integer V
            && new int[MB * CAP] instanceof int[] data
            && new int[MB] instanceof int[] sz
            && new int[MB] instanceof int[] ord
            && new int[MB + 2] instanceof int[] fw
            && new short[MB * V] instanceof short[] cnt
            && new int[8] instanceof int[] st
            && IntStream.range(0, n).allMatch(i ->
                (data[i / B * CAP + i % B] = tk[1 + i]) > 0
                && ++sz[i / B] > 0
                && ++cnt[tk[1 + i] * MB + i / B] > 0)
            && IntStream.range(0, nb0).allMatch(b -> (ord[b] = b) >= 0)
            && (st[0] = nb0) > 0
            && (st[5] = nb0) > 0
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] addf
            && (addf[0] = (i, d) -> i > MB ? 0 : (fw[i] += d) > -99999999 ? addf[0].applyAsInt(i + (i & -i), d) : -1) != null
            && ((IntSupplier) () ->
                IntStream.range(0, MB + 2).allMatch(i -> (fw[i] = 0) == 0)
                && IntStream.range(0, st[0]).allMatch(z -> addf[0].applyAsInt(z + 1, sz[ord[z]]) >= 0) ? 0 : 1) instanceof IntSupplier rebuild
            && rebuild.getAsInt() == 0
            && ((IntUnaryOperator) pos ->
                (st[6] = 0) == 0 && (st[3] = pos) >= 0
                && IntStream.iterate(Integer.highestOneBit(MB), p -> p > 0, p -> p >> 1).allMatch(p ->
                    st[6] + p <= st[0] && fw[st[6] + p] <= st[3] ? (st[6] += p) > 0 && (st[3] -= fw[st[6]]) >= 0 : true)
                ? st[6] : -1) instanceof IntUnaryOperator loc
            && ((IntBinaryOperator) (from, to) -> (int) IntStream.range(from, to).filter(z -> data[z] == st[7]).count()) instanceof IntBinaryOperator countEq
            && ((IntBinaryOperator) (from, to) -> IntStream.range(from, to).map(z -> cnt[st[7] * MB + ord[z]]).sum()) instanceof IntBinaryOperator sumCnt
            && new StringBuilder() instanceof StringBuilder sb
            && (ps[0] = 2 + n) > 0
            && IntStream.range(0, q).allMatch(qi ->
                (Integer) ((tk[ps[0] + 1] + st[1] - 1) % n) instanceof Integer x1
                && (Integer) ((tk[ps[0] + 2] + st[1] - 1) % n) instanceof Integer y1
                && (Integer) Math.min(x1, y1) instanceof Integer l
                && (Integer) Math.max(x1, y1) instanceof Integer r
                && (tk[ps[0]] == 1
                    ? (ps[0] += 3) > 0
                    && (l - r == 0
                        || ((Integer) loc.applyAsInt(r) instanceof Integer ib
                            && (Integer) st[3] instanceof Integer offr
                            && (Integer) ord[ib] instanceof Integer br
                            && (Integer) loc.applyAsInt(l) instanceof Integer ia
                            && (Integer) st[3] instanceof Integer offl
                            && (Integer) ord[ia] instanceof Integer bl
                            && (Integer) data[br * CAP + offr] instanceof Integer x
                            && IntBuffer.wrap(data).put(br * CAP + offr, Arrays.copyOfRange(data, br * CAP + offr + 1, br * CAP + sz[br]), 0, sz[br] - offr - 1) != null
                            && --sz[br] >= 0
                            && --cnt[x * MB + br] >= 0
                            && addf[0].applyAsInt(ib + 1, -1) >= 0
                            && IntBuffer.wrap(data).put(bl * CAP + offl + 1, Arrays.copyOfRange(data, bl * CAP + offl, bl * CAP + sz[bl]), 0, sz[bl] - offl) != null
                            && (data[bl * CAP + offl] = x) > 0
                            && ++sz[bl] > 0
                            && ++cnt[x * MB + bl] > 0
                            && addf[0].applyAsInt(ia + 1, 1) >= 0
                            && (sz[bl] < 2 * B
                                || ((Integer) st[5]++ instanceof Integer nid
                                    && IntBuffer.wrap(data).put(nid * CAP, Arrays.copyOfRange(data, bl * CAP + B, bl * CAP + sz[bl]), 0, sz[bl] - B) != null
                                    && IntStream.range(0, sz[bl] - B).allMatch(z ->
                                        --cnt[data[nid * CAP + z] * MB + bl] >= 0 && ++cnt[data[nid * CAP + z] * MB + nid] > 0)
                                    && (sz[nid] = sz[bl] - B) > 0
                                    && (sz[bl] = B) > 0
                                    && IntStream.iterate(st[0], z -> z > ia + 1, z -> z - 1).allMatch(z -> (ord[z] = ord[z - 1]) >= 0)
                                    && (ord[ia + 1] = nid) > 0
                                    && ++st[0] > 0
                                    && rebuild.getAsInt() == 0))))
                    : (Integer) tk[ps[0] + 3] instanceof Integer k0
                    && (Integer) ((k0 + st[1] - 1) % n + 1) instanceof Integer k
                    && (st[7] = k) > 0
                    && (ps[0] += 4) > 0
                    && (Integer) loc.applyAsInt(l) instanceof Integer ia
                    && (Integer) st[3] instanceof Integer offl
                    && (Integer) loc.applyAsInt(r) instanceof Integer ib
                    && (Integer) st[3] instanceof Integer offr
                    && (Integer) (ia - ib == 0
                        ? countEq.applyAsInt(ord[ia] * CAP + offl, ord[ia] * CAP + offr + 1)
                        : countEq.applyAsInt(ord[ia] * CAP + offl, ord[ia] * CAP + sz[ord[ia]])
                            + countEq.applyAsInt(ord[ib] * CAP, ord[ib] * CAP + offr + 1)
                            + sumCnt.applyAsInt(ia + 1, ib)) instanceof Integer ans
                    && (st[1] = ans) >= 0
                    && sb.append(ans).append('\n') != null))
            ? sb.toString() : "");
    }
}
