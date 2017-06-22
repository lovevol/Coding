/**
 * Created by lh
 * on 2017/5/13.
 */
/*对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。
给定一个整数数组A及它的大小n，同时给定要查找的元素val，请返回它在数组中的位置(从0开始)，若不存在该元素，
返回-1。若该元素出现多次，请返回第一次出现的位置。
测试样例：
[1,3,5,7,9],5,3
返回：1
* */
public class Code1 {
    public static void main(String[] args) {
        int[] x = {1,4,4,10,21};
        int val = 4;
        System.out.println(getPos(x, x.length, val));
    }

    public static int getPos(int[] A, int n, int val) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (A[middle] == val){
                while (middle >= 0 && A[middle] == val){
                    middle--;
                }
                return middle+1;
            }
            else if (A[middle] > val) {
                right = middle - 1;
            } else if (A[middle] < val) {
                left = middle + 1;
            }
        }
        return -1;
    }
}
