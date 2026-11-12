import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Stream.of(sc.next(), sc.next()).toArray(String[]::new) instanceof String[] g1 && Stream.of(sc.next(), sc.next()).toArray(String[]::new) instanceof String[] g2
            && ((java.util.function.Function<String[], String>) g -> (g[0] + g[1].charAt(1) + g[1].charAt(0)).replace("X", "")) instanceof java.util.function.Function<String[], String> cyc
            ? ((cyc.apply(g2) + cyc.apply(g2)).contains(cyc.apply(g1)) ? "YES" : "NO") : "");
    }
}
