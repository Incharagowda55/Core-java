
class Movie{
    int movieId;
    String movieName;
    String hero;

    public Movie(int movieId,String movieName,String hero){
        this.movieId=movieId;
        this.movieName=movieName;
        this.hero=hero;
    }

    public void getMovieDetails(){
        System.out.println("Movie Id: "+this.movieId);
        System.out.println("Movie Name: "+this.movieName);
        System.out.println("Hero: "+this.hero);
    }
}