public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Long.valueOf(s.chars().filter(c -> c == 'R').count() - s.chars().filter(c -> c == 'L').count()) instanceof Long x
            && Long.valueOf(s.chars().filter(c -> c == 'U').count() - s.chars().filter(c -> c == 'D').count()) instanceof Long y
            ? (s.length() % 2 == 1 ? (Object) (-1) : (Object) ((Math.abs(x) + Math.abs(y)) / 2)) : "");
    }
}
