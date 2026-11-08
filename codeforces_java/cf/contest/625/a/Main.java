import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b && Long.valueOf(s.nextLong()) instanceof Long c
            ? (a <= b - c || n < b ? n / a : Long.valueOf((n - b) / (b - c) + 1) instanceof Long k ? k + (n - k * (b - c)) / a : 0L) : 0L);
    }
}
