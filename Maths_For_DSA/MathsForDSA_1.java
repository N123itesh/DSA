public class MathsForDSA_1 {

    public static void main(String[] args) {
        AnyBaseToDecimal(1111,2);
        DecimalToAnyBase(15,2);
     
    }
    
    public static void AnyBaseToDecimal (int binary, int base){
        int result = 0;
        int power=0;
        while (binary>0) {
            int unitDigit = binary % 10;
            binary/=10;
            result += unitDigit * Math.pow(base , power);
            power++;
        }
        System.out.println("Result : "+ result);
    }
 
    public static void DecimalToAnyBase(int decimal, int base){
        int result  = 0; 
        int power = 0;
        while (decimal>0) {
            int unitDigit = decimal % base;
            decimal/=base;
            result += unitDigit * Math.pow(10 , power);
            power++;
        }
        System.out.println("Result : "+ result);
    }



}