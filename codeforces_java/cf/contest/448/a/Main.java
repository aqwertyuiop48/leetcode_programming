import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) IntStream.range(0, 3).map(i -> s.nextInt()).sum() instanceof Integer c && (Integer) IntStream.range(0, 3).map(i -> s.nextInt()).sum() instanceof Integer m
            && (Integer) s.nextInt() instanceof Integer n && (c + 4) / 5 + (m + 9) / 10 <= n ? "YES" : "NO");
    }
}
