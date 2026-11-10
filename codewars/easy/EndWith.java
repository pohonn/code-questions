public class EndWith {

    public static void main(String[] args) {
        boolean solution = solution("Hello", "");
        System.out.println(solution);
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}
