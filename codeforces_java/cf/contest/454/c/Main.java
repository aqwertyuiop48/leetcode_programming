import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> new int[] {sc.nextInt(), sc.nextInt()}).map(mn ->
            System.out.printf(Locale.US, "%.12f%n", mn[0] - IntStream.range(1, mn[0]).mapToDouble(k -> Math.pow((double) k / mn[0], mn[1])).sum()));
    }
}
