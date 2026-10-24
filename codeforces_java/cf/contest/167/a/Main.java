import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Double) Double.parseDouble(tk.nextToken()) instanceof Double a && (Double) Double.parseDouble(tk.nextToken()) instanceof Double d && new double[]{0} instanceof double[] prev
            ? IntStream.range(0, n).mapToObj(i -> (Double) Double.parseDouble(tk.nextToken()) instanceof Double t && (Double) Double.parseDouble(tk.nextToken()) instanceof Double v
                    && (Double) (t + (v * v / (2 * a) >= d ? Math.sqrt(2 * d / a) : v / a + (d - v * v / (2 * a)) / v)) instanceof Double arrive
                    && (prev[0] = Math.max(prev[0], arrive)) >= 0 && (Long) Math.round(prev[0] * 1e7) instanceof Long y ? (y / 10000000) + "." + String.valueOf(10000000 + y % 10000000).substring(1) : "").collect(Collectors.joining("\n"))
            : "");
    }
}
