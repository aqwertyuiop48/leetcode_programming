import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && sc.next() instanceof String u
            ? IntStream.range(-(u.length() - 1), s.length()).map(k -> u.length() - (int) IntStream.range(Math.max(0, -k), Math.min(u.length(), s.length() - k)).filter(i -> u.charAt(i) == s.charAt(i + k)).count()).min().getAsInt()
            : 0);
    }
}

