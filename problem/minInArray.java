package problem;

public class minInArray {
    public static void main(String[] args) {
        int[] num={3,4,5,1,2};
//        int min=num[0];
//        for (int i = 1; i < num.length ; i++) {
//            if(num[i]<min){
//                min=num[i];
//            }
//        }
//        System.out.println(min);
        int  left=0;
        int right= num.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(num[mid]>num[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        System.out.println(num[left]);
    }
}
