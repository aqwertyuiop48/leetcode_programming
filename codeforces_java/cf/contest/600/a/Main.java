import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).nextLine().split("[,\\x3B]", -1) instanceof String[] w
                ? Stream.of(true, false).map(f -> Arrays.stream(w).filter(x -> x.matches("0|[1-9][0-9]*") == f).toList() instanceof List<String> l
                        ? (l.isEmpty() ? "-" : "\"" + String.join(",", l) + "\"") : "").collect(Collectors.joining("\n")) : "");
    }
}
