/**
 * Created by lh
 * on 2017/5/13.
 */
/*
* 题目描述
有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
给定数组A及它的大小n，请返回最大差值。
测试样例：
[10,5],2
返回：0*/
public class Code6 {
    public static void main(String[] args) {
        int[] A = {10,5};
        System.out.println(getDis(A,A.length));
    }
    public static int getDis(int[] A, int n) {
        // write code here
        int max = 0;
        int temp = 0;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++)
                if ((temp = (A[j] - A[i])) > max)
                    max = temp;
        }
        return max;
    }
}
