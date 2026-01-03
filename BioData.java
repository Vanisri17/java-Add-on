package selectionprgm;
import java.util.Scanner;
public class BioData 
{
	public static void main(String[] args) 
	{
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name=ref.next();
		System.out.println("Enter Your Number: ");
		Long phone=ref.nextLong();
		System.out.println("Enter Your Age: ");
		int age=ref.nextInt();
		System.out.println("Enter Your Address: ");
		String address=ref.next();
		System.out.println(name+""+phone+""+age+""+address);
		ref.close();
	}
}
