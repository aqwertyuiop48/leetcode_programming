import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(s -> System.out.print(s.charAt(s.indexOf('.') - 1) == '9' ? "GOTO Vasilisa." : s.charAt(s.indexOf('.') + 1) >= '5' ? s.substring(0, s.indexOf('.') - 1) + (char) (s.charAt(s.indexOf('.') - 1) + 1) : s.substring(0, s.indexOf('.'))));
    }
}




