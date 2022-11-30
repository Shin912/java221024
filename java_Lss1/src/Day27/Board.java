package Day27;

import lombok.Data;

@Data
public class Board {
	private String category,title, contents, writer;
	
	public Board(String category,String title, String contents, String writer) {
		this.category = category;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	}
}
