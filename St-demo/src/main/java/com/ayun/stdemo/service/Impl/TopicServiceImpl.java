package com.ayun.stdemo.service.Impl;

import com.ayun.stdemo.entity.Topic;
import com.ayun.stdemo.mapper.TopicMapper;
import com.ayun.stdemo.service.TopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper,Topic> implements TopicService {

    @Autowired
    private TopicMapper topicMapper;
    @Override
    public List<Topic> getTopicList() {
        List<Topic> list = topicMapper.getTopicList();
        return list;
    }


    @Override
    public Topic getTopicRand() {
        Random rd = new Random();
        int randId = rd.nextInt(44) + 1;
        System.out.println("随机生成树："+ randId);
        Topic topic = topicMapper.selectById(randId);

        return topic;
    }

    @Override
    public Topic getTopicById() {
        int id = 0;
        id += 1 ;
        Topic topicById = topicMapper.getTopicById(id);

        return topicById;

    }
}
