class Movie
{
	string title;
	string genre;
	int rating;
	
	void playit()
	{
		system.out.println("playing the movie");
	}
}

public class MovieTestDrive
{
	public static void main(String[] args)
	{
		Movie one=new Movie();
		one.title("kabir sing");
		one.genre("romantic");
		one.rating=2;
		
		Movie two=new Movie();
		two.title("avengers");
		two.genre("action");
		two.rating=6;
		two.playit();
	}
}
