import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Double.valueOf(sc.nextDouble()) instanceof Double d && Double.valueOf(sc.nextDouble()) instanceof Double h && Double.valueOf(sc.nextDouble()) instanceof Double v && Double.valueOf(sc.nextDouble()) instanceof Double e
            && Double.valueOf(v / (Math.PI * d * d / 4) - e) instanceof Double net && net > 1e-12
            ? "YES\n" + String.format(Locale.US, "%.12f", h / net) : "NO");
    }
}
