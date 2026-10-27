import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Double.valueOf(s.nextDouble()) instanceof Double total
            && DoubleStream.generate(s::nextDouble).limit(3).toArray() instanceof double[] w
            ? Arrays.stream(w).sum() == 0 ? "0.0 0.0 0.0"
                : Arrays.stream(w).mapToObj(x -> String.format("%.10f", total * x / Arrays.stream(w).sum())).collect(Collectors.joining(" "))
            : "");
    }
}

