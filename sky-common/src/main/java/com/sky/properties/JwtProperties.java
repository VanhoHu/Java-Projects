package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// Spring Boot 配置类，用于绑定应用属性文件中前缀为 sky.jwt 的配置项到 JwtProperties 类的实例中
@Component
@ConfigurationProperties(prefix = "sky.jwt")//用来绑定配置文件中前缀为 sky.jwt 的属性到这个类的实例中
@Data //这是 Lombok 库提供的注解，它会自动生成 getter、setter、toString 等方法，从而减少样板代码
public class JwtProperties {

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String adminSecretKey;// JWT签名所用的密钥
    private long adminTtl;// 访问令牌的有效期（秒）
    private String adminTokenName; //令牌名

    /**
     * 用户端微信用户生成jwt令牌相关配置
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

}
