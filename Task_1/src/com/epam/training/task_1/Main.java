package com.epam.training.task_1;

//Give an object of class Text using the classes Sentence, Word. 
//Methods: add text, display text to console, text title.
public class Main {

	public static void main(String args[]) {
		Sentence s = new Sentence(new Word("hello"));
		Sentence tit = new Sentence(new Word("hello"), "!");
		Text t = new Text(s, tit);

		Word w1 = new Word("this");
		Word w2 = new Word("is");
		Word w3 = new Word("new");
		Word w4 = new Word("world");

		Sentence sen = new Sentence();
		sen.addWord(w1);
		sen.addWord(w2);
		sen.addWord(w3);
		sen.addWord(w4);

		t.addSentence(sen);
		t.addSentence(sen);
		t.addSentence(sen);
		t.addSentence(sen);
		t.addSentence(sen);
		t.addSentence(sen);

		System.out.print(t);

		t.printTitle();
		t.printText();

	}
}
