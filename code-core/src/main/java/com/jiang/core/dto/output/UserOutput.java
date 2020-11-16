package com.jiang.core.dto.output;

import com.jiang.component.output.BaseOutput;
import lombok.Data;

/**
 * @author Bryan.luo
 * @CreateBy 2020/11/16 星期一
 * @description
 **/
@Data
public class UserOutput extends BaseOutput {
    private static final long serialVersionUID = -2255338343156986549L;

    private Long id;

    private String name;

    private Integer age;

}
