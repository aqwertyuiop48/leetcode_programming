import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(IntStream.of(new Scanner(System.in).nextInt()).map(n -> n<=50000?3:n>=54000?1:2).findFirst().getAsInt());
    }
}