import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long x1
            && Long.valueOf(s.nextLong()) instanceof Long x2
            && Long.valueOf(s.nextLong()) instanceof Long a
            && Long.valueOf(s.nextLong()) instanceof Long b
            && Long.valueOf(Math.abs(x2 - x1)) instanceof Long d
            && Long.valueOf(Long.signum(x2 - x1)) instanceof Long dir
            ? a <= 0 ? d <= b ? "FIRST\n" + x2 : "DRAW"
                : d % (a + b) == 0 ? "SECOND"
                : d % (a + b) >= a && d % (a + b) <= b ? "FIRST\n" + (x1 + dir * (d % (a + b)))
                : "DRAW"
            : "");
    }
}
