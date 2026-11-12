
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] a) throws Exception {
        System.out.print(IntStream.of(new Scanner(System.in).nextInt()/1000).map(n -> n==6||n==11?3:n==8||n==9?2:1).findFirst().getAsInt());
    }
}



