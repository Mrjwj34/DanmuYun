package org.jwj.mapper.video.audience_reactions.danmaku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.jwj.entity.video.audience_reactions.danmaku.Danmaku;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DanmakuMapper extends BaseMapper<Danmaku> {
    @Select("select * from danmaku")
public List<Danmaku> getAll();
}
