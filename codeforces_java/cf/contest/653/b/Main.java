import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer q
            && IntStream.range(0, q).mapToObj(i -> new String[]{sc.next(), sc.next()}).collect(Collectors.toList()) instanceof List<String[]> ops
            ? Stream.iterate(Set.of("a"), cur -> cur.stream().flatMap(s -> ops.stream().filter(o -> o[1].charAt(0) == s.charAt(0)).map(o -> o[0] + s.substring(1))).collect(Collectors.toSet()))
                .skip(n - 1).findFirst().get().size() : "");
    }
}
