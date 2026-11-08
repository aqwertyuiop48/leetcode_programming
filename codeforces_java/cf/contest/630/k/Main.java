import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n
            ? n / 210 * 48 + IntStream.rangeClosed(1, (int) (n % 210)).filter(x -> x % 2 != 0 && x % 3 != 0 && x % 5 != 0 && x % 7 != 0).count() : 0);
    }
}
