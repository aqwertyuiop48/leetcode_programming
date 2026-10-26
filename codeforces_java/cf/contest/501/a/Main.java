import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 4).map(i -> s.nextInt()).toArray() instanceof int[] v
            && (Integer) Math.max(3 * v[0] / 10, v[0] - v[0] / 250 * v[2]) instanceof Integer m
            && (Integer) Math.max(3 * v[1] / 10, v[1] - v[1] / 250 * v[3]) instanceof Integer w
            ? m > w ? "Misha" : m < w ? "Vasya" : "Tie" : "");
    }
}
