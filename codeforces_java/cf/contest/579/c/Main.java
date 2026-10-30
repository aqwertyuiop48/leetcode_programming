import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long a && (Long) s.nextLong() instanceof Long b
            ? (a < b ? "-1" : String.format(Locale.US, "%.12f", (a + b) / (2.0 * ((a + b) / (2 * b))))) : "");
    }
}
