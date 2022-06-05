package holanswide.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author ：holan
 * @description：DONE
 * @date ：2022/6/4 20:50
 */

@Component
public class Post {
    @Value(value = "0")
    private int pid;
    @Value(value = "0")
    private int uid;
    @Value(value = "test theme")
    private String theme;
    @Value(value = "body"+"\n"+"tail")
    private String body;
    @Value(value = "0000-00-00 00:00:00")
    private String time; // 注意使用 SimpleDateFormat("yyyy-MM-dd HH:mm:ss") 进行格式转换
    @Value(value = "0")
    private int like;
    @Value(value = "0")
    private int comment;
    @Value(value = "0")
    private int share;

    @Override
    public String toString() {
        return String.valueOf(this.pid) + " "
                + String.valueOf(this.uid) + " "
                + String.valueOf(this.theme) + " "
                + String.valueOf(this.body) + " "
                + this.time + " "
                + String.valueOf(this.like) + " "
                + String.valueOf(this.comment) + " "
                + String.valueOf(this.share) ;
    }

    public Post() {
    }

    public Post(int pid, int uid, String theme, String body, String time, int like, int comment, int share) {
        this.pid = pid;
        this.uid = uid;
        this.theme = theme;
        this.body = body;
        this.time = time;
        this.like = like;
        this.comment = comment;
        this.share = share;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }
}
