import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long a
            && Long.valueOf(s.nextLong()) instanceof Long c
            ? LongStream.range(0, 21).map(i -> Math.floorMod(c / (long) Math.pow(3, i) % 3 - a / (long) Math.pow(3, i) % 3, 3L) * (long) Math.pow(3, i)).sum()
            : -1);
    }
}
