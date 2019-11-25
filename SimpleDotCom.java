public class SimpleDotCom{
	public static void main(String[] args){
		SimpleDotCom dot=new SimpleDotCom();
		int[] locations={2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess="2";
		String result=dot.checkYourself(userGuess);
		
		String testResult="failed";
		if(result.equals("hit")){
			testResults="passed";
		}
		System.out.println(testResult);
	}
}

// checkYourself method

public String checkyourself(String userGuess){
	int guess=Integer.parseint(stringGuess);
	String result="miss";
	
	for(int cell:locationcell){
		if(guess==cell){
		result="hit";
		numofHits++;
		break;
		}
	}
	if(numofHits==locationCells.length){
		result="kill"
	}
	System.out.println(result);
	return result;
}

//now main method

public static void main(String[] args){
	int numofGuess=0;
	SimpleDotCom theDotCom=new SimpleDotCom();
	Scanner in=new Scanner(System.in);
	int randomnum=(int) (Math.random()*5);
	
	int[] locations={randomnum, randomnum+1, randomnum+2};
	
	theDotCom.setLocationCells(locations);
	
	boolean isAlive=true;
	
	while(isAlive==true){
		String guess=in.nextline("enter a number");
		numofguess++;
		
		if(result.equals("kills"){
			isAlive=false;
		System.out.println("you took" + numofGuess + "guess");
		}
	}
}
	
		