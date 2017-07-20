package com.abunko.text;

/**
 * Created by Andrew on 17.07.2017.
 */
public class Sentence implements Texts{
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public void show() {
        System.out.print(sentence + " ");
    }
}
