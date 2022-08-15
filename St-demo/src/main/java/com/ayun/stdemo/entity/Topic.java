package com.ayun.stdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("zgjys") //中国教育史
public class Topic {

    @TableId
    private Integer id;

    @TableField("topic")
    private String topic;

    @TableField("A")
    private String A;

    @TableField("B")
    private String B;

    @TableField("C")
    private  String C;

    @TableField("D")
    private String D;

    @TableField("answer")
    private String answer;
}
