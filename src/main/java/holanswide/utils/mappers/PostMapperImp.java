package holanswide.utils.mappers;

import holanswide.pojo.Post;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author ：holan
 * @description：DONE
 * @date ：2022/6/4 22:14
 */

public class PostMapperImp implements PostMapper {
    private SqlSessionTemplate session;
    //必须要有Set方法
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.session = sqlSessionTemplate;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Post> queryPost() {
        return session.getMapper(PostMapper.class).queryPost();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Post> queryPostByPid(int pid) {
        return session.getMapper(PostMapper.class).queryPostByPid(pid);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Post> queryPostByTheme(String theme) {
        return session.getMapper(PostMapper.class).queryPostByTheme(theme);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Post> queryPostByBody(String body) {
        return session.getMapper(PostMapper.class).queryPostByBody(body);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Post> queryPostByTime(String time) {
        return session.getMapper(PostMapper.class).queryPostByTime(time);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addPost(Post post) {
        session.getMapper(PostMapper.class).addPost(post);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delPost(Post post) {
        session.getMapper(PostMapper.class).delPost(post);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updPost(Post post) {
        session.getMapper(PostMapper.class).updPost(post);
    }
}
