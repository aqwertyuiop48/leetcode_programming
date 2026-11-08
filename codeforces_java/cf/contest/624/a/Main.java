import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Double.valueOf(sc.nextDouble()) instanceof Double d && Double.valueOf(sc.nextDouble()) instanceof Double l
            && Double.valueOf(sc.nextDouble()) instanceof Double v1 && Double.valueOf(sc.nextDouble()) instanceof Double v2
            ? String.format(Locale.US, "%.10f", (l - d) / (v1 + v2)) : "");
    }
}
