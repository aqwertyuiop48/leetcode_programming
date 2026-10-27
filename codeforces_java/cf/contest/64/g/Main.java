import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine().trim()).ifPresent(s ->
            System.out.println(
                new ArrayDeque<String>() instanceof ArrayDeque<String> d
                && Arrays.stream(s.split("/")).filter(t -> !t.isEmpty() && !t.equals(".")).allMatch(t -> t.equals("..") ? !d.isEmpty() && d.pollLast() != null : d.add(t))
                ? "/" + String.join("/", d)
                : "-1"));
    }
}





