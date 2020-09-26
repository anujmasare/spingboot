package com.home.h2Curd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Repository
@Repository
public interface UserRepository  extends JpaRepository<UserBean, Long>{

	UserBean findByfirstName(String username);
}
