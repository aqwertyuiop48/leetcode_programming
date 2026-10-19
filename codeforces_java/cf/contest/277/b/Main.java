import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            ? m == 3 && n >= 5 ? "-1" : Stream.concat(IntStream.range(0, m).mapToObj(i -> i + " " + (i * i + 10000)), IntStream.range(0, n - m).mapToObj(i -> i + " " + (-i * i - 10000))).collect(Collectors.joining("\n")) : "");
    }
}
