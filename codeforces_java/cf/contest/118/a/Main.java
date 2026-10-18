import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(s.next().toLowerCase().chars().filter(c -> "aeiouy".indexOf(c) < 0)
                .mapToObj(c -> "." + (char) c).collect(Collectors.joining())));
    }
}
