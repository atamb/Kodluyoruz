import java.util.Arrays;

public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] list={1,2,2,3,3,4,5,6,6,7,7,8,8,8,9};
        int arrLength=0,arrOrder=0;
        Arrays.sort(list);
        for(int i=1;i<list.length;i++){
            if(list[i]==list[i-1]){
                arrLength++;
            }
        }
        int[] repeatingSum= new int[arrLength];
        for(int i=1;i<list.length;i++){
            if(list[i]==list[i-1] && list[i]%2==0){
                repeatingSum[arrOrder]=list[i];
                i++;
                arrOrder++;
            }
        }
        for(int i=0;i<arrLength/2;i++){
            System.out.println(repeatingSum[i]);
        }

    }
}
