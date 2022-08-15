package com.ayun.stdemo;

import com.ayun.stdemo.entity.Topic;
import com.ayun.stdemo.mapper.TopicMapper;
import com.ayun.stdemo.service.TopicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StDemoApplicationTests {

    @Autowired()
    private TopicService topicService;




    @Test
    void contextLoads() {
        List<Topic> list = topicService.getTopicList();
        list.forEach(System.out::println);
    }

    @Test
    void TestSelect1 (){

    }

}
