package com.ayun.stdemo.mapper;



import com.ayun.stdemo.entity.Topic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface TopicMapper extends BaseMapper<Topic> {

     Topic getTopicRandListById(@Param("id") Integer id);

    Topic getTopicById(@Param("id") Integer id);

    List<Topic> getTopicList();
}
