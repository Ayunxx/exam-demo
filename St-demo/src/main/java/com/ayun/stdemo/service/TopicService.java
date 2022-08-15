package com.ayun.stdemo.service;

import com.ayun.stdemo.entity.Topic;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface TopicService extends IService<Topic> {
    List<Topic> getTopicList();


    Topic getTopicRand();


    Topic getTopicById();
}
