package com.Nghiem.tgu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nghiem.tgu.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

}
