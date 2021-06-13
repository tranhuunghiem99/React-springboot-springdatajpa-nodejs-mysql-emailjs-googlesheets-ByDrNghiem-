package com.Nghiem.tgu.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lienhe")
public class lienhe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String email;
	@Column
	private String sdt;
	@Column
	private String ten;
	@Column
	private String Noidung;

	public lienhe(long id, String email, String sdt, String ten, String noidung) {
		super();
		this.id = id;
		this.email = email;
		this.sdt = sdt;
		this.ten = ten;
		Noidung = noidung;
	}

	public lienhe() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNoidung() {
		return Noidung;
	}

	public void setNoidung(String noidung) {
		Noidung = noidung;
	}

	@Override
	public String toString() {
		return "lienhe [id=" + id + ", email=" + email + ", sdt=" + sdt + ", ten=" + ten + ", Noidung=" + Noidung + "]";
	}

}
