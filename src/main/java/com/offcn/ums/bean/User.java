package com.offcn.ums.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @program: ums
 * @description:
 * @author: Mr.C
 * @create: 2020-01-12 21:02
 **/
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true, length = 200)
    private String name;

    @Column(name = "age", nullable = true, length = 4)
    private Integer age;

}
