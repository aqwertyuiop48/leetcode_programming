import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new long[]{s.nextLong(), s.nextLong()} instanceof long[] p
                && p[0] >= p[1]
                && (p[0] - p[1]) % 2 == 0
                && ((p[0] - p[1]) / 2 & p[1]) == 0
                ? ((p[0] - p[1]) / 2) + " " + (((p[0] - p[1]) / 2) | p[1])
                : "-1"));
    }
}


