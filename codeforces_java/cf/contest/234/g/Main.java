import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n && Integer.valueOf(32 - Integer.numberOfLeadingZeros(n - 1)) instanceof Integer k
            ? k + IntStream.iterate(k - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> IntStream.range(0, n).filter(p -> (p >> i & 1) == 0).boxed().toList() instanceof List<Integer> team
                ? "\n" + team.size() + team.stream().map(p -> " " + (p + 1)).collect(Collectors.joining()) : "").collect(Collectors.joining()) : "");
    }
}
