package com.game;

import java.util.*;

public class ComparisonLogic {

    private List<String> compareList;
    private List<ComparisonTuple> tuples;
    private Map<String, Integer> scorecard;

    public ComparisonLogic(){
        this.compareList = initializeList();
        this.scorecard = initializeScorecard();
        this.tuples = allTuples();
    }

    private List<ComparisonTuple> allTuples(){

        List <String> list = getCompareList();
        List <ComparisonTuple> tuples = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                tuples.add(new ComparisonTuple(list.get(i), list.get(j)));
            }
        }
        Collections.shuffle(tuples);
        return tuples;
    }

    private List<ComparisonTuple> getTuples(){
        return this.tuples;
    }

    private List<String> initializeList() {
        List <String> compareList = new ArrayList<>();
        compareList.add("Beyonce");
        compareList.add("Sonu Nigam");
        compareList.add("Adele");
        compareList.add("Lady Gaga");
        compareList.add("Shaan");
        compareList.add("Rihanna");
        compareList.add("Sia");
        compareList.add("Bruno Mars");
        compareList.add("Micheal Jackson");
        compareList.add("Zayn Malik");
        compareList.add("Cardi B");
        compareList.add("Whitney Houston");
        compareList.add("Sunidhi Chauhan");
        compareList.add("Shreya Ghoshal");
        return compareList;
    }

    private Map <String, Integer> initializeScorecard(){
        Map<String, Integer> scorecard = new HashMap<>();
        List <String> list = getCompareList();
        for(int i=0; i<list.size(); i++){
            scorecard.put(list.get(i), 0);
        }
        return scorecard;
    }

    private List <String> getCompareList () {
        return compareList;
    }


    public Map<String, Integer> getScorecard(){
       return this.scorecard;
    }

    public ComparisonTuple getNextTuple(){

        List <ComparisonTuple> list = getTuples();

        if(list.size()>0){
            ComparisonTuple tuple = list.get(0);
            getTuples().remove(0);
            return tuple;
        }

        return new ComparisonTuple("empty", "empty");
    }

    public void setValueInScorecard(String int_winner) {
        int score = getScorecard().get(int_winner);
        this.getScorecard().put(int_winner, ++score);
    }

    public int comparisonsLeft(){
        return getTuples().size();
    }
}
