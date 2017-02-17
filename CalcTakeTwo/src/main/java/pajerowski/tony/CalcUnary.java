package pajerowski.tony;

/**
 * Created by anthonypajerowski on 1/16/17.
 */

public class CalcUnary {

    public double unaryAnswer;

    public String unaryMath (String left, String unaryOp) {
        unaryAnswer = Double.parseDouble(left);
        switch (unaryOp) {
            case "^2":
                unaryAnswer = Math.pow(unaryAnswer,2);
                break;
            case "sqrt":
                unaryAnswer = Math.sqrt(unaryAnswer);
                break;
            case "+/-":
                unaryAnswer = unaryAnswer * -1;
                break;
            case "1/x":
                unaryAnswer = 1/unaryAnswer;
                break;
            case "sin":
                unaryAnswer = Math.sin(Math.toRadians(unaryAnswer));
                break;
            case "cos":
                unaryAnswer = Math.cos(Math.toRadians(unaryAnswer));
                break;
            case "tan":
                unaryAnswer = Math.tan(Math.toRadians(unaryAnswer));
                break;
            case "sin-1":
                unaryAnswer = Math.asin(Math.toRadians(unaryAnswer));
                break;
            case "cos-1":
                unaryAnswer = Math.acos(Math.toRadians(unaryAnswer));
                break;
            case "tan-1":
                unaryAnswer = Math.atan(Math.toRadians(unaryAnswer));
                break;
            case "log":
                unaryAnswer = Math.log10(unaryAnswer);
                break;
            case "ln":
                unaryAnswer = Math.log(unaryAnswer);
                break;
            case "PI":
                unaryAnswer = Math.PI;
                break;
        }
        return Double.toString(unaryAnswer);
    }
}


