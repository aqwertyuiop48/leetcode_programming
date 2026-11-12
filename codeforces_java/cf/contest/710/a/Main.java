public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Integer.valueOf((s.charAt(0) == 'a' || s.charAt(0) == 'h' ? 1 : 0) + (s.charAt(1) == '1' || s.charAt(1) == '8' ? 1 : 0)) instanceof Integer e
            ? (e == 2 ? 3 : e == 1 ? 5 : 8) : "");
    }
}
