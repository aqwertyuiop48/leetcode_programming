import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(t[1]) instanceof Long a && Long.valueOf(t[2]) instanceof Long b && Long.valueOf(t[3]) instanceof Long c
            ? IntStream.range(0, 64).filter(m -> (n + m % 4 + 2 * (m / 4 % 4) + 3 * (m / 16)) % 4 == 0).mapToLong(m -> a * (m % 4) + b * (m / 4 % 4) + c * (m / 16)).min().getAsLong() : "");
    }
}
