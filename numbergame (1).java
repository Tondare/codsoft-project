
import java.util.Scanner;
 public class numbergame
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int chances=4;
	int finals=4;
	boolean PlayAgain=true;
	System.out.print("welcome gamer!");
	System.out.println("Hey gamer you have about "+chances+" chances to win the game");
	while(PlayAgain){
	    int rand=getrandN(1,100);
	    boolean guessNO=false;
	    for(int i=0;i<chances;i++){
	        System.out.println("chance "+(i+1)+" enter your guessNO:");
	        int user=sc.nextInt();
	        if (user==rand){
	            guessNO=true;
	            finals=4;
	            System.out.println("congrats you won the game.");
	            break;
	        }
	        else if(user>rand){
	            System.out.println("Too High number");
	        }
	        else{
	            System.out.println(" Too Low number");
	        }
	    }
	    if (guessNO==false){
	        System.out.println("oops..sorry gamer. you lost the chances. the number is "+rand);
	    }
	    
	    System.out.println("Do you want to play Again(Yes/No)");
	       String pA=sc.next();
	    PlayAgain= pA.equalsIgnoreCase("Yes");
	 }
	 System.out.println("That's it gamer ...Hope you enjoyed this game");
	 System.out.println("Here is your score" +finals);
	 }
	 public static int getrandN(int min,int max){
     	   return(int)(Math.random()*(max-min+1)+min);
	   }
}
