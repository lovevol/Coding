/**
 * Created by lh
 * on 2017/5/18.
 */
/*
题目描述
有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
给定一个二位数组arr及题目中的参数n，请返回结果数组。
测试样例：
[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]],4
返回：[4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]
* */
public class Code15 {
    public static void main(String[] args){
        int[][] A ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = 4;
        int[] temp = arrayPrint(A,4);
        for (int i:temp)
            System.out.print(i+",");
    }
    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] result = new int[n*n];
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int k = 0; k <= i;k++){
                result[index++] = arr[k][n-i+k-1];
            }
        }
        for(int i = 1; i < n; i++){
            for(int k = i; k <= n-1;k++){
                result[index++] = arr[k][k-i];
            }
        }
        return result;
    }
}
