package holanswide.utils.mappers;

import holanswide.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> queryUser();
    public List<User> queryUserByUid(@Param("uid") int uid);
    public List<User> queryUserByUsername(@Param("username") String username);
    public List<User> queryUserByType(@Param("type") int type);

    public void addUser(User user);

    public void delUser(User user);

    public void updUser(User user);
}
