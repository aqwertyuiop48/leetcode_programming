import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && sc.next() instanceof String s && new int[128] instanceof int[] keys
            ? IntStream.range(0, n - 1).filter(i -> ++keys[s.charAt(2 * i)] > 0 && keys[Character.toLowerCase(s.charAt(2 * i + 1))] <= 0 || keys[Character.toLowerCase(s.charAt(2 * i + 1))]-- < 0).count() : 0);
    }
}
