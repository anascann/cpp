import java.io.*;
class Marks
{
	int engm;
	int mathm;
	int scim;
}

class Marksdemo
{
	public static void main(String... a)
	{
	Marks obj1= new Marks();
	obj1.engm=30;
	obj1.mathm=20;
	obj1.scim=30;
	
	System.out.println("displaying first object:");
	System.out.println(obj1.engm);
	System.out.println(obj1.mathm);
	System.out.println(obj1.scim);
	}
}

	