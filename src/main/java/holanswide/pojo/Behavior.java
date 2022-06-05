package holanswide.pojo;

/** 行为接口
 * 1. 点赞
 * 2. 评论
 * 3. 分享
 * 4. 举报
 */

public interface Behavior {
    public void like(Post post);
    public void comment(Post post);
    public void share(Post post);
    public void report(Post post);
}
