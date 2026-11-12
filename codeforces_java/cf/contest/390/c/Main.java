
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((IntSupplier) () -> new int[1] instanceof int[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer k && Integer.valueOf(nx.getAsInt()) instanceof Integer w
            && Integer.valueOf(IntStream.iterate(ps[0], i -> i + 1).filter(i -> buf[i] >= '0').findFirst().getAsInt()) instanceof Integer st
            && new int[n + 1] instanceof int[] pre && new int[n + 1] instanceof int[] sk
            && IntStream.rangeClosed(1, n).allMatch(i -> Integer.valueOf(buf[st + i - 1] - '0') instanceof Integer b
                && (pre[i] = pre[i - 1] + b) >= 0 && (sk[i] = (i >= k ? sk[i - k] : 0) + b) >= 0)
            && (ps[0] = st + n) > 0
            ? IntStream.range(0, w).mapToObj(q -> Integer.valueOf(nx.getAsInt()) instanceof Integer l && Integer.valueOf(nx.getAsInt()) instanceof Integer r
                ? String.valueOf(pre[r] - pre[l - 1] + (r - l + 1) / k - 2 * (sk[l - 1 + (r - l + 1) / k * k] - sk[l - 1])) : "").collect(Collectors.joining("\n")) : "");
    }
}



