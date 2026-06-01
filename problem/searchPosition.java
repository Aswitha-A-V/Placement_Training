package problem;

public class searchPosition {
    public static void main(String[] args) {
        int[] num={1,2,3,4,6,7,9,11};
        int target=10;
        int result=searchInsert(num,target);
        System.out.println(result);
    }
    public static int searchInsert(int[] num,int target){
        //linear
//        for (int i = 0; i < num.length; i++) {
//            if(num[i]==target){
//                return i;
//            }
//            if(target<num[i]){
//                return i;
//            }
//        }
        //binary
        int left=0;
        int right= num.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(num[mid]==target){
                return mid;
            }
            if(num[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
