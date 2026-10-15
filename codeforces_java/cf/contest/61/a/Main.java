import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new String[]{sc.next(), sc.next()}).ifPresent(ab ->
            System.out.println(IntStream.range(0, ab[0].length()).mapToObj(i -> ab[0].charAt(i) == ab[1].charAt(i) ? "0" : "1").collect(Collectors.joining()))));
    }
}

