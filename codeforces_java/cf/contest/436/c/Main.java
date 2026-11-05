import java.nio.ByteBuffer;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer s && (Integer) Integer.parseInt(s.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(s.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(s.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(s.nextToken()) instanceof Integer w
            && IntStream.range(0, k).mapToObj(l -> IntStream.range(0, n).mapToObj(i -> s.nextToken()).collect(Collectors.joining())).toArray(String[]::new) instanceof String[] lv
            && IntStream.range(0, k).mapToObj(i -> ByteBuffer.wrap(Arrays.copyOf(lv[i].getBytes(), 104)) instanceof ByteBuffer bb ? IntStream.range(0, 13).mapToLong(t -> bb.getLong(8 * t)).toArray() : null).toArray(long[][]::new) instanceof long[][] pk
            && new int[k][k] instanceof int[][] df && IntStream.range(0, k).map(i -> IntStream.range(0, k * 13).map(z -> df[i][z / 13] += Long.bitCount((((pk[i][z % 13] ^ pk[z / 13][z % 13]) & 0x7f7f7f7f7f7f7f7fL) + 0x7f7f7f7f7f7f7f7fL | (pk[i][z % 13] ^ pk[z / 13][z % 13])) & 0x8080808080808080L)).sum()).sum() >= 0
            && new int[k] instanceof int[] d && new int[k] instanceof int[] par && new boolean[k] instanceof boolean[] done && IntStream.range(0, k).allMatch(i -> (d[i] = n * m) > 0)
            && new long[1] instanceof long[] tot && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, k).allMatch(t -> IntStream.range(0, k).filter(i -> !done[i]).boxed().min(Comparator.comparingInt(i -> d[i])).get() instanceof Integer u && (done[u] = true) && (tot[0] += d[u]) >= 0
                && sb.append("\n").append(u + 1).append(' ').append(par[u]) != null && IntStream.range(0, k).allMatch(j -> done[j] || w * df[u][j] >= d[j] || ((d[j] = w * df[u][j]) >= 0 && (par[j] = u + 1) > 0)))
            ? tot[0] + sb.toString() : "");
    }
}

