package holanswide.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/4 13:35
 */

@Component
public class User implements Behavior {
    @Value(value = "0")
    private int uid;
    @Value(value = "username")
    private String username;
    @Value(value = "password")
    private String password;
    @Value(value = "0")
    private int type;

    @Override
    public void like(Post post) {
        // 用户点赞
    }

    @Override
    public void comment(Post post) {
        // 用户评论
    }

    @Override
    public void share(Post post) {
        // 用户分享
    }

    @Override
    public void report(Post post) {
        // 用户举办
    }

    @Override
    public String toString() {
        return String.valueOf(this.uid) + " "
                + this.getUsername() + " "
                + this.getPassword() + " "
                + String.valueOf(this.getType());
    }

    public User() {
    }

    public User(int uid, String username, String password, int type) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
