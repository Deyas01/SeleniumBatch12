import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which city do you live?");
		
		String city=scan.next();
		System.out.println("What is the temperature in "+city+"?");
		
		int fahrenheit=scan.nextInt();
		int celsius=(fahrenheit-32)*9/5;
		System.out.println("The temperature in "+city+" is "+celsius+" degrees celsius");

}
	}

