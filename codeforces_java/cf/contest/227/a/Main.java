import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 6).mapToLong(i -> s.nextLong()).toArray() instanceof long[] p
            && Long.valueOf((p[2] - p[0]) * (p[5] - p[3]) - (p[3] - p[1]) * (p[4] - p[2])) instanceof Long cr
            ? cr > 0 ? "LEFT" : cr < 0 ? "RIGHT" : "TOWARDS" : "");
    }
}

