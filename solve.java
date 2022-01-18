class solve {
    static double all;
    double compute(double num1, String op, double num2) {
        if (op.equals("+")) {
            all = num1 + num2;
        }else if (op.equals("-")) {
            all = num1 - num2;
        }else if (op.equals("x")) {
                all = num1 * num2;
        }else if (op.equals("/")) {
                all = num1 / num2;
        }
        return all;
    }
}
