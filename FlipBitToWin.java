public class FlipBitToWin {
    static int longestSequence(int n){
        int before = 0;
        int after = 0;
        int maximum = 0;
        boolean beforeafter = true;
        while(n != 0){
            if((n & 1) == 1 && beforeafter){
                before++;
            }
            else if((n & 1) == 0 && beforeafter){
                before++;
                beforeafter = false;
            }
            else if((n & 1) == 1 && !beforeafter){
                after++;
            }
            else if((n & 1) == 0 && !beforeafter){
                maximum = (before + after) > maximum ? (before + after) : maximum;
                beforeafter = true;
                before = 0;
                after = 0;
            }

            n = n >>> 1;
        }

        return maximum;
    }
    static int longestSequence2(int n){
        int prev = 0;
        int curr = 0;
        int max = 0;

        while(n != 0){
            if((n&1) == 1){
                curr++;
            }
            else{
                prev = (n & 2) == 0 ? 0 : curr;
                curr = 0;
            }
            max = Math.max(prev + curr + 1, max);
            n = n >>> 1;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestSequence(1775));
        System.out.println(longestSequence2(1775));
    }
}
