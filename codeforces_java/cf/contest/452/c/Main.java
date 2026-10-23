import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> new double[] {sc.nextInt(), sc.nextInt()}).map(nm ->
            System.out.printf(Locale.US, "%.16f%n", nm[0] * nm[1] == 1 ? 1.0 : 1.0 / nm[0] + (nm[0] - 1) * (nm[1] - 1) / (nm[0] * (nm[0] * nm[1] - 1))));
    }
}
