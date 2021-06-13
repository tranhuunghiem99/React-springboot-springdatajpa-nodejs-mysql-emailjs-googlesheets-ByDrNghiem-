package com.Nghiem.tgu.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "khoasv")
public class Khoa  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long khoa_id;
	
	@Column
	private String tenkhoa;

	
    
	public Khoa(long khoa_id, String tenkhoa) {
		super();
		this.khoa_id = khoa_id;
		this.tenkhoa = tenkhoa;
	}

	public Khoa() {
		super();
	}



	public long getKhoa_id() {
		return khoa_id;
	}

	public void setKhoa_id(long khoa_id) {
		this.khoa_id = khoa_id;
	}

	public String getTenkhoa() {
		return tenkhoa;
	}

	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}

	
	
}
