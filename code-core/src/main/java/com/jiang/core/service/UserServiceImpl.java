package com.jiang.core.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.IPage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.core.dto.input.UserInput;
import com.jiang.core.dto.output.UserOutput;
import com.jiang.core.repository.IUserRepository;
import com.jiang.core.repository.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Bryan.luo
 * @CreateBy 2020/11/16 星期一
 * @description
 **/
@Service
@RequiredArgsConstructor
public class UserServiceImpl {

    private final IUserRepository userRepository;

    public PageInfo<UserEntity> findUserPageInfo(UserInput input){
        LambdaQueryWrapper<UserEntity> wrapper = Wrappers.<UserEntity>lambdaQuery()
                .ge(UserEntity::getName, input.getName());
        PageInfo<UserEntity> userEntityPageInfo = PageHelper.startPage(0, 3)
                .doSelectPageInfo(() -> userRepository.selectList(wrapper));
        return userEntityPageInfo;
    }


}
