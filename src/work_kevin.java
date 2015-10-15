
import java.util.Scanner;
public class work_kevin {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try{
			System.out.println("please enter a number...");
			int userInput = sc.nextInt();
			System.out.println(userInput/10);
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
}
