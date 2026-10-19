import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s
            ? IntStream.range(0, n / 2).mapToObj(i -> s.charAt(i) == 'R' && s.charAt(i + n / 2) == 'L' ? (i + n / 2 + 1) + " " + (i + 1) : (i + 1) + " " + (i + n / 2 + 1)).collect(Collectors.joining("\n")) : "");
    }
}
