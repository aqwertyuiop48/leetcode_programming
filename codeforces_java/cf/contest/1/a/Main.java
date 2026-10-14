import java.util.*;
import java.util.stream.*;

public class Main {
    
    public static void main(String[] args)  {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(LongStream.generate(s::nextLong).limit(3).toArray()).ifPresent(a -> System.out.print((a[0] + a[2] - 1) / a[2] * ((a[1] + a[2] - 1) / a[2]))));
    }
}
