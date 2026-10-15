import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(n ->
            System.out.println(IntStream.range(0, n).mapToObj(i -> new String[]{sc.next(), sc.next()})
                .sorted(Comparator.comparingInt(p -> List.of("rat", "woman child", "man", "captain").indexOf(p[1].equals("child") ? "woman child" : p[1].equals("woman") ? "woman child" : p[1])))
                .map(p -> p[0]).collect(Collectors.joining("\n")))));
    }
}


