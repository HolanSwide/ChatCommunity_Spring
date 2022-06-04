package holanswide.test;

import holanswide.pojo.Post;
import holanswide.pojo.User;
import holanswide.utils.BeanFactory;
import org.junit.Test;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 15:10
 */

public class Pojo {
    @Test
    public void userTest() {
        System.out.println(BeanFactory.getAc().getBean("user", User.class).toString());
    }
    @Test
    public void postTest() { System.out.println(BeanFactory.getAc().getBean("post", Post.class).toString()); }
}
