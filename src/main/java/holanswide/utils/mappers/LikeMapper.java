package holanswide.utils.mappers;

import holanswide.pojo.activuty.Like;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LikeMapper {
    public long queryLikeNumsByPid(@Param("pid") int pid);
    public long queryLikeNumsByUid(@Param("toUid") int toUid);

    public void addLike(Like like);

}
