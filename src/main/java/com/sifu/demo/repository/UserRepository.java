package com.sifu.demo.repository;

import com.sifu.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sifu
 * @version 1.0
 * @date 2017/12/4
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
