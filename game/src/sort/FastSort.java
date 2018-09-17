package sort;

/**
 * Created by wjb on 2018/9/14.
 * 快速排序
 */
public class FastSort {

    public static void main(String[] args) {
        int[] nums = {6,2,4,1,9,8,3,15};
        int start = 0;
        int end = nums.length-1;
        sort(nums,start,end);
        System.out.print("快速排序后的结果为：");
        for(int i:nums){
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] nums,int min,int max){
        int start = min;
        int end = max;
        int key = nums[min];

        while(end>start){                    //从后往前比较
            while(end>start&&nums[end]>=key)   //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(nums[end]<=key){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
            }
            //从前往后比较
            while(end>start&&nums[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if(nums[start]>=key){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            //  此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，
            //  但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }

        if(start>min) sort(nums,min,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<max) sort(nums,end+1,max);//右边序列。从关键值索引+1到最后一个
    }
}


