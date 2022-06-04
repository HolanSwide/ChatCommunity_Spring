package holanswide.utils.mappers;

import holanswide.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryUser();
    public List<User> queryUserByUid(int uid);
    public List<User> queryUserByUsername(String username);
    public List<User> queryUserByType(int type);

    public void addUser(User user);

    public void delUser(User user);

    public void updUser(User user);
}
