package test;

/**
 * @author THY
 * @date 2019/3/16
 */
public class BitCompute {

    int getMaxInt() {
        return (1 << 31) - 1;//2147483647， 由于优先级关系，括号不可省略
    }

    int getMaxInt2() {
        return ~(1 << 31);//2147483647
    }

    int getMaxInt3() {//有些编译器不适用
        return (1 << -1) - 1;//2147483647
    }

    int getMinInt() {
        return 1 << 31;//-2147483648
    }

    int getMinInt2() {//有些编译器不适用
        return 1 << -1;//-2147483648
    }

    long getMaxLong() {
        return ((long) 1 << 127) - 1;//9223372036854775807
    }

    int mulTwo(int n) {//计算n * 2
        return n << 1;
    }


    int divTwo(int n) {//负奇数的运算不可用
        return n >> 1;//除以2
    }

    int mulTwoPower(int n, int m) {//计算n * ( 2^m)
        return n << m;
    }

    int divTwoPower(int n, int m) {//计算n / (2^m)
        return n >> m;
    }

    boolean isOddNumber(int n) {
        return (n & 1) == 1;
    }

    void changeTwoNumber(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
    }

    int abs(int n){
        return (n ^ (n >> 31)) - (n >> 31);
/* n>>31 取得n的符号，若n为正数，n>>31等于0，若n为负数，n>>31等于-1
若n为正数 n^0=0,数不变，若n为负数有n^-1 需要计算n和-1的补码，然后进行异或运算，
结果n变号并且为n的绝对值减1，再减去-1就是绝对值 */
    }

    //取两个数的最大值
    int max(int a,int b){
        return b & ((a-b) >> 31) | a & (~(a-b) >> 31);
        /*如果a>=b,(a-b)>>31为0，否则为-1*/
    }

    //取两个数的最小值
    int min(int a,int b){
        return a & ((a-b) >> 31) | b & (~(a-b) >> 31);
        /*如果a>=b,(a-b)>>31为0，否则为-1*/
    }

    boolean isSameSign(int x, int y){ //有0的情况例外
        return (x ^ y) >= 0; // true 表示 x和y有相同的符号， false表示x，y有相反的符号。
    }

    int getFactorialofTwo(int n){//n > 0
        return 2 << (n-1);//2的n次方
    }

    boolean isFactorialofTwo(int n){
        return n > 0 ? (n & (n - 1)) == 0 : false;
	/*如果是2的幂，n一定是100... n-1就是1111....
	   所以做与运算结果为0*/
    }

    int quyu(int m,int n){//n为2的次方
        return m & (n - 1);
	/*如果是2的幂，n一定是100... n-1就是1111....
	 所以做与运算结果保留m在n范围的非0的位*/
    }

    //求两个数的平均值
    int getAverage(int x, int y) {
        return (x + y) >> 1;
    }

    int getAverage2(int x, int y){
        return ((x ^ y) >> 1) + (x & y);
     /*(x^y) >> 1得到x，y其中一个为1的位并除以2，
       x&y得到x，y都为1的部分，加一起就是平均数了*/

    }

    //从低位到高位,取n的第m位
    int getBit(int n, int m){
        return (n >> (m-1)) & 1;
    }

    //从低位到高位.将n的第m位置为1
    int setBitToOne(int n, int m){
        return n | (1 << (m-1));
	/*将1左移m-1位找到第m位，得到000...1...000
	  n在和这个数做或运算*/
    }

    int getNAddOne(int n) {
        return -~n;
    }

    int getNSubtractOne(int n) {
        return ~-n;
    }

    //取相反数
    int getInverseNumber(int n) {
        return ~n + 1;
    }

    int getInverseNumber2(int n) {
        return (n ^ -1) + 1;
    }

    // if(x == a) x = b; if(x == b) x = a;
    int getDiffNumber(int x, int a, int b) {
        return x = a ^ b ^ x;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 52;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }
}
