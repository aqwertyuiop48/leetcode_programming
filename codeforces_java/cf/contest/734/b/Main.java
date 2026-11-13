import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Stream.of(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] k
            && Long.valueOf(Math.min(k[0], Math.min(k[2], k[3]))) instanceof Long x
            ? 256 * x + 32 * Math.min(k[1], k[0] - x) : "");
    }
}
