import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Stream.generate(s::next).limit(n).toList() instanceof List<String> p
            ? IntStream.range(0, p.get(0).length()).takeWhile(i -> p.stream().allMatch(x -> x.charAt(i) == p.get(0).charAt(i))).count()
            : 0);
    }
}

