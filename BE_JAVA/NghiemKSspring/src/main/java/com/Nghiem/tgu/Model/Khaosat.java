package com.Nghiem.tgu.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "khao_sat")
public class Khaosat extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "khoa_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="khoa_id")
    @JsonIdentityReference(alwaysAsId=true)
    @JsonProperty("khoa_id")
	private Khoa khoa;

	@Column
	private String khao_sat;

	@Column
	private long nam_hoc;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKhao_sat() {
		return khao_sat;
	}

	public void setKhao_sat(String khao_sat) {
		this.khao_sat = khao_sat;
	}

	public long getNam_hoc() {
		return nam_hoc;
	}

	public void setNam_hoc(long nam_hoc) {
		this.nam_hoc = nam_hoc;
	}

	public Khaosat(long id, Khoa khoa, String khao_sat, long nam_hoc) {
		super();
		this.id = id;
		this.khoa = khoa;
		this.khao_sat = khao_sat;
		this.nam_hoc = nam_hoc;
	}

	public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	public Khaosat() {

	}

}
