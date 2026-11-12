import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            ? IntStream.range(0, sc.nextInt()).mapToObj(i -> sc.next().substring(4))
                .map(y -> Long.valueOf(Long.parseLong("1" + "0".repeat(y.length()))) instanceof Long pw && Long.valueOf(1989 + (pw - 10) / 9) instanceof Long st
                    ? String.valueOf(st + Math.floorMod(Long.parseLong(y) - st, pw)) : "")
                .collect(Collectors.joining("\n"))
            : "");
    }
}
