import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Stream.of(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToDouble(Double::parseDouble).toArray() instanceof double[] t
            && Double.valueOf(Math.hypot(t[2], t[3])) instanceof Double len
            && new double[][]{{0, t[5]}, {t[4] / 2, 0}, {t[6] / 2, 0}, {t[6] / 2, -t[7]}, {-t[6] / 2, -t[7]}, {-t[6] / 2, 0}, {-t[4] / 2, 0}} instanceof double[][] co
            ? Stream.of(co).map(c -> String.format(java.util.Locale.US, "%.12f %.12f", t[0] + (-t[3] * c[0] + t[2] * c[1]) / len, t[1] + (t[2] * c[0] + t[3] * c[1]) / len)).collect(Collectors.joining("\n")) : "");
    }
}
