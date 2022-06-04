package holanswide.utils.mappers;

import holanswide.pojo.Post;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PostMapper {
    public List<Post> queryPost();
    public List<Post> queryPostByPid(@Param("pid") int pid);
    public List<Post> queryPostByTheme(@Param("theme") String theme);
    public List<Post> queryPostByBody(@Param("body") String body);
    public List<Post> queryPostByTime(@Param("time") String time);

    public void addPost(Post post);

    public void delPost(Post post);

    public void updPost(Post post);
}
