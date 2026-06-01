package problem;

public class guessNumber {
    static int picked=6;
    public static  int guess(int num){
        if(num == picked){
            return 0;
        } else if (num<picked) {
            return 1;
        }else{
            return -1;
        }
    }
    public static int solution(int n){
// linear search
//        for (int i = 0; i <=n; i++) {
//            if(guess(i)==0){
//                return i;
//            }
//        }
        //binary search
        int low=1;
        int high =n;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(guess(mid)==0){
                return mid;
            }if(guess(mid)==1){
                low=mid+1;

            }else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result=solution(10);
        System.out.println(result);
    }
}
