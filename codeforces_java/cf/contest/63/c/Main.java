import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new String[]{sc.next(), sc.next(), sc.next()}).toList() instanceof List<String[]> g
                && IntStream.range(0, 10000).mapToObj(x -> String.format("%04d", x)).filter(s -> s.chars().distinct().count() == 4
                    && g.stream().allMatch(q -> IntStream.range(0, 4).filter(i -> s.charAt(i) == q[0].charAt(i)).count() == Integer.parseInt(q[1])
                        && IntStream.range(0, 4).filter(i -> s.charAt(i) != q[0].charAt(i) && s.indexOf(q[0].charAt(i)) >= 0).count() == Integer.parseInt(q[2]))).toList() instanceof List<String> res
                ? (res.size() == 1 ? res.get(0) : res.isEmpty() ? "Incorrect data" : "Need more data")
                : "")));
    }
}


