import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer x
            && DoubleStream.generate(() -> Double.parseDouble(tk.nextToken())).limit(x + 1).toArray() instanceof double[] p
            ? String.format(Locale.US, "%.10f", 1.0 - IntStream.range(0, 128).mapToDouble(kk ->
                Math.pow(IntStream.rangeClosed(0, x).mapToDouble(i -> Integer.bitCount(i & kk) % 2 == 0 ? p[i] : -p[i]).sum(), n)).sum() / 128.0) : "");
    }
}
