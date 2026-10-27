import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(v -> System.out.print((v[0] + v[2] - 1) / v[2] * ((v[0] + v[2] - 1) / v[2]) <= v[1] ? "YES" : "NO")));
    }
}






