import java.util.*;

public class HappyNumberList{
	public static int isHappyNumber(int num){
		int sum=0;
		int rem=0;
		while(num>0){
			rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println("here it is to display the list of all the no.");
		for(int i=1; i<=100; i++){
			int result=i;
		
		
		while(result !=1 && result!= 4){
			result=isHappyNumber(result);
		}
		
		if(result==1){
			System.out.println(i + " ");
		}
	}
}
}

		
		
		