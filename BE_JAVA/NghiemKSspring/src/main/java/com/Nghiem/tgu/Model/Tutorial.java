package com.Nghiem.tgu.Model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial extends AuditModel{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "khoa_name")
	private String khoa_name;


	@Column(name = "files")
	private String files;

	public Tutorial() {

	}

	public Tutorial(long id, String title, String khoa_name, String files) {
		super();
		this.id = id;
		this.title = title;
		this.khoa_name = khoa_name;
		this.files = files;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", khoa_name=" + khoa_name + ", files=" + files + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKhoa_name() {
		return khoa_name;
	}

	public void setKhoa_name(String khoa_name) {
		this.khoa_name = khoa_name;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}

	

}
