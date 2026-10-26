import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && (Integer) s.nextInt() instanceof Integer c
            && IntStream.rangeClosed(1, 1000).filter(x -> a * x < c && (c - a * x) % b == 0).boxed().toList() instanceof List<Integer> xs
            ? xs.size() + xs.stream().map(x -> "\n" + x + " " + (c - a * x) / b).collect(Collectors.joining()) : "");
    }
}
