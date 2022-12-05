import java.util.Arrays;

public class FrequenceOfArrayElements {
    public static void main(String[] args) {
        int[] list={10,20,20,10,10,20,5,20};
        int repeatSum=0, j=0, count1=1, count2=1;
        System.out.print("Dizi: ");
        System.out.print(Arrays.toString(list));
        System.out.println("");
        System.out.println("Tekrar Sayıları");
        Arrays.sort(list);
        for(int i=0; i< list.length-1;i++){
            if(list[i]==list[i+1]){
                repeatSum+=1;
            }
        }
        int[] repNums= new int[repeatSum];
        for(int i=0; i< list.length-1;i++){
            if(list[i]==list[i+1]){
                repeatSum+=1;
                repNums[j]=list[i];
                j++;
            }
        }
       for(int a=0;a<repNums.length;a++){
           if(repNums[a]==repNums[0]){
               count1++;
           }
       }
        System.out.println(repNums[0]+ " sayısı " + count1 + " kere tekrar edildi.");

        for(int a=count1-1;a<repNums.length;a++){
            if(repNums[a]==repNums[count1]){
                count2++;
            }
        }
        System.out.println(repNums[count1]+ " sayısı " + count2 + " kere tekrar edildi.");
    }
}
