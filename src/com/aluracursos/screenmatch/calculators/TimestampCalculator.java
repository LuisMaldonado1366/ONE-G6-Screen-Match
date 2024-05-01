package com.aluracursos.screenmatch.calculators;
import com.aluracursos.screenmatch.models.Title;

public class TimestampCalculator {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void mediaList(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
