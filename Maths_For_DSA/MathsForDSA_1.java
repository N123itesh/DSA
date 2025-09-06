public class MathsForDSA_1 {

    public static void main(String[] args) {
        AnyBaseToDecimal(1111, 2);
        DecimalToAnyBase(15, 2);
        findEvenOdd(15);
        reverseNum(1234);
        power(2, 3);
        fastExponentiation(2, 3);

    }

    public static void AnyBaseToDecimal(int binary, int base) {
        int result = 0;
        int power = 0;
        while (binary > 0) {
            int unitDigit = binary % 10;
            binary /= 10;
            result += unitDigit * Math.pow(base, power);
            power++;
        }
        System.out.println("Result : " + result);
    }

    public static void DecimalToAnyBase(int decimal, int base) {
        int result = 0;
        int power = 0;
        while (decimal > 0) {
            int unitDigit = decimal % base;
            decimal /= base;
            result += unitDigit * Math.pow(10, power);
            power++;
        }
        System.out.println("Result : " + result);
    }

    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void reverseNum(int num) {

        int revNum = 0;
        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse is: " + revNum);
    }

    public static double power(int num, int power) {
        double res = 1;
        for (int i = 0; i < power; i++) {
            res = res * num;
        }
        System.out.println(res);
        return res;
    }

    public static double fastExponentiation(int num, int power) {
        double res = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                res = res * num;
            }
            power /= 2;
            num = num * num;
        }
        System.out.println(res);
        return res;
    }

}