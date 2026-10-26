import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer xp && (Integer) s.nextInt() instanceof Integer yp && (Integer) s.nextInt() instanceof Integer xv && (Integer) s.nextInt() instanceof Integer yv
            ? xp + yp <= Math.max(xv, yv) || xp <= xv && yp <= yv ? "Polycarp" : "Vasiliy" : "");
    }
}
