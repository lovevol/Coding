/**
 * Created by lh
 * on 2017/5/13.
 */
/*题目描述
世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
输入例子:
1999 2299
输出例子:
7
* */
public class Code2 {
    public static void main(String[] args) {
        int m = 1999;
        int n = 2299;
        Code2 code2 = new Code2();
        System.out.println(code2.countBitDiff(m, n));
    }

    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public int countBitDiff(int m, int n) {
        int result = 0;
        char[] M = Integer.toBinaryString(m).toCharArray();
        char[] N = Integer.toBinaryString(n).toCharArray();
        int indexM = M.length - 1;
        int indexN = N.length - 1;
        for (; ; ) {
            if (indexM >= 0 && indexN >= 0) {
                if (M[indexM--] != N[indexN--])
                    result++;
            }
            else if (indexM >= 0 ){
                if (M[indexM--] =='1')
                    result++;
            }
            else if (indexN >= 0){
                if (N[indexN--] =='1')
                    result++;
            }
            else
                break;
        }
        return result;
    }
}
