import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt()}).ifPresent(cur -> System.out.println(
            Pattern.compile("([+-]?)(?:(\\d+)\\*)?(a\\+\\+|\\+\\+a)").matcher(s.next()).results()
                .map(r -> new long[]{(r.group(1).equals("-") ? -1 : 1) * (r.group(2) == null ? 1 : Long.parseLong(r.group(2))), r.group(3).startsWith("+") ? 1 : 0})
                .sorted(Comparator.comparingLong(t -> t[0]))
                .mapToLong(t -> t[0] * (cur[0]++ + t[1]))
                .sum())));
    }
}





