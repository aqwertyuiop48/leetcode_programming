import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && ((IntPredicate) i -> i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) instanceof IntPredicate ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps.test(i))).findFirst().isPresent()
            && Integer.valueOf(t[0]) instanceof Integer n
            && new long[n + 1] instanceof long[] sa && new long[n + 1] instanceof long[] sb
            && IntStream.rangeClosed(1, n).allMatch(i -> (sa[i] = sa[i - 1] + t[i]) > 0 && (sb[i] = sb[i - 1] + t[n + i]) > 0)
            && Boolean.valueOf(sa[n] > sb[n]) instanceof Boolean sw
            && (sw ? sb : sa) instanceof long[] X && (sw ? sa : sb) instanceof long[] Y
            && IntStream.rangeClosed(0, n).map(i -> Arrays.binarySearch(Y, X[i])).map(idx -> (idx ^ (idx >> 31)) - (idx >> 31 & 1)).toArray() instanceof int[] J
            && new int[n + 1] instanceof int[] first && new int[2] instanceof int[] res
            && IntStream.rangeClosed(0, n).anyMatch(i -> Integer.valueOf((int) (X[i] - Y[J[i]])) instanceof Integer d
                && (first[d] != 0 ? (res[0] = first[d] - 1) >= 0 && (res[1] = i) >= 0 : (first[d] = i + 1) < 0))
            && Integer.valueOf(sw ? J[res[0]] : res[0]) instanceof Integer alo && Integer.valueOf(sw ? J[res[1]] : res[1]) instanceof Integer ahi
            && Integer.valueOf(sw ? res[0] : J[res[0]]) instanceof Integer blo && Integer.valueOf(sw ? res[1] : J[res[1]]) instanceof Integer bhi
            && new StringBuilder() instanceof StringBuilder out
            && out.append(ahi - alo).append((char) 10) != null && IntStream.rangeClosed(alo + 1, ahi).allMatch(v -> out.append(v).append((char) 32) != null)
            && out.append((char) 10).append(bhi - blo).append((char) 10) != null && IntStream.rangeClosed(blo + 1, bhi).allMatch(v -> out.append(v).append((char) 32) != null)
            ? out : "");
    }
}
