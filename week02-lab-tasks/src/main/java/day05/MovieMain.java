package day05;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Tootsie", 1978);
        System.out.println(movie.calculateRating(5));
        System.out.println(movie.calculateRating(4));
        System.out.println(movie.calculateRating(3));

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 3);
        double avgRating = movie.getAverageRating();
        System.out.println(avgRating);
        boolean isGood = (avgRating > 4);
        if (isGood){
            System.out.println("You may like this movie. Go and watch it!");
        }
    }
}
