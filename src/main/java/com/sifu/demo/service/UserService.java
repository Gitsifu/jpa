package com.sifu.demo.service;

import com.sifu.demo.pojo.User;

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

    User update(User user);
}
