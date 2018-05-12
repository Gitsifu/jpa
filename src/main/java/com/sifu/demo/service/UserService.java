package com.sifu.demo.service;

import com.sifu.demo.pojo.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sifu
 * @version 1.0
 * @date 2017/12/4
 */
public interface UserService {
    /**
     *
     * @param user
     * @return
     */
    User save(User user);

    @Modifying
    @Transactional
    User update(User user);
}
