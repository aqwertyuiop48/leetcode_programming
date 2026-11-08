import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Stream.of(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToDouble(Double::parseDouble).toArray() instanceof double[] t
            && Double.valueOf(Math.sqrt(t[1] * t[1] - 4 * t[0] * t[2])) instanceof Double sq
            ? String.format(java.util.Locale.US, "%.15f%n%.15f", Math.max((-t[1] + sq) / (2 * t[0]), (-t[1] - sq) / (2 * t[0])), Math.min((-t[1] + sq) / (2 * t[0]), (-t[1] - sq) / (2 * t[0]))) : "");
    }
}
