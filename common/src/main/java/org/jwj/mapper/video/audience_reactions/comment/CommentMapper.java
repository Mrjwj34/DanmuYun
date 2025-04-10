package org.jwj.mapper.video.audience_reactions.comment;
import com.github.yulichang.base.MPJBaseMapper;
import org.jwj.entity.user_center.user_relationships.IdCount;
import org.jwj.entity.video.audience_reactions.comment.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface CommentMapper extends MPJBaseMapper<Comment> {
    @Select({
            "<script>",
            "SELECT comment_id AS id, COUNT(*) AS count",
            "FROM likes",
            "WHERE comment_id IN",
            "<foreach item='id' collection='ids' open='(' separator=',' close=')'>",
            "#{id}",
            "</foreach>",
            "GROUP BY comment_id",
            "</script>"
    })
    List<IdCount> getCommentCount(Set<Integer> ids);
}
