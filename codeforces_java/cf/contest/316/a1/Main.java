import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? (Character.isUpperCase(s.charAt(0)) ? 9L * IntStream.range(0, (int) s.chars().filter(ch -> ch >= 'A' && ch <= 'J').distinct().count() - 1).mapToLong(i -> 9 - i).reduce(1, (x, y) -> x * y)
                : (long) IntStream.range(0, (int) s.chars().filter(ch -> ch >= 'A' && ch <= 'J').distinct().count()).mapToLong(i -> 10 - i).reduce(1, (x, y) -> x * y) * (s.charAt(0) == '?' ? 9 : 1))
                + "0".repeat((int) s.chars().filter(ch -> ch == '?').count() - (s.charAt(0) == '?' ? 1 : 0)) : "");
    }
}
