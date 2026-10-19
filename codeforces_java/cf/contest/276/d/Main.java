import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long l && Long.valueOf(s.nextLong()) instanceof Long r
            ? l.equals(r) ? 0L : (1L << (64 - Long.numberOfLeadingZeros(l ^ r))) - 1 : "");
    }
}
