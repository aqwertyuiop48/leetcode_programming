import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Double.valueOf(s.nextDouble()) instanceof Double a && Double.valueOf(s.nextDouble()) instanceof Double b
            && Double.valueOf(s.nextDouble()) instanceof Double c && Double.valueOf(s.nextDouble()) instanceof Double d
            ? String.format(Locale.US, "%.12f", a / b / (1 - (1 - a / b) * (1 - c / d))) : "");
    }
}
