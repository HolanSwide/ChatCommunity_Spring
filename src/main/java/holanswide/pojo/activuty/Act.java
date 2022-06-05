package holanswide.pojo.activuty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：holan
 * @description：TODO
 * @date ：2022/6/5 22:18
 */

@Component
public class Act {
    @Value(value = "0")
    private int uid;        // 行为主动方 uid
    @Value(value = "0")
    private int pid;        // 行为发生帖 pid
    @Value(value = "0")
    private int toUid;      // 行为受到方 uid
    @Value(value = "0000-00-00 00:00:00")
    private String time;    // 发生时间 time
    @Value(value = "Null")
    private String index;   // 行为内容

    public Act() {
    }

    public Act(int uid, int pid, int toUid, String time, String index) {
        this.uid = uid;
        this.pid = pid;
        this.toUid = toUid;
        this.time = time;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Act{" +
                "uid=" + uid +
                ", pid=" + pid +
                ", toUid=" + toUid +
                ", time='" + time + '\'' +
                ", index='" + index + '\'' +
                " "+this.getClass() + " " +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getToUid() {
        return toUid;
    }

    public void setToUid(int toUid) {
        this.toUid = toUid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
