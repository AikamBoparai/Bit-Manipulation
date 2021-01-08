public class Insertion {
    static int insertion(int N, int M, int i, int j){
        //first clear all the bits between i and j in N
        int firstHalfMask = ~0;
        firstHalfMask = firstHalfMask << (j +1); //all ones after j
        
        int secondHalfMask = ~0;
        secondHalfMask = (1 << i) - 1; // all ones before i

        int mask = firstHalfMask | secondHalfMask;
        mask = N & mask;
        
        M = M << i;
        return mask | M;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(insertion(1024,19,2,6)));
    }
}
