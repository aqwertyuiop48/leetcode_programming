import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Stream.generate(s::next).limit(n).toList() instanceof List<String> g
            && IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, m).filter(j -> g.get(i).charAt(j) == '*').mapToObj(j -> new int[]{i + 1, j + 1})).toList() instanceof List<int[]> p
            ? (p.get(0)[0] ^ p.get(1)[0] ^ p.get(2)[0]) + " " + (p.get(0)[1] ^ p.get(1)[1] ^ p.get(2)[1])
            : "");
    }
}
