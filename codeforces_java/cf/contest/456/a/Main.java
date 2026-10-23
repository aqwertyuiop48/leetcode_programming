import java.util.*;
import java.util.stream.*;

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
            && IntStream.range(0, n).mapToLong(i -> ((long) tk[1 + 2 * i] << 20) | tk[2 + 2 * i]).sorted().toArray() instanceof long[] s
            ? IntStream.range(1, n).anyMatch(i -> (s[i - 1] & 1048575) > (s[i] & 1048575)) ? "Happy Alex" : "Poor Alex" : "");
    }
}
