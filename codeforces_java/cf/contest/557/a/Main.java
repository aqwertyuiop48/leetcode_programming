import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, 6).map(i -> s.nextInt()).toArray() instanceof int[] v
            && (Integer) Math.min(n - v[2] - v[4], v[1]) instanceof Integer d1 && (Integer) Math.min(n - d1 - v[4], v[3]) instanceof Integer d2
            ? d1 + " " + d2 + " " + (n - d1 - d2) : "");
    }
}
