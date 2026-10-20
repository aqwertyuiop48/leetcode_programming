import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b
            ? Stream.iterate(new int[]{a, a}, t -> new int[]{t[0] / b + t[0] % b, t[1] + t[0] / b}).limit(200).reduce((x, y) -> y).get()[1] : "");
    }
}
