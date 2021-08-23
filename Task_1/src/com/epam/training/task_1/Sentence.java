package com.epam.training.task_1;

import java.util.ArrayList;

public class Sentence {
	ArrayList<Word> p = new ArrayList<Word>();
	String stop = ".";

	public Sentence(Word word) {
		super();
		String ss = word.getWord();
		String s = ss.substring(0, 1);
		word.setWord(s.toUpperCase() + ss.substring(1));
		p.add(word);
	}

	public Sentence(Word word, String stop) {
		super();
		String ss = word.getWord();
		String s = ss.substring(0, 1);
		word.setWord(s.toUpperCase() + ss.substring(1));
		p.add(word);
		this.stop = stop;
	}

	public Sentence() {
		super();
	}

	public String getSentence() {
		String s = "";
		for (Word w : p) {
			s += w + " ";
		}
		return s.substring(0, s.length() - 1) + stop;
	}

	public void addWord(Word word) {
		if (p.isEmpty()) {
			String ss = word.getWord();
			String s = ss.substring(0, 1);
			word.setWord(s.toUpperCase() + ss.substring(1));
			p.add(word);
		} else {
			p.add(word);
		}
	}

	@Override
	public String toString() {
		return getSentence();
	}

}
