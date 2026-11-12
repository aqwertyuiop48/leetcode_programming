import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).skip(1).toArray(String[]::new) instanceof String[] rows
            && IntStream.range(0, rows.length).filter(i -> rows[i].contains("OO")).findFirst() instanceof OptionalInt o
            ? (o.isEmpty() ? "NO" : "YES\n" + IntStream.range(0, rows.length).mapToObj(i -> i == o.getAsInt() ? rows[i].replaceFirst("OO", "++") : rows[i]).collect(Collectors.joining("\n"))) : "");
    }
}
