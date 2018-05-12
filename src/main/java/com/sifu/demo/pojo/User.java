package com.sifu.demo.pojo;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * lombok插件注解@Data等目前不支持jdk9
 *
 * @author sifu
 * @date 2017/12/4
 * @version 1.0
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class User {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(updatable = false)
    @CreationTimestamp
    private Date createTime;

    /**
     * 更新时间
     */
    @UpdateTimestamp
    private Date updateTime;

}
