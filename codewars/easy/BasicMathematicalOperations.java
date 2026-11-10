// package easy;

public class BasicMathematicalOperations {

    public static void main(String[] args) {
        System.out.println(basicMath("/", 12345, 5));
    }

    public static Integer basicMath(String op, int v1, int v2) {

        if (op == "+") {
            return v1 + v2;
        } else if (op == "-") {
            return v1 - v2;
        } else if (op == "*") {
            return v1 * v2;
        } else if (op == "/") {
            return v1 / v2;
        } else {
            return 0;
        }
    }

}
