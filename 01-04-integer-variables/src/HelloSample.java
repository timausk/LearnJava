public class HelloSample {

    public static void main(String[] args) {

        System.out.println("Learning Java with intellij");

        //integerVariables();
        //doubleFloatDataTypes();
        convertingUsdIntoGbp();
    }


    private static void integerVariables() {

        System.out.println("Integer variables");

        int sum;                     // declaration  (of integer data type - number positive/negative including 0)
        sum = 1289 * (-5+100) / 25;  // assignment
        System.out.println(sum);     // usage of variable
    }

    private static void doubleFloatDataTypes() {

        System.out.println("Double and Float Data Types & concatenation");

        int sumInt = 50 / 6;
        System.out.println(sumInt);

        double sumDouble1 = 50 / 6;
        System.out.println(sumDouble1);

        double sumFloat1 = 50 / 6;
        System.out.println(sumFloat1);

        float sumFloat = 50 / 6f;
        System.out.println("The double value is: " + sumFloat);  // size of float = 4 bytes

        double sumDouble = 50 / 6d;
        System.out.println("The double value is: " + sumDouble);  // size of double = 8 bytes
    }

    private static void convertingUsdIntoGbp() {

        System.out.println("Double and Float Data Types & concatenation");


    }
}
