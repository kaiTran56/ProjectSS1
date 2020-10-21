package com.team.model;

import java.time.LocalDateTime;

public class Boardnew {
	private String boardnew_id;
	private String title;
	private String content;
	private String image_link;
	private String author;
	private LocalDateTime created;

	public Boardnew(String boardnew_id, String title, String content, String image_link, String author,
			LocalDateTime created) {
		super();
		this.boardnew_id = boardnew_id;
		this.title = title;
		this.content = content;
		this.image_link = image_link;
		this.author = author;
		this.created = created;
	}

	public Boardnew(String title, String content, String image_link, String author, LocalDateTime created) {
		super();
		this.title = title;
		this.content = content;
		this.image_link = image_link;
		this.author = author;
		this.created = created;
	}

	public String getBoardnew_id() {
		return boardnew_id;
	}

	public void setBoardnew_id(String boardnew_id) {
		this.boardnew_id = boardnew_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage_link() {
		return image_link;
	}

	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
}
