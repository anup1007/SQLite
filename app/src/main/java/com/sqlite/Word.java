package com.sqlite;



public class Word {
    public Word(int wordID, String word, String meaning) {
        this.wordID = wordID;
        this.word = word;
        this.meaning = meaning;
    }

    private int wordID;

    public int getWordID() {
        return wordID;
    }

    public void setWordID(int wordID) {
        this.wordID = wordID;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    private String word;
    private String meaning;


}
