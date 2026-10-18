import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new long[]{s.nextLong(), s.nextLong()} instanceof long[] p
                && Long.parseLong((p[0] + p[1] + "").replace("0", ""))
                    == Long.parseLong((p[0] + "").replace("0", "")) + Long.parseLong((p[1] + "").replace("0", ""))
                ? "YES" : "NO"));
    }
}




