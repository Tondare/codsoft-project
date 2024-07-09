/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class currencyconverter
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double[] exchangerate={0.79,0.93,149.31,19.13,1.35};
	    System.out.println("please enter amount !");
	    double amount=sc.nextDouble();
	    System.out.println(" converting to other correncies!");
	    System.out.println("currency\t\tamount");
	    System.out.println("***************************************");
	    String[]currencies={"english pound","euro","chinese yuan","dollor","jap yen"};
	    for(int i=0; i<exchangerate.length; i++){
	        double converter=amount*exchangerate[i];
		System.out.printf("%-24s%.2f\n",currencies[i], converter);
	}
  }
}