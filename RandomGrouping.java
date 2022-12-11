import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class RandomGrouping {
    public static void main(String[] args) {
        String[] teams = new String[9];
        String[] players = new String[9];
        Scanner scan = new Scanner(System.in);
        System.out.println("Takımları giriniz: ");
        int a=0;
        while(a<9){
            System.out.print((a+1) + ": ");
            teams[a]=scan.nextLine();
            a++;
        }
        a=0;
        System.out.println("Oyuncuları giriniz:");
        while(a<9){
            System.out.print((a+1) + ":");
            players[a]=scan.nextLine();
            a++;
        }

        List<String> teamList = Arrays.asList(teams);
        List<String> playerList = Arrays.asList(players);
        Collections.shuffle(teamList);
        Collections.shuffle(playerList);
        teamList.toArray(teams);
        playerList.toArray(players);

        for(int i=0;i<8;i++){
            System.out.println((i+1)+". takım: " + teams[i]+ " Yöneten kişi: "+ players[i]);
        }
    }

}