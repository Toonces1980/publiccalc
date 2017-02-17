package pajerowski.tony;

/**
 * Created by anthonypajerowski on 1/16/17.
 */
public class CalcBinary {

    double binaryCalcAnswer;

    public String binaryMath (String left, String binaryOp, String right) {

        switch (binaryOp) {
            case "+":
                binaryCalcAnswer = Double.parseDouble(left) + Double.parseDouble(right);
                break;
            case "-":
                binaryCalcAnswer = Double.parseDouble(left) - Double.parseDouble(right);
                break;
            case "*":
                binaryCalcAnswer = Double.parseDouble(left) * Double.parseDouble(right);
                break;
            case "/":
                binaryCalcAnswer = Double.parseDouble(left) / Double.parseDouble(right);
                break;
            case "^":
                binaryCalcAnswer = Math.pow(Double.parseDouble(left), Double.parseDouble(right));
                break;
            default:
                break;
        }
        return Double.toString(binaryCalcAnswer);
    }
}

