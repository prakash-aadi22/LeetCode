import java.util.Scanner;

public class q_150_Evaluate_Reverse_Polish_Notation {
    int pos;

    public int evalRPN(String[] tokens) {
        this.pos = tokens.length - 1;
        return evaluate(tokens);
    }

    public int evaluate(String[] t) {
        String token = t[pos];
        pos--;
//        if (token.equals("+")) {
//            return evaluate(t) + evaluate(t);
//        } else if (token.equals("*")) {
//            return evaluate(t) * evaluate(t);
//        } else if (token.equals("-")) {
//            return -evaluate(t) + evaluate(t);
//        } else if (token.equals("/")) {
//            int right = evaluate(t);
//            return evaluate(t) / right;
//        } else {
//            return Integer.parseInt(token);
//        }
        switch (token) {
            case "+" -> {
                return evaluate(t) + evaluate(t);
            }
            case "*" -> {
                return evaluate(t) * evaluate(t);
            }
            case "-" -> {
                return -evaluate(t) + evaluate(t);
            }
            case "/" -> {
                int right = evaluate(t);
                return evaluate(t) / right;
            }
            default -> {
                return Integer.parseInt(token);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression in Reverse Polish Notation: ");
        String expression = sc.nextLine();
        String[] tokens = expression.split(" ");
        q_150_Evaluate_Reverse_Polish_Notation evaluator = new q_150_Evaluate_Reverse_Polish_Notation();
        int result = evaluator.evalRPN(tokens);
        System.out.println("Result: " + result);
    }
}
