import java.util.*;
import java.util.ArrayList; //This is the programs to show the mulitplication table of a number

class Cp1{
	public static void main(String[] args){
		int n;
		int i;
		System.out.println("enter the no. you want to enter");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		in.close();
		System.out.println("showing multiplication");
		for(i=0; i<=10; i++){
			System.out.println(n +"x"+ i+"="+n*i);
		}
	}
}