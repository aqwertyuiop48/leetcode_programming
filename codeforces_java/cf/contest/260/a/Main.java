import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.rangeClosed(0, 9).filter(d -> (a * 10 + d) % b == 0).findFirst() instanceof OptionalInt d
            ? d.isPresent() ? a + "" + d.getAsInt() + "0".repeat(n - 1) : "-1" : "");
    }
}
