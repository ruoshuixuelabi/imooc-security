package com.imooc.dto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author zhailiang
 */
@Data
public class UserQueryCondition {
	private String username;
	@ApiModelProperty(value = "用户年龄起始值")
	private int age;
	@ApiModelProperty(value = "用户年龄终止值")
	private int ageTo;
	private String xxx;
}
