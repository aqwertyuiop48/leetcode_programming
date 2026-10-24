import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1] instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> (long) tk[3 + 2 * i] << 31 | (long) tk[2 + 2 * i] << 1 | 1L).sorted().toArray() instanceof long[] ks
            && new long[m + 1] instanceof long[] pre
            && IntStream.range(0, m).allMatch(i ->
                (pre[i + 1] = (pre[i]
                    + pre[-Arrays.binarySearch(ks, (ks[i] >> 31) << 31) - 1]
                    - pre[-Arrays.binarySearch(ks, ((ks[i] >> 1) & 1073741823L) << 31) - 1]
                    + (((ks[i] >> 1) & 1073741823L) == 0 ? 1 : 0)
                    + 1000000007L) % 1000000007L) >= 0)
            ? (pre[m] - pre[-Arrays.binarySearch(ks, (long) n << 31) - 1] + 1000000007L) % 1000000007L : "");
    }


}
