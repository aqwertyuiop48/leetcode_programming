import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] parts
            && parts[0].getBytes() instanceof byte[] src
            && parts[1].getBytes() instanceof byte[] dst
            && (Integer) src.length instanceof Integer len
            && IntStream.range(0, 26 * (len + 1)).map(i -> -1).toArray() instanceof int[] jump
            && IntStream.range(0, len).allMatch(k -> (Integer) (len - 1 - k) instanceof Integer p
                && IntStream.range(0, 26).allMatch(ch -> (jump[p * 26 + ch] = ch == src[p] - 'a' ? p : jump[(p + 1) * 26 + ch]) >= -1))
            && new int[] {1, 0} instanceof int[] cur
            ? IntStream.range(0, dst.length).allMatch(t ->
                (Integer) (dst[t] - 'a') instanceof Integer ch
                && (Integer) jump[cur[1] * 26 + ch] instanceof Integer hit
                && (hit >= 0 || ((cur[0]++ | (cur[1] = 0)) >= 0))
                && (cur[1] = jump[cur[1] * 26 + ch] + 1) > 0)
                ? cur[0]
                : -1
            : -1);
    }
}
