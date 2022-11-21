public class Main {
    //eğer toplama fonksiyonuna 2 integer yazılırsa bu fonksiyona gelir.
    static int toplama(int a, int b){
    return a+b;
    }
    //eğer toplama fonksiyonuna 3 integer yazılırsa bu fonksiyona gelir.
    static int toplama (int a, int b, int c){
        return a+b+c;
    }
    //eğer döneceği fonksiyon return ile dönülecek bşr fonksiyon değil ise void halinde yazılır.
    static void carpma(){
        int a=5,b=3;
        System.out.println(a*b);
    }

    public static void main(String[] args){
    int sonuc= toplama(5,2);
    System.out.println(sonuc);

    int sonuc2= toplama(3,5,7);
    System.out.println(sonuc2);

    carpma();
    }

}
