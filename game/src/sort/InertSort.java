package sort;

/**
 * Created by wjb on 2018/9/14.
 * 直接插入排序
 */
public class InertSort {

    public static void main(String[] args) {
        int[] nums = {3,5,1,8,9,10};
        sort(nums);
        for (int i :nums){
            System.out.println(i);
        }
    }

    public static void sort(int[] nums){
        int length = nums.length;
        //要插入的数
        int insertNum;
        for (int i = 1;i<length;i++){
            //第一个数不用动，所以下标从1开始
            insertNum = nums[i];
            int j = i -1;
            while (j >= 0 && nums[j] > insertNum){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = insertNum;
        }

    }

}
