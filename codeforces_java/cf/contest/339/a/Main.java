import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new Scanner(System.in).next().split("\\+")).sorted().collect(Collectors.joining("+")));
    }
}
