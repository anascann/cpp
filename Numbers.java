import java.util.*;

public class Numbers{
	public static void main(String[] args){
		int sum=0;
		int sums=0;
		System.out.println("enter your test case");
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		for(int i=0; i<=t; i++){
			if(i%2==0){
				sum= sum+i;
				
			}
			
			}
			for(int j=1; j<=t; j++){
				if(j%2!=0)
				{
					sums=sums+j;
				}
			}System.out.println(sum + " " + sums);
	
	
	}
}

		