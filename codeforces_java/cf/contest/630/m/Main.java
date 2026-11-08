import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(Long.parseLong(new String(System.in.readAllBytes()).trim())) instanceof Long n
            && Long.valueOf(((-n % 360) + 360) % 360) instanceof Long img
            ? IntStream.range(0, 4).boxed().min((p, q) -> Long.compare(Math.min((img + 90 * p) % 360, 360 - (img + 90 * p) % 360) % 360, Math.min((img + 90 * q) % 360, 360 - (img + 90 * q) % 360) % 360) != 0
                ? Long.compare(Math.min((img + 90 * p) % 360, 360 - (img + 90 * p) % 360) % 360, Math.min((img + 90 * q) % 360, 360 - (img + 90 * q) % 360) % 360) : p - q).get() : 0);
    }
}
