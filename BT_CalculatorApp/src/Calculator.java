public class Calculator {
    public static float calculate(float FirstNum, float SecondNum, char operator) {
        switch (operator) {
            case '+':
                return FirstNum + SecondNum;
            case '-':
                return FirstNum - SecondNum;
            case '*':
                return FirstNum * SecondNum;
            case '/':
                if (SecondNum != 0)
                    return FirstNum / SecondNum;
                else
                    throw new RuntimeException("không chia được cho 0 ");
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
