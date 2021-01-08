public class BinaryToString {
    static String decimalToBinary(double num){
        StringBuilder result = new StringBuilder();
        result.append(".");

        while(num > 0.0){
            if(result.length() > 32){
                return "Error";
            }
            
            double remainder = num * 2;
            if(remainder >= 1){
                result.append("1");
                num = remainder - 1;
            }
            else{
                result.append("0");
                num = remainder;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(0.125));
    }
}
