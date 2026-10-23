import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Optional.of(new Scanner(System.in)).map(sc -> sc.nextInt() > 0 ? sc.next() : "").map(s ->
            Stream.of("vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon").filter(x -> x.matches(s)).findFirst().get()).get());
    }
}
