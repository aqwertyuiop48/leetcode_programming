import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Collections.list(new StringTokenizer(new String(System.in.readAllBytes()))) instanceof List<Object> h
            && Integer.valueOf(h.get(0).toString()) instanceof Integer n && Integer.valueOf(h.get(1).toString()) instanceof Integer k && h.get(2).toString().toCharArray() instanceof char[] s && new int[2] instanceof int[] w
            ? n - Math.min(IntStream.of('a', 'b').map(ch -> (w[0] = 0) + (w[1] = 0) + IntStream.range(0, n).map(r -> (s[r] != ch ? ++w[0] : w[0]) > k ? (s[w[1]++] != ch ? --w[0] : w[0]) : 0).sum() * 0 + w[1]).min().getAsInt(), n) : "");
    }
}
