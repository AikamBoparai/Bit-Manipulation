class BitHelper{
    //methods designed to help with bit manipulation
    static boolean getBit(int num, int index){
        return (num & (1 << index)) != 0;
    }
    static int setBit(int num, int index){
        return (num | (1 << index));
    }
    static int clearBit(int num, int index){
        int mask = ~(1 << index);
        return num & mask;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(8));

        System.out.println(getBit(8,3)); //Should be 1 since 1000
        System.out.println(getBit(8,0)); //0

        //convert 8 -> 12 by using set bit
        System.out.println(setBit(8,2));

        //set 8 -> to 0 bu using clearBit
        System.out.println(clearBit(8,3));
    }
}