package com.jiang.core.dto.input;

import com.jiang.component.input.BaseInput;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Bryan.luo
 * @CreateBy 2020/11/16 星期一
 * @description
 **/
@Data
public class UserInput extends BaseInput {
    private static final long serialVersionUID = 6875799516749874185L;

    @NotNull(message = "用户名不能为空")
    private String name;

}
