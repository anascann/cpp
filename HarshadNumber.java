import java.util.*;
public class HarshadNumber{
	public static void main(String[] args){
		int num;
		int rem=0;
		int sum=0;
		int n;
		System.out.println("please enter the number you want a harsahd to include");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		
	    n=num;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		
		if(n%sum==0){
			System.out.println(n+" is a harshad number");
		}
		else System.out.println(n +" is not a harshad number");
	}
}