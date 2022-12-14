package Day13;

import lombok.Data;

@Data
public class Score2 {
	
	private String title;
	private int term, midScore, finalScore, performance;
	private double total;
	private double midRate = 0.4, finalRate = 0.5, performanceRate = 0.1;
	
	@Override
	public String toString() {
		return "[" + title + "과목 " +  ", 학기 : " + term + ", 중간 : " + midScore + ", 기말 : " + finalScore
				+ ", 수행평가 : " + performance + ", 총점 : " + total + "]";
	}

	
	//생성자 : 과목, 학기, 중간, 기말, 수행평가가 필요한 생성자
	public Score2(String title, int term, int midScore, int finalScore, int performance) {
		this.title = title;
		this.term = term;
		this.midScore = midScore;
		this.finalScore = finalScore;
		this.performance = performance;
		this.total = midRate*midScore + finalScore*finalRate + performance*performanceRate;
	}
	
	//	: 과목, 학기가 필요한 생성자(성적이 같은지 확인할 때)
	public Score2(String title, int term) {
		this.title = title;
		this.term = term;
	}
	//복사 생성자
	public Score2(Score2 s) {
		this(s.title, s.term, s.midScore, s.finalScore, s.performance);
	}
}
