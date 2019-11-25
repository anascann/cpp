public class Bubblesort{
	
	public void bubblesort(int arr[]){
		int n=arr.length;
		int i,j;
		for(i=0; i<n; i++){

			for(j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public void print(int arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i] + " ");
		}System.out.println("\n");
	}

	public static void main(String[] args) {
		Ab in=new Ab();
		int arr[]={64, 34, 25, 12, 22, 11, 90};
		in.bubblesort(arr);
		System.out.println("Sorted array \n");
		in.print(arr);
	}
}