import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, 2 * n).mapToDouble(i -> Double.parseDouble(tk.nextToken())).toArray() instanceof double[] t
            && new double[n + 1] instanceof double[] cx && new double[n + 1] instanceof double[] cn && new double[n + 1] instanceof double[] sa && new double[n + 1] instanceof double[] sb
            && Stream.of(0).peek(z -> Arrays.setAll(cx, i -> i == 0 ? 0 : cx[i - 1] + t[i - 1])).findFirst().isPresent()
            && Stream.of(0).peek(z -> Arrays.setAll(cn, i -> i == 0 ? 0 : cn[i - 1] + t[n + i - 1])).findFirst().isPresent()
            && Stream.of(0).peek(z -> Arrays.setAll(sa, i -> (cx[i] + cn[i] + Math.sqrt(Math.max(0, (cx[i] + cn[i]) * (cx[i] + cn[i]) - 4 * cx[i]))) / 2)).findFirst().isPresent()
            && Stream.of(0).peek(z -> Arrays.setAll(sb, i -> (cx[i] + cn[i] - Math.sqrt(Math.max(0, (cx[i] + cn[i]) * (cx[i] + cn[i]) - 4 * cx[i]))) / 2)).findFirst().isPresent()
            && ((DoubleFunction<String>) v -> Long.valueOf(Math.round(Math.abs(v) * 1e10)) instanceof Long r ? (v < 0 && r > 0 ? "-" : "") + (r / 10000000000L) + "." + String.valueOf(10000000000L + r % 10000000000L).substring(1) : "") instanceof DoubleFunction<String> f
            ? IntStream.rangeClosed(1, n).mapToObj(i -> f.apply(sa[i] - sa[i - 1])).collect(Collectors.joining(" ")) + "\n" + IntStream.rangeClosed(1, n).mapToObj(i -> f.apply(sb[i] - sb[i - 1])).collect(Collectors.joining(" ")) : "");
    }
}
