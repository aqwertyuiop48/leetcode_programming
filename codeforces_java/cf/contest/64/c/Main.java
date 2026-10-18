import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()}).ifPresent(v ->
            System.out.println((v[2] - 1) % v[0] * v[1] + (v[2] - 1) / v[0] + 1)));
    }
}




