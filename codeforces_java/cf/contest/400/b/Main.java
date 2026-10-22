import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> sc.next()).collect(Collectors.toList()) instanceof List<String> rows
            ? rows.stream().anyMatch(r -> r.indexOf('G') >= 0 && (r.indexOf('S') < 0 || r.indexOf('S') < r.indexOf('G'))) ? -1
                : rows.stream().filter(r -> r.indexOf('G') >= 0).map(r -> r.indexOf('S') - r.indexOf('G')).distinct().count() : "");
    }
}
