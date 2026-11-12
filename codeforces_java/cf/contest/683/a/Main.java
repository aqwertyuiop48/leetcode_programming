import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long x && Long.valueOf(s.nextLong()) instanceof Long y
            ? (x > 0 && x < a && y > 0 && y < a ? 0 : x >= 0 && x <= a && y >= 0 && y <= a ? 1 : 2) : "");
    }
}
