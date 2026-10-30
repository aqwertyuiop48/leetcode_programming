import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("2000\n" + IntStream.range(0, 2000).mapToObj(i -> (i < 1000 ? i + 1 : 2000 - i) + " 1 " + (i < 1000 ? i + 1 : 2000 - i) + " 2").collect(Collectors.joining("\n")));
    }
}
