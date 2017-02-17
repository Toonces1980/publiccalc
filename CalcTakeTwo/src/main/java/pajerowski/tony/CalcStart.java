package pajerowski.tony;

import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/14/17.
 */
public class CalcStart {

    static boolean inUse = true;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        CalcController controller = new CalcController();
        System.out.println(controller.display.getScreenDisplay());
        while (inUse) {
            try {
                controller.parseInput(sc.next());
            } catch (Exception e) {
                e.printStackTrace();
            }
            controller.doMath();
            System.out.print(controller.display.getScreenDisplay());
        }
    }
}
