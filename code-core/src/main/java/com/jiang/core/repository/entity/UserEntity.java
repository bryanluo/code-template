package com.jiang.core.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jiang.component.entity.BaseEntity;
import lombok.Data;

/**
 * @author Bryan.luo
 * @CreateBy 2020/11/16 星期一
 * @description
 **/
@Data
@TableName("user")
public class UserEntity extends BaseEntity {

    private static final long serialVersionUID = 2725098820629181058L;

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private Integer age;

}
