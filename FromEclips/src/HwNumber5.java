import java.util.Scanner;

public class HwNumber5 {

	public static void main(String[] args) {
		
		Scanner bonus=new Scanner(System.in);
		System.out.println("How long have you been wrking?");
	int work=bonus.nextInt();
	if (work>=5) {
		System.out.println("How much is your annual salary?");
	double bon=bonus.nextInt();
	if (bon>50000) {
		System.out.println("You are eligibel for 5000 bonus");
	}else { 
		System.out.println("You are eligible for 3000 bonus");}
	}else { 
		System.out.println("You need work a few more months to be qualified");
	}
	}

	}

