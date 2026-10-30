import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Double) Double.parseDouble(tk.nextToken()) instanceof Double r && (Double) Double.parseDouble(tk.nextToken()) instanceof Double v
            ? IntStream.range(0, n).mapToObj(i -> (Double) (-Double.parseDouble(tk.nextToken()) + Double.parseDouble(tk.nextToken())) instanceof Double d
                && (Double) Math.floor(d / (2 * Math.PI * r)) instanceof Double c && (Double) (d - c * 2 * Math.PI * r) instanceof Double rem
                ? String.format(Locale.US, "%.9f", c * 2 * Math.PI * r / v + Stream.iterate(new double[]{0, rem / v + 1e-9},
                    a -> v * (a[0] + a[1]) / 2 + 2 * r * Math.sin(v * (a[0] + a[1]) / 2 / (2 * r)) >= rem ? new double[]{a[0], (a[0] + a[1]) / 2} : new double[]{(a[0] + a[1]) / 2, a[1]}).skip(50).findFirst().get()[1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
