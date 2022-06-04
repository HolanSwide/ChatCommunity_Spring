package holanswide.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 14:53
 */

public class Bean {
    private static final String url = "spring/spring-config.xml";
    public static ApplicationContext getAc() {
        ApplicationContext ac =null;
        try {
            ac = new ClassPathXmlApplicationContext(url);
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return ac;
    }
}
