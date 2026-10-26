import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && s.next() instanceof String t
            && new String[]{"", "", "2", "3", "322", "5", "53", "7", "7222", "7332"} instanceof String[] rep
            ? t.chars().mapToObj(c -> rep[c - '0']).collect(Collectors.joining()).chars().boxed().sorted(Comparator.reverseOrder()).map(c -> String.valueOf((char) (int) c)).collect(Collectors.joining()) : "");
    }
}
