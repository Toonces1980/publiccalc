package pajerowski.tony;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anthonypajerowski on 1/16/17.
 */
public class CalcController {

    CalcDisplay display = new CalcDisplay();
    CalcModel model = new CalcModel();
    String unaryOp = "0";

//    List<String > binary = new ArrayList<>();
//
//    {
//        binary.add("-");
//        binary.add("+");
//        binary.add("*");
//        binary.add("/");
//        binary.add("^");
//    }

    List<String> unary = new ArrayList<>(10);
    {
        unary.add("^2");
        unary.add("sqrt");
        unary.add("+/-");
        unary.add("1/x");
        unary.add("sin");
        unary.add("cos");
        unary.add("tan");
        unary.add("sin-1");
        unary.add("cos-1");
        unary.add("tan-1");
        unary.add("log");
        unary.add("10x");
        unary.add("Ln");
        unary.add("ex");
        unary.add("!");
    }

    Map<String, String> userInput = new HashMap<String, String>();

    {
        userInput.put("left", "0");
        userInput.put("binaryOp", "0");
        userInput.put("right", "0");
        userInput.put("memory", "0");
    }

    public void doMath() {

        String result = "";

        if (!unaryOp.equals("0")) {
            result = model.unary.unaryMath(userInput.get("left"), unaryOp);
            display.setScreenDisplay(result);
            updateData();
            userInput.put("left", result);
            unaryOp = "0";
        } else if (!userInput.get("binaryOp").equals("0")
                && (!userInput.get("right").equals("0"))) {
            result = model.binary.binaryMath(userInput.get("left"), userInput.get("binaryOp"), userInput.get("right"));
            display.setScreenDisplay(result);
            updateData();
            userInput.put("left", result);
        }
        display.setScreenDisplay(result);
    }


    public void parseInput(String input) throws Exception {
        if (input.split(" ").length > 1) {
            throw new Exception("Err: Multiple Token Entry");
        } else if (input.matches("-?\\d+(\\.\\d+)?")) {
            assignInputNumber(input);
        } else if (input.matches("[-/+*^]")) {
            assignInputString(input);
        } else if (unary.contains(input)) {
            unaryOp = input;
        } else if (input.equals("clear")) {
            clearData();
        } else if (input.matches("M+|MRC|MC")) {
            updateMemory(input);
        } else {
            display.setScreenDisplay("Input was not parsed");
        }
    }

    public void assignInputString(String notNum) {
        if (String.valueOf(notNum).matches("[-/+*^]")) {
            userInput.put("binaryOp", notNum);
        } else if (unary.contains(notNum)) {
            unaryOp = notNum;
        } else {
            display.setScreenDisplay("Invalid Input Error");
        }
    }

    public void assignInputNumber(String num) {
        if (userInput.get("left").equals("0")) {
            userInput.put("left", num);
            display.setScreenDisplay(num);
        } else if (userInput.get("left").equals("0") && !userInput.get("binaryOp").equals("0")){
            userInput.put("right", num);
        } else if ((!userInput.get("left").equals("0")) && !(userInput.get("binaryOp").equals("0"))){
            userInput.put("right", num);
        }
    }

    public void clearData() {
        userInput.put("left", "0");
        userInput.put("right", "0");
        userInput.put("binaryOp", "0");
        display.setScreenDisplay(userInput.get("left"));
        System.out.println(display.getScreenDisplay());
    }

    public void updateData() {
        userInput.put("right", "0");
        userInput.put("binaryOp", "0");
        display.setScreenDisplay(userInput.get("left"));
    }

    public void updateMemory(String memoryValue) {
        if (memoryValue.equals("M+")) {
            userInput.put("memory", userInput.get("left"));
        } else if (memoryValue.equals("MRC")) {
            userInput.put("left", userInput.get("memory"));
        } else if (memoryValue.equals("MC")) {
            userInput.put("memory", "0");
        } else System.out.println("you found another bug!");
    }
}