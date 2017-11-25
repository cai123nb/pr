package com.cjyong.base.argorithms.util;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA By
 * User: cjyong
 * Date: 2017/11/24
 * Time: 17:41
 * Description: Base stack implement calculator.
 */
public class SimpleCalculator {
    /**
     *8
     * @param expression The expression must match the style "( 1 + 3 * ( 2 + 2 ) )"
     *                   which means every two numbers or operations (include parenthesis)
     *                   must have space blank. And the head and tail must have parenthesis.
     * @return
     */
    public static double calculate (String expression) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner scanner = new Scanner(expression);
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (s.equals("("));
            else if (s.equals("+") || s.equals("-")
                    || s.equals("*") || s.equals("/")
                    || s.equals("sqrt")) {
                //Store operations
                ops.push(s);
            } else if (s.equals(")")) {
                //Handle one operation
                String op = ops.pop();
                double val = vals.pop();
                if (op.equals("+"))
                    val = vals.pop() + val;
                else if (op.equals("-"))
                    val = vals.pop() - val;
                else if (op.equals("*"))
                    val = vals.pop() * val;
                else if (op.equals("/"))
                    val = vals.pop() / val;
                else if (op.equals("sqrt"))
                    val = Math.sqrt(val);
                vals.push(val);
            } else {
                //Store numeral value
                vals.push(Double.parseDouble(s));
            }
        }
        return vals.pop();
    }
}
