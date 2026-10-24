import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] buf
            && new int[buf.length / 2 + 8] instanceof int[] vals
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, buf.length).allMatch(j ->
                j < buf.length && buf[j] >= '0' && buf[j] <= '9'
                    ? (st[0] = st[0] * 10 + buf[j] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((vals[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && (Integer) vals[0] instanceof Integer total
            && (Integer) vals[1] instanceof Integer cnt
            && IntStream.range(0, cnt).mapToLong(j -> (long) vals[3 + 2 * j] << 31 | (long) vals[2 + 2 * j] << 1 | 1L).sorted().toArray() instanceof long[] ev
            && new long[cnt + 1] instanceof long[] acc
            && IntStream.range(0, cnt).allMatch(j ->
                (acc[j + 1] = (acc[j]
                    + acc[-Arrays.binarySearch(ev, (ev[j] >> 31) << 31) - 1]
                    - acc[-Arrays.binarySearch(ev, ((ev[j] >> 1) & 0x3fffffffL) << 31) - 1]
                    + (((ev[j] >> 1) & 0x3fffffffL) == 0 ? 1 : 0)
                    + (1_000_000_007L)) % (1_000_000_007L)) >= 0)
            ? (acc[cnt] - acc[-Arrays.binarySearch(ev, (long) total << 31) - 1] + (1_000_000_007L)) % (1_000_000_007L) : "");
    }


}
