public class Main {
    public static void main(String[] args) {
        Movie deadpool = new Movie();
        deadpool.name = "Deadpool";
        deadpool.releaseDate = 2016;
        deadpool.durationInMinutes = 108;
        deadpool.membershipIncluded = true;

        deadpool.displayMovieSpecs();
        deadpool.rateMovie(7.8);
        deadpool.rateMovie(10);
        System.out.printf("\nTotal ratings: %d", deadpool.getTotalRatings());
        System.out.printf("\nAverage rating: %.2f", deadpool.calculateMean());


        Movie starWarsEp3 = new Movie();
        starWarsEp3.name = "Star Wars Episode 3: Revenge of the Sith";
        starWarsEp3.releaseDate = 2005;
        starWarsEp3.durationInMinutes = 140;
        starWarsEp3.membershipIncluded = false;

//        starWarsEp3.displayMovieSpecs();
    }
}
