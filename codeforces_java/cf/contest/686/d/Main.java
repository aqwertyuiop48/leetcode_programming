import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer q
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] deg && new int[n + 2] instanceof int[] ord
            && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] heavy && new int[n + 1] instanceof int[] cen
            && new int[]{0} instanceof int[] tl
            && IntStream.rangeClosed(2, n).filter(i -> (deg[par[i] = v[i]]++) < 0).count() == 0
            && IntStream.range(0, n + 1).filter(i -> (sz[i] = 1) < 0).count() == 0
            && (sz[0] = 0) == 0 && (deg[0] = 1 << 30) > 0
            && IntStream.rangeClosed(1, n).filter(i -> deg[i] == 0 && (ord[tl[0]++] = i) < 0).count() == 0
            && IntStream.iterate(0, h -> h < n, h -> h + 1).filter(h -> (heavy[par[ord[h]]] = (sz[ord[h]] > sz[heavy[par[ord[h]]]] ? ord[h] : heavy[par[ord[h]]]) + 0 * (sz[par[ord[h]]] += sz[ord[h]]) + 0 * (ord[tl[0]] = par[ord[h]]) + 0 * (tl[0] += --deg[par[ord[h]]] == 0 ? 1 : 0)) < 0).count() == 0
            && IntStream.range(0, n).filter(h -> (cen[ord[h]] = heavy[ord[h]] == 0 ? ord[h] : IntStream.iterate(cen[heavy[ord[h]]], x -> par[x]).filter(x -> 2 * sz[x] >= sz[ord[h]]).findFirst().getAsInt()) < 0).count() == 0
            ? IntStream.range(0, q).mapToObj(j -> String.valueOf(cen[v[n + 1 + j]])).collect(Collectors.joining("\n")) : "");
    }
}
