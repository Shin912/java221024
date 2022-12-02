package Day30;

import lombok.Data;

/* 필드 : 댓글 번호, 내용, 작성자
	 * getter,setter
	 * toString
	 * 생성자 : 댓글 번호, 내용, 작성자
	 * */
@Data
public class Coment {
	private int comentNum;
	private String contents, writer;
	private int boardNum;
	
	public Coment(int comentNum, String contents, String writer, int boardNum) {
		this.comentNum = comentNum;
		this.contents = contents;
		this.writer = writer;
		this.boardNum = boardNum;
	}
	
	@Override
	public String toString() {
		return comentNum + "." + writer + " : " + contents ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coment other = (Coment) obj;
		if (comentNum != other.comentNum)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + comentNum;
		return result;
	}

	
}
