
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] a) throws Exception {
        System.out.print(IntStream.of(new Scanner(System.in).nextInt()).map(n -> n <= 1000 ? 1 : n <= 3000 ? 2 : 3).findFirst().getAsInt());
    }
}



