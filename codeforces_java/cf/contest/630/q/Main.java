import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Stream.of(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToDouble(Double::parseDouble).toArray() instanceof double[] t
            ? String.format(java.util.Locale.US, "%.12f", t[0] * t[0] * t[0] / (6 * Math.sqrt(2)) + t[1] * t[1] * t[1] / (3 * Math.sqrt(2)) + t[2] * t[2] * t[2] * (5 + Math.sqrt(5)) / 24) : "");
    }
}
