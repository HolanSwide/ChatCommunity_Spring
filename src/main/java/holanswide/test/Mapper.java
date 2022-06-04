package holanswide.test;

import holanswide.pojo.Post;
import holanswide.pojo.User;
import holanswide.utils.BeanFactory;
import holanswide.utils.FormatFactory;
import holanswide.utils.mappers.PostMapperImp;
import holanswide.utils.mappers.UserMapper;
import holanswide.utils.mappers.UserMapperImp;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 14:52
 */

public class Mapper {

    @Test
    public void testMapperImp() {
//        addUser
        BeanFactory.getAc().getBean("userMapperImp", UserMapperImp.class).addUser(BeanFactory.getAc().getBean("user", User.class));
    }
    @Test
    public void testDel() {
        //        delUser
        BeanFactory.getAc().getBean("userMapperImp",UserMapperImp.class).delUser(BeanFactory.getAc().getBean("user",User.class));
        //        queryUser
        System.out.println(BeanFactory.getAc().getBean("userMapperImp",UserMapperImp.class).queryUser());
    }
    @Test
    public void testMapper() {
        BeanFactory.getAc().getBean("userMapper", UserMapper.class).addUser(BeanFactory.getAc().getBean("user", User.class));
    }

//    -----------------------------------------------------------------------------------------------------
//    Post
//    -----------------------------------------------------------------------------------------------------

    @Test
    public void testAddPost() {
        Post post = BeanFactory.getAc().getBean("post",Post.class);
        post.setTime(FormatFactory.DateToString(new Date()));
        BeanFactory.getAc().getBean("postMapperImp", PostMapperImp.class).addPost(post);
    }
    @Test
    public void testQueryPost() {
        System.out.println(BeanFactory.getAc().getBean("postMapperImp", PostMapperImp.class).queryPost());
    }
    @Test
    public void testQueryPostByTime() throws ParseException {
        System.out.println(BeanFactory.getAc().getBean("postMapperImp", PostMapperImp.class).queryPostByTime("2022-06-04 22:34:55"));
    }
    @Test
    public void testDelPost() {
        Post post = BeanFactory.getAc().getBean("post",Post.class);
        post.setPid(2);
        BeanFactory.getAc().getBean("postMapperImp", PostMapperImp.class).delPost(post);
    }

}
