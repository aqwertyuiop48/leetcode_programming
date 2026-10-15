import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()}).ifPresent(v ->
            System.out.println(
                (v[2] >= v[1] - 1 && v[2] <= 2 * (v[1] + 1)) || (v[3] >= v[0] - 1 && v[3] <= 2 * (v[0] + 1)) ? "YES" : "NO")));
    }
}

