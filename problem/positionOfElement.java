package problem;

public class positionOfElement {
    public static void main(String[] args) {
        int[] num={4,5,6,6};
        int target=6;
//        for (int i = 0; i < num.length; i++) {
//            if(target==num[i]){
//                System.out.println(i);
//            }
//        }
        int first=-1;
        int last=-1;
//        for (int i = 0; i < num.length; i++){
//            if(target==num[i]){
//                if(first==-1){
//                    first=i;
//                }
//                last=i;
//            }
//        }
//        System.out.println("["+first+","+last+"]");
        int left=0;
        int right= num.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (num[mid]==target){
                first=mid;
                right=mid-1;

            } else if (num[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        left=0;
        right= num.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (num[mid]==target){
                last=mid;
                left=mid+1;

            } else if (num[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println("["+first+","+last+"]");
    }
}
