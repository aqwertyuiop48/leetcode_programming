import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String a
            && sc.next().chars().boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayDeque::new)) instanceof ArrayDeque<Integer> d
            ? a.chars().mapToObj(c -> String.valueOf((char) (!d.isEmpty() && d.peekFirst() > c ? d.pollFirst() : c))).collect(Collectors.joining())
            : "");
    }
}
