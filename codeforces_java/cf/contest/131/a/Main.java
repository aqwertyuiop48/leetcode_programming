import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(s -> System.out.print(s.substring(1).equals(s.substring(1).toUpperCase()) ? s.chars().mapToObj(c -> String.valueOf(Character.isUpperCase(c) ? (char) Character.toLowerCase(c) : (char) Character.toUpperCase(c))).collect(Collectors.joining()) : s));
    }
}

