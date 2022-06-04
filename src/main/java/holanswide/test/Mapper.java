package holanswide.test;

import holanswide.pojo.User;
import holanswide.utils.Bean;
import holanswide.utils.mappers.UserMapper;
import holanswide.utils.mappers.UserMapperImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 14:52
 */

public class Mapper {
    @Test
    public void testMapperImp() {
        Bean.getAc().getBean("userMapperImp", UserMapperImp.class).addUser(Bean.getAc().getBean("user", User.class));
    }
    @Test
    public void testMapper() {
        Bean.getAc().getBean("userMapper", UserMapper.class).addUser(Bean.getAc().getBean("user", User.class));
    }
}
