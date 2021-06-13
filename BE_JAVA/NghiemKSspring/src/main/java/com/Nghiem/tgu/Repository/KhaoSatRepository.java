package com.Nghiem.tgu.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nghiem.tgu.Model.Khaosat;
import com.Nghiem.tgu.Model.Tutorial;

public interface KhaoSatRepository extends JpaRepository<Khaosat, Long> {
//	List<Khaosat> findByKhoa_idContaining(Long khoa_id);
}
