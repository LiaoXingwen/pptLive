package com.lxw.dao;

import com.lxw.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;


/**
 * Created by lxw on 2017/7/25.
 */
@Repository
@Table(name="t_user")
public interface UserDao extends JpaRepository<User, Integer> {
    /**
     * 根据性别查询
     * @param sex
     * @return
     */
    List<User> findBySex(Integer sex);

    /**
     * 根据手机号查询
     * @param phone
     * @return
     */
    User findByPhone(String phone );

    /**
     * 根据用户名查询
     * @param name
     * @return
     */
    User findByName(String name);
}
