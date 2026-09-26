import java.util.*;
class Solution {
    static int[] compare(int[] nums,int v1 ,int v2){
        int a1=-1;
        int a2=-1;
        if(v1 == v2){
        for(int i = 0; i < nums.length; i++){
        if(nums[i] == v1){
            if(a1 == -1){
                a1 = i;
            }
            else {
                a2 = i;
                break;
            }
        }
    }
}
else{
        for(int i=0;i<nums.length;i++){
            if(nums[i]==v1){
                a1=i;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==v2){
                 a2=j;
            }
        }
    }
    return new int[] {a1,a2};
 }
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int a: nums){
            arr.add(a);
        }
        Collections.sort(arr);
        int n=arr.size();
        int i=0;
        int j=n-1;
        int sum=0;
        int v1=-1;
        int v2=-1;
        while(i<j){
            sum = arr.get(i)+arr.get(j);
            if(sum==target){
                v1 = arr.get(i);
                v2 = arr.get(j);
                break;
            }
            else if(sum>target){
                j--;
            }
            else i++;
        }
        return compare(nums,v1,v2);
    }
}