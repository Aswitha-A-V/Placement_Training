package problem;

public class peekElement {
    public static void main(String[] args) {
        int[] num={1,2,6,7,4};
//        for (int i = 1; i < num.length-2 ; i++) {
//            if((num[i]>num[i-1]) &&( num[i]>num[i+1])){
//                System.out.println(i);
//            }
//        }
        int r = num.length - 1;

//        for (int i = 1; i < num.length-1 ; i++) {
//
//
//            if (num[i] > num[i + 1]) {
//                r = i;
//                break;
//            }
//        }
//        System.out.println(r);
        int left=0;
        int right= num.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(num[mid]>num[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        System.out.println(left);
    }
}
