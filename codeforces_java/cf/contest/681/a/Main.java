import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println((new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, s.nextInt()).filter(i -> s.next().length() > 0 && ((Integer) s.nextInt() instanceof Integer b) && ((Integer) s.nextInt() instanceof Integer a) && b >= 2400 && a > b).count() > 0) ? "YES" : "NO");
    }
}
