import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> s.next() instanceof String t && s.next() instanceof String a && s.next() instanceof String b ? (a.charAt(1) == b.charAt(1) && "6789TJQKA".indexOf(a.charAt(0)) > "6789TJQKA".indexOf(b.charAt(0))) || (a.charAt(1) == t.charAt(0) && b.charAt(1) != t.charAt(0)) ? "YES" : "NO" : "").ifPresent(System.out::println);
    }
}

