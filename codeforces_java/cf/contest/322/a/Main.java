import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            ? (n + m - 1) + "\n" + Stream.concat(IntStream.rangeClosed(1, m).mapToObj(j -> "1 " + j), IntStream.rangeClosed(2, n).mapToObj(i -> i + " " + m)).collect(Collectors.joining("\n")) : "");
    }
}
