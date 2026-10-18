import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).map(x -> x.chars().filter(c -> c == '4' || c == '7').count()).map(c -> c > 0 && String.valueOf(c).chars().allMatch(d -> d == '4' || d == '7') ? "YES" : "NO").ifPresent(System.out::println);
    }
}
