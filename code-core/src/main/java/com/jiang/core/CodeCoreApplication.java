package com.jiang.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bryan.luo
 * @CreateBy 2020/11/16 星期一
 * @description
 **/
@MapperScan("com.jiang.core")
@SpringBootApplication
public class CodeCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeCoreApplication.class, args);
	}

}
