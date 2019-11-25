import java.util.*;
import java.util.ArrayList;
class ScannerExample{
     public static void main (String args[])
	 {
        /* code */
        Double totalmarks=0.0;
        Scanner in=new Scanner(System.in);
        ArrayList<Float> ads=new ArrayList<Float>(5);
        for(int i=0; i<5; i++){
            Float marks=in.nextFloat();
            ads.add(marks);
            }
            System.out.println(ads);
            
            for(int j=0; j<ads.size(); j++){
                totalmarks=totalmarks+ads.get(j);
            }
        System.out.println(totalmarks);
        
        System.out.println("now press 1 for cgpa resutls");
        int key= in.nextInt();
        if(key==1){
            Double cgpa=9.5*totalmarks;
            System.out.println("your cgpa is "+cgpa);
        }else{
            System.out.println("fuck off");
        }
        
       
        
        
    }
}