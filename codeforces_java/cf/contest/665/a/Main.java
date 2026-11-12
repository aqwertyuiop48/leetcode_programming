import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer ta
            && Integer.valueOf(sc.nextInt()) instanceof Integer b && Integer.valueOf(sc.nextInt()) instanceof Integer tb && sc.next().split(":") instanceof String[] h
            && Integer.valueOf(Integer.parseInt(h[0]) * 60 + Integer.parseInt(h[1])) instanceof Integer s
            ? IntStream.range(0, 1140 / b + 2).filter(k -> 300 + k * b <= 1439 && 300 + k * b < s + ta && 300 + k * b + tb > s).count() : "");
    }
}
