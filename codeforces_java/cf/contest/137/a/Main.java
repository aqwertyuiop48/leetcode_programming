import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            Arrays.stream(new Scanner(System.in).next().split("(?<=(.))(?!\\1)")).mapToInt(r -> (r.length() + 4) / 5).sum());
    }
}

