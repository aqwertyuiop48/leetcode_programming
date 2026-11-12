import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            ? IntStream.rangeClosed(1, n).mapToObj(i -> i % 2 == 1 ? "I hate" : "I love").collect(Collectors.joining(" that ")) + " it" : "");
    }
}
