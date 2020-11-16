package com.jiang.core.config;

import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Bryan.luo
 * @CreateBy 2020/11/16 星期一
 * @description
 **/
@Configuration
public class MyBatisPageConfig {

    @Bean
    public PageInterceptor pageInterceptor(){
        return new PageInterceptor();
    }

}
