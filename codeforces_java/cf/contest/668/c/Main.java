import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && new double[n + 1] instanceof double[] cx && new double[n + 1] instanceof double[] cn
            && IntStream.range(0, n).filter(i -> (cx[i + 1] = cx[i] + Double.parseDouble(tk[1 + i])) >= 0 & (cn[i + 1] = cn[i] + Double.parseDouble(tk[1 + n + i])) >= 0).count() >= 0
            && IntStream.rangeClosed(0, n).mapToDouble(i -> (cx[i] + cn[i] + Math.sqrt(Math.max(0, (cx[i] + cn[i]) * (cx[i] + cn[i]) - 4 * cx[i]))) / 2).toArray() instanceof double[] sp
            && IntStream.rangeClosed(0, n).mapToDouble(i -> (cx[i] + cn[i] - Math.sqrt(Math.max(0, (cx[i] + cn[i]) * (cx[i] + cn[i]) - 4 * cx[i]))) / 2).toArray() instanceof double[] sq
            ? IntStream.range(0, n).mapToObj(i -> String.format(Locale.US, "%.10f", Math.max(0, sp[i + 1] - sp[i]))).collect(Collectors.joining(" ")) + "\n"
                + IntStream.range(0, n).mapToObj(i -> String.format(Locale.US, "%.10f", Math.max(0, sq[i + 1] - sq[i]))).collect(Collectors.joining(" ")) : "");
    }
}
