package com.Nghiem.tgu.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanxet")
public class phieunhanxet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String ten;
	@Column
	private String hocvi;
	@Column
	private String nganhdaotao;
	@Column
	private String donvicongtac;
	@Column
	private String nx1;
	@Column
	private String nx2;
	@Column
	private String nx3;
	@Column
	private String ykienkhac;
	@Column
	private String ketluanchung;

	public phieunhanxet(long id, String ten, String hocvi, String nganhdaotao, String donvicongtac, String nx1,
			String nx2, String nx3, String ykienkhac, String ketluanchung) {
		super();
		this.id = id;
		this.ten = ten;
		this.hocvi = hocvi;
		this.nganhdaotao = nganhdaotao;
		this.donvicongtac = donvicongtac;
		this.nx1 = nx1;
		this.nx2 = nx2;
		this.nx3 = nx3;
		this.ykienkhac = ykienkhac;
		this.ketluanchung = ketluanchung;
	}

	public phieunhanxet() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getHocvi() {
		return hocvi;
	}

	public void setHocvi(String hocvi) {
		this.hocvi = hocvi;
	}

	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}

	public String getDonvicongtac() {
		return donvicongtac;
	}

	public void setDonvicongtac(String donvicongtac) {
		this.donvicongtac = donvicongtac;
	}

	public String getNx1() {
		return nx1;
	}

	public void setNx1(String nx1) {
		this.nx1 = nx1;
	}

	public String getNx2() {
		return nx2;
	}

	public void setNx2(String nx2) {
		this.nx2 = nx2;
	}

	public String getNx3() {
		return nx3;
	}

	public void setNx3(String nx3) {
		this.nx3 = nx3;
	}

	public String getYkienkhac() {
		return ykienkhac;
	}

	public void setYkienkhac(String ykienkhac) {
		this.ykienkhac = ykienkhac;
	}

	public String getKetluanchung() {
		return ketluanchung;
	}

	public void setKetluanchung(String ketluanchung) {
		this.ketluanchung = ketluanchung;
	}

	@Override
	public String toString() {
		return "phieunhanxet [id=" + id + ", ten=" + ten + ", hocvi=" + hocvi + ", nganhdaotao=" + nganhdaotao
				+ ", donvicongtac=" + donvicongtac + ", nx1=" + nx1 + ", nx2=" + nx2 + ", nx3=" + nx3 + ", ykienkhac="
				+ ykienkhac + ", ketluanchung=" + ketluanchung + "]";
	}

}
