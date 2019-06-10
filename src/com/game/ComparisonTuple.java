package com.game;

public class ComparisonTuple {

    private String candidate1;
    private String candidate2;

    public ComparisonTuple(String candidate1, String candidate2) {
        this.candidate1 = candidate1;
        this.candidate2 = candidate2;
    }


    public String getCandidate1() {
        return candidate1;
    }

    public void setCandidate1(String candidate1) {
        this.candidate1 = candidate1;
    }

    public String getCandidate2() {
        return candidate2;
    }

    public void setCandidate2(String candidate2) {
        this.candidate2 = candidate2;
    }
}
