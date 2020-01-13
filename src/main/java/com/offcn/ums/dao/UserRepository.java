package com.offcn.ums.dao;

import com.offcn.ums.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: ums
 * @description:
 * @author: Mr.C
 * @create: 2020-01-12 21:03
 **/
public interface UserRepository  extends JpaRepository<User,Long> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

}
