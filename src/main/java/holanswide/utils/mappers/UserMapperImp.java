package holanswide.utils.mappers;

import holanswide.pojo.User;
import holanswide.utils.mappers.UserMapper;
import org.aspectj.lang.annotation.AdviceName;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 14:24
 */


public class UserMapperImp implements UserMapper {

    private SqlSessionTemplate session;
    //必须要有Set方法
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.session = sqlSessionTemplate;
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> queryUser() {
        return session.getMapper(UserMapper.class).queryUser();
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> queryUserByUid(int uid) {
        return session.getMapper(UserMapper.class).queryUserByUid(uid);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> queryUserByUsername(String username) {
        return session.getMapper(UserMapper.class).queryUserByUsername(username);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> queryUserByType(int type) {
        return session.getMapper(UserMapper.class).queryUserByType(type);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser(User user) {
        session.getMapper(UserMapper.class).addUser(user);
        System.out.println("> Add User : "+session.getMapper(UserMapper.class).queryUserByUsername(user.getUsername()).toString());;
    }

    @Override
    public void delUser(User user) {
        session.getMapper(UserMapper.class).delUser(user);
    }

    @Override
    public void updUser(User user) {
        session.getMapper(UserMapper.class).updUser(user);
        System.out.println("> Upd User : "+session.getMapper(UserMapper.class).queryUserByUsername(user.getUsername()).toString());
    }
}
