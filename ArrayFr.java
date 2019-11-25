import java.util.*;
public class ArrayFr{
	public static void main(String args[]){
		int a=0;
		int count=0;
		int j,k,y;
		
		Scanner stdin=new Scanner(System.in);
		ArrayList<Integer> List= new ArrayList<Integer>();
		System.out.println("enter your limit");
		int t=stdin.nextInt();
		for(int i=0; i<=t; i++){
			 List.add(stdin.nextInt());
		}
			System.out.println(List);
			System.out.println("now for the frequency of the array elements press 1 for the contnuity");
			int z=stdin.nextInt();
			if(z==1);
			{
				for(j=0; j<=t;j++){
					for(k=j+1; k<=t; k++){
						if(List.get(j)==List.get(k)){
							count++;
						}
					}
					
						
				}		for(y=0; z<=List.size(); z++){
					z++;
				}System.out.println(List.get(y) + count);
					
}
			
	

}
}


