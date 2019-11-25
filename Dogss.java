class Dogs
{
	private int size;
	
	public int getSize(){
	return size;
	}
	public void setSize(int s){
		size=s;
	}
	
	void bark(){
		if(size>60){
			System.out.println("woof! woof!");
		}
		else if(size>14){
			System.out.println("ruff ruff");
		}
		
		else{
			System.out.println("yip yip");
		}
	}
}

class Dogss{
	public static void main(String[] args)
	{
		Dogs one=new Dogs();
		one.setSize(70);
		
		Dogs two=new Dogs();
		two.setSize(8);
		System.out.println("Dog one" + one.getSize());
		System.out.println("Dog two" + two.getSize());
		one.bark();
		two.bark();
	}
}
