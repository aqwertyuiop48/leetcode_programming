import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && s.next() instanceof String t
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? t.chars().mapToObj(c -> String.valueOf(Character.isUpperCase(c) ? (char) ('A' + (c - 'A' + k) % 26) : Character.isLowerCase(c) ? (char) ('a' + (c - 'a' + k) % 26) : (char) c)).collect(Collectors.joining())
            : "");
    }
}

