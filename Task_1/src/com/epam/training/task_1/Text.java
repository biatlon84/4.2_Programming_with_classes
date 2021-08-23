package com.epam.training.task_1;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private List<Sentence> text;
	private Sentence title;
	private int wi = 32;

	public Text(Sentence s) {

		this.text = new ArrayList<Sentence>();
		this.text.add(s);

	}

	public Text(Sentence s, Sentence title) {

		this.text = new ArrayList<>();
		this.text.add(s);
		this.title = title;
	}

	public String getText() {
		int size = 0;
		String a = "   ";
		for (Sentence st : text) {
			a += st.toString() + " ";
			size += st.toString().length();
			if (size > wi) {
				a += "\n";
				size = 0;
			}
		}
		return a;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public String getTitle() {
		return "	" + title.toString();
	}

	public void setTitle(Sentence title) {
		this.title = title;
	}

	public void addSentence(Sentence title) {
		this.text.add(title);
	}

	@Override
	public String toString() {
		return "	" + title + "\n" + getText() + "\n";
	}

	public void printTitle() {
		System.out.println(getTitle());
	}

	public void printText() {
		System.out.println(getText());
	}
}
