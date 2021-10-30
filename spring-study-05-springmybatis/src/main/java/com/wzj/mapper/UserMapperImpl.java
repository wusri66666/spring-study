//package com.wzj.mapper;
//
//import com.wzj.pojo.User;
//import org.mybatis.spring.SqlSessionTemplate;
//
//import java.util.List;
//
//public class UserMapperImpl implements UserMapper{
//    private SqlSessionTemplate sqlSession;
//
//    public void setSqlSession(SqlSessionTemplate sqlSession) {
//        this.sqlSession = sqlSession;
//    }
//
//    @Override
//    public List<User> getUsers() {
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.getUsers();
//    }
//}


package com.wzj.mapper;

import com.wzj.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    public List<User> getUsers() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getUsers();
    }
}
