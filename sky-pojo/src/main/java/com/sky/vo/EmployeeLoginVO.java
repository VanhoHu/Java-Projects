package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * 定义了一个用于员工登录返回数据的视图对象（VO）类
*/
@Data
@Builder // Lombok 注解，提供一个构造器模式，方便对象的创建
@NoArgsConstructor // Lombok 注解，生成一个无参构造函数。
@AllArgsConstructor //生成一个全参构造函数
@ApiModel(description = "员工登录返回的数据格式") //Swagger 注解，用于描述模型类，生成 API 文档时会显示这个描述。
public class EmployeeLoginVO implements Serializable { //使对象可以被序列化和反序列化，通常用于网络传输或持久化存储

    @ApiModelProperty("主键值") //Swagger 注解，用于描述字段的含义，生成 API 文档时会显示这个描述
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("jwt令牌")
    private String token;

}
