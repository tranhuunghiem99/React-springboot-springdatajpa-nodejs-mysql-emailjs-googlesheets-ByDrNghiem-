package com.Nghiem.tgu.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nghiem.tgu.Model.Tutorial;



public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

	List<Tutorial> findByTitleContaining(String title);
}
