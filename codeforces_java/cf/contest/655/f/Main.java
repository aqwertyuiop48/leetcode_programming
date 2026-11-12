import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer k && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer q
            && Integer.valueOf(1000000) instanceof Integer mx && Long.valueOf(1000000007L) instanceof Long M && Integer.valueOf(n + q) instanceof Integer tot
            && new int[tot] instanceof int[] vals && new boolean[mx + 2] instanceof boolean[] present
            && IntStream.range(0, tot).filter(i -> (vals[i] = Integer.parseInt(tk.nextToken())) < 0 || (present[vals[i]] = true) == false).count() == 0
            && IntStream.rangeClosed(0, mx).toArray() instanceof int[] phi
            && IntStream.rangeClosed(2, mx).filter(p -> phi[p] == p).filter(p -> IntStream.rangeClosed(1, mx / p).filter(j -> (phi[j * p] -= phi[j * p] / p) < -5).count() == 0).count() >= 0
            && new int[mx + 3] instanceof int[] ds
            && IntStream.rangeClosed(1, 1000).filter(d -> IntStream.rangeClosed(1, mx / d).filter(j -> present[j * d] && ++ds[j * d + 1] < 0).count() == 0).count() >= 0
            && IntStream.rangeClosed(1, 999).filter(j -> IntStream.rangeClosed(1001, mx / j).filter(d -> present[j * d] && ++ds[j * d + 1] < 0).count() == 0).count() >= 0
            && IntStream.rangeClosed(1, mx + 1).filter(i -> (ds[i] += ds[i - 1]) < 0).count() == 0
            && ds.clone() instanceof int[] fp && new int[ds[mx + 1]] instanceof int[] divs
            && IntStream.rangeClosed(1, 1000).filter(d -> IntStream.rangeClosed(1, mx / d).filter(j -> present[j * d] && (divs[fp[j * d]++] = d) < 0).count() == 0).count() >= 0
            && IntStream.rangeClosed(1, 999).filter(j -> IntStream.rangeClosed(1001, mx / j).filter(d -> present[j * d] && (divs[fp[j * d]++] = d) < 0).count() == 0).count() >= 0
            && new long[tot + 1] instanceof long[] fact && new long[tot + 1] instanceof long[] invf && (fact[0] = 1) > 0
            && IntStream.rangeClosed(1, tot).filter(i -> (fact[i] = fact[i - 1] * i % M) < 0).count() == 0
            && (invf[tot] = BigInteger.valueOf(fact[tot]).modInverse(BigInteger.valueOf(M)).longValue()) > 0
            && IntStream.range(0, tot).filter(j -> (invf[tot - 1 - j] = invf[tot - j] * (tot - j) % M) < 0).count() == 0
            && new int[mx + 1] instanceof int[] cnt && new long[]{0} instanceof long[] st && new long[q] instanceof long[] res && Integer.valueOf(k - 1) instanceof Integer k1
            && IntStream.range(0, tot).filter(i -> Integer.valueOf(vals[i]) instanceof Integer x
                && (st[0] = (st[0] + IntStream.range(ds[x], ds[x + 1]).mapToLong(j -> Integer.valueOf(cnt[divs[j]]++) instanceof Integer c
                    ? (c >= k1 ? fact[c] * invf[k1] % M * invf[c - k1] % M : 0L) * phi[divs[j]] % M : 0L).sum()) % M) + (i >= n ? (res[i - n] = st[0]) : 0) < -1).count() == 0
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(String.valueOf((char) 10))) : "");
    }
}
