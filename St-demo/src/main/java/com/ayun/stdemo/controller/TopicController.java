package com.ayun.stdemo.controller;


import com.ayun.stdemo.entity.Topic;
import com.ayun.stdemo.service.TopicService;
import com.ayun.stdemo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/politics")
@CrossOrigin
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/index")
    public void getIndex(){
        System.out.println("index");

    }

    @GetMapping("/getTopic")
    public Result getTopic(){
        List<Topic> topicList = topicService.getTopicList();
        return Result.ok(topicList);
    }


    @GetMapping("/getRandTopic")
    public Result getRandTopic(){
        Topic topic= topicService.getTopicRand();
        return Result.ok(topic);

    }
}
