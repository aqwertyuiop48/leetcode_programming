import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && (Integer) new String(raw).trim().length() instanceof Integer n
            && new int[4] instanceof int[] cnt
            && new long[2] instanceof long[] res
            && IntStream.range(0, n).allMatch(i ->
                ++cnt[(raw[i] - 'a') * 2 + (i & 1)] > 0
                && (res[1] += cnt[(raw[i] - 'a') * 2 + (i & 1)]) > 0
                && (res[0] += cnt[(raw[i] - 'a') * 2 + 1 - (i & 1)]) >= 0)
            ? res[0] + " " + res[1] : "");
    }
}
