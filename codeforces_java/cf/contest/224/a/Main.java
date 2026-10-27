import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Double.valueOf(s.nextDouble()) instanceof Double x && Double.valueOf(s.nextDouble()) instanceof Double y && Double.valueOf(s.nextDouble()) instanceof Double z
            ? Math.round(4 * (Math.sqrt(x * z / y) + Math.sqrt(x * y / z) + Math.sqrt(y * z / x))) : "");
    }
}

