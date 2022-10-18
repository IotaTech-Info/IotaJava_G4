package co.jp.chapter03;
import java.util.Scanner;

public class JavaHomeWork03 {
	
	public static void main(String[] args) {

        int[] coinValue = new int[] {1, 5, 10, 100, 500};  
    
        Scanner input = new Scanner(System.in);
        System.out.print("コインを記入してください: ");
        int money = input.nextInt();
        int[] savedCoins= new int[money + 1];  
 
        savedCoins[0] = 0;  

        for (int cents = 1; cents <= money; cents++) {  
            int minCoins = cents;  
            for (int kind = 0; kind < coinValue.length; kind++) {               
                if (coinValue[kind] <= cents) {  
                    int temp = savedCoins[cents - coinValue[kind]] + 1;  
                    if (temp < minCoins) {  
                        minCoins = temp;  
                    }  
                }  
            }   
            savedCoins[cents] = minCoins; 
            
            if( cents == money ){
                System.out.println((cents)+ "円のコイン数は:" + savedCoins[cents]);  
             }
           
        }
	}
}