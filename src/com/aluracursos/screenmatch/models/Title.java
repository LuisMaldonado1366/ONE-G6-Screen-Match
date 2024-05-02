package com.aluracursos.screenmatch.models;

public class Title {
    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean membershipIncluded;
    private double ratingsSum;
    private int totalRatings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isMembershipIncluded() {
        return membershipIncluded;
    }

    public double getRatingsSum() {
        return ratingsSum;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setMembershipIncluded(boolean membershipIncluded) {
        this.membershipIncluded = membershipIncluded;
    }

    public int getTotalRatings() {
        return totalRatings;
    }


    public void displayMovieSpecs() {
        System.out.printf("\n\nThe movie name is: %s", name);
        System.out.printf("\nIt's release date is: %d", releaseDate);
        System.out.printf("\nIt's duration in minutes is: %d", getDurationInMinutes());
    }

    public void rateMovie(double rating) {
        ratingsSum += rating;
        totalRatings++;
    }

    public double calculateMean () {
        return ratingsSum / totalRatings;
    }
}
