package day05;

public class Movie {

    private String title;
    private int yearOfProduction;
    private double averageRating;
    private int numberOfRatings;
    private double sumOfRatings;

    public Movie(String title, int yearOfProduction){
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public double calculateRating(int rating){
        sumOfRatings = sumOfRatings + rating;
        numberOfRatings++;
        averageRating = sumOfRatings / numberOfRatings;
        return averageRating;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getAverageRating() {
        return averageRating;
    }
}
