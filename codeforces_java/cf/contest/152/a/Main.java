import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Stream.generate(s::next).limit(n).toList() instanceof List<String> g
            ? IntStream.range(0, n).filter(i -> IntStream.range(0, m).anyMatch(j -> g.get(i).charAt(j) == g.stream().mapToInt(r -> r.charAt(j)).max().getAsInt())).count()
            : 0);
    }
}

