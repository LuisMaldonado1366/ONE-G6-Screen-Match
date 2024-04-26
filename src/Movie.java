public class Movie {
    String name;
    int releaseDate;
    int durationInMinutes;
    boolean membershipIncluded;
    private double ratingsSum;
    private int totalRatings;

    int getTotalRatings() {
        return totalRatings;
    }


    public void displayMovieSpecs() {
        System.out.printf("\n\nThe movie name is: %s", name);
        System.out.printf("\nIt's release date is: %d", releaseDate);
        System.out.printf("\nIt's duration in minutes is: %d", durationInMinutes);
    }

    public void rateMovie(double rating) {
        ratingsSum += rating;
        totalRatings++;
    }

    double calculateMean () {
        return ratingsSum / totalRatings;
    }
}
