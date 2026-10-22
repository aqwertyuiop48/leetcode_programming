import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b && Long.valueOf(s.nextLong()) instanceof Long w
            && Long.valueOf(s.nextLong()) instanceof Long x && Long.valueOf(s.nextLong()) instanceof Long c
            ? (c <= a ? 0 : Math.ceilDiv((c - a) * w - b, w - x)) : "");
    }
}
