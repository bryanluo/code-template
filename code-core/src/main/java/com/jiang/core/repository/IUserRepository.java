package com.jiang.core.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiang.core.repository.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @author Bryan.luo
 * @CreateBy 2020/11/16 星期一
 * @description
 **/
@Repository
public interface IUserRepository extends BaseMapper<UserEntity> {

}
