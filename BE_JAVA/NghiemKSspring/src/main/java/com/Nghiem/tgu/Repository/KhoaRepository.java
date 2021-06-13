package com.Nghiem.tgu.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nghiem.tgu.Model.Khoa;

@Repository
public interface KhoaRepository extends JpaRepository<Khoa, Long> {

	

}
