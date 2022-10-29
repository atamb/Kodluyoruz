public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, temp1, temp2;
        int arr[]=new int[10];
        a=sc.nextInt();
        for(int i=0;i<=a-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int b=0;b<=(a-1)/2;b++){
            temp1=arr[0+b];
            temp2=arr[a-b-1];
            arr[0+b]=temp2;
            arr[a-b-1]=temp1;
        }
        for(int c=0;c<=a-1;c++){
            System.out.print(arr[c]);
        }
    }
}
