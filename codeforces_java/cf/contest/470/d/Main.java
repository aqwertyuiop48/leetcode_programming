import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(k -> System.out.print(s.next().chars().mapToObj(c -> String.valueOf((char) ('A' + Math.floorMod(c - 'A' + k, 26)))).collect(Collectors.joining()))));
    }
}
