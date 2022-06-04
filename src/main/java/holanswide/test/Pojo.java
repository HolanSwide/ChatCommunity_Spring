package holanswide.test;

import holanswide.pojo.User;
import holanswide.utils.Bean;
import org.junit.Test;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 15:10
 */

public class Pojo {
    @Test
    public void userTest() {
        System.out.println(Bean.getAc().getBean("user", User.class).toString());
    }
}
