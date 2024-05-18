import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evaluateReversePolishNotation(String[] strArr) {
        int result = 0;
        Stack<Integer> integers = new Stack<>();
        String operators = "+-*/";
        for (int i = 0; i < strArr.length; i++) {
            if (!operators.contains(strArr[i])) {
                integers.push(Integer.parseInt(strArr[i]));
            } else {
                int operand1 = integers.pop();
                int operand2 = integers.pop();
                switch (strArr[i]){
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand2 - operand1;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand2 / operand1;
                        break;
                }
                integers.push(result);

            }
        }

        return result;
    }
}
