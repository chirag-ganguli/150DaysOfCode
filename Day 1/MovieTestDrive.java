class Movie
{
    String title;
    String genre;
    int rating;

    void playIt()
    {
        System.out.println("Playing the movie " + title + " " + genre + " " + rating);
    }
}

public class MovieTestDrive
{
    public static void main(String[] args)
    {
        Movie one = new Movie();
        one.title = "Gone with the stock";
        one.genre = "Tragic";
        one.rating = 5;

        Movie two = new Movie();
        two.title = "Lost in Space";
        two.genre = "Adventure";
        two.rating = 8;

        two.playIt();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Comedy";
        three.rating = 6;

    }
}