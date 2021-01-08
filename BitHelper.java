class BitHelper{
    //methods designed to help with bit manipulation
    boolean getBit(int num, int index){
        return (num & (1 << index)) != 0;
    }
    int setBit(int num, int index){
        return (num | (1 << index));
    }
    int clearBit(int num, int index){
        int mask = ~(1 << index);
        return num & mask;
    }
}