import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && s.next() instanceof String t
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? Stream.generate(s::next).limit(k).mapToLong(p -> Arrays.stream(t.split("[^" + p + "]+")).mapToLong(seg -> Math.min(seg.chars().filter(c -> c == p.charAt(0)).count(), seg.chars().filter(c -> c == p.charAt(1)).count())).sum()).sum()
            : 0);
    }
}
