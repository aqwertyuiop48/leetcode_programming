import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(IntStream.range(0, s.nextInt()).mapToObj(i -> s.next()).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey()));
    }
}





