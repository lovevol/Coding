import java.util.Scanner;

/**
 * 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
 输入描述:
 输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割


 输出描述:
 如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".

 输入例子1:
 1010 3 101010 2

 输出例子1:
 Equal
 */
public class code20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long x1 = in.nextLong();
            long k1 = in.nextLong();
            long x2 = in.nextLong();
            long k2 = in.nextLong();
            long x1_length = String.valueOf(x1).length();
            long x1_k1_length = String.valueOf(x1).length() * k1;
            long x2_length = String.valueOf(x2).length();
            long x2_k2_length = String.valueOf(x2).length() * k2;
            if(x1_k1_length > x2_k2_length){
                System.out.println("Greater");
            }else if(x1_k1_length < x2_k2_length){
                System.out.println("Less");
            }else {
                if(x1_length == x2_length){
                    if(x1 > x2){
                        System.out.println("Greater");
                    }else if (x1 < x2){
                        System.out.println("Less");
                    }else {
                        System.out.println("Equal");
                    }

                }else {
                    String x1_str = String.valueOf(x1);
                    String x2_str = String.valueOf(x2);
                    for (int i = 0; i < x1_k1_length;i++){
                        int num1 = Integer.valueOf(x1_str.charAt((int)(i % x1_length))).intValue();
                        int num2 = Integer.valueOf(x2_str.charAt((int)(i % x2_length))).intValue();
                        if(num1 > num2){
                            System.out.println("Greater");
                            return;
                        }else if (num1 < num2){
                            System.out.println("Less");
                            return;
                        }
                    }
                    System.out.println("Equal");
                }
            }
        }
    }
}
