package co.jinho.proj.survey.vo;

import java.util.Collections;
import java.util.List;

public class QuestionVO {
	private String title;
	private List<String> options;
	
	public QuestionVO(String title, List<String> options) {
		this.title = title;
		this.options = options;
	}
	public QuestionVO(String title) {
		this(title, Collections.<String>emptyList());
	}
	public String getTitle() {
		return title;
	}
	public List<String> getOptions() {
		return options;
	}
	
	public boolean isChoice() {
		return options != null && !options.isEmpty();
	}
}
