package com.tuwaner.linearlist.array;

/**
 *
 * 2.1.1 Remove Duplicates from Sorted Array
 描述
 Given a sorted array, remove the duplicates in place such that each element appear only once
 and return the new length.
 Do not allocate extra space for another array, you must do this in place with constant memory.
 For example, Given input array A = [1,1,2],
 Your function should return length = 2, and A is now [1,2]
 * @author
 * @date 2018/6/19
 */
public class RDSA {
    public static int removeDuplicates(int[] arr){
        if(arr.length==0){
            return 0;
        }

        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[index] != arr[i]){
                arr[++index] = arr[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,4,4,5,6,7,8,10};
        int result = removeDuplicates(arr);
        System.out.println(result);
    }
}
