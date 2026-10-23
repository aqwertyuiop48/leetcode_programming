import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(tk[1]) instanceof Integer k
            && Integer.valueOf(Math.min(n + 1, (int) (1.2 * Math.sqrt(2.0 * n / k)) + 40)) instanceof Integer c
            && new double[][] {new double[c + 1], new double[c + 1]} instanceof double[][] fs
            && IntStream.rangeClosed(0, c).mapToDouble(j -> j >= c ? 0 : (k - 1.0) / k + (j + 1) / ((double) k * (j + 2))).toArray() instanceof double[] ca
            && IntStream.rangeClosed(0, c).mapToDouble(j -> j >= c ? 0 : 1.0 / ((double) k * (j + 2))).toArray() instanceof double[] cb
            && IntStream.rangeClosed(0, c).mapToDouble(j -> j >= c ? 0 : ((j + 1) / (j + 2.0) + (j + 1) / 2.0) / k).toArray() instanceof double[] cc
            && IntStream.range(0, n).allMatch(r ->
                fs[r & 1] instanceof double[] o
                && fs[r + 1 & 1] instanceof double[] w
                && Stream.of(0).peek(x -> Arrays.setAll(w, j -> ca[j] * o[j] + cb[j] * o[Math.min(j + 1, c)] + cc[j])).findFirst().isPresent())
            ? String.format(Locale.US, "%.10f", fs[n & 1][0] * k)
            : "");
    }
}
