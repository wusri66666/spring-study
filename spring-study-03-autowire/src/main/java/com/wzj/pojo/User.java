package com.wzj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Component("user")
public class User {
    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;

    @Autowired
    @Qualifier(value = "dog2")
    private Dog dog;

    @Value("wzj")
    private String str;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
