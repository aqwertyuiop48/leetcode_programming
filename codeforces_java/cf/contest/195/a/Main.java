import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long a
            && Long.valueOf(s.nextLong()) instanceof Long b
            && Long.valueOf(s.nextLong()) instanceof Long c
            ? Math.max(0, (a * c + b - 1) / b - c) : "");
    }
}

