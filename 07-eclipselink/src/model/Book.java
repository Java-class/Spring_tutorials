package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Book" database table.
 * 
 */
@Entity
@Table(name="\"Book\"")
@NamedQuery(name="Book.findAll", query="SELECT b FROM Book b")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String auther;

	private String page;

	private String title;

	public Book() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuther() {
		return this.auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}