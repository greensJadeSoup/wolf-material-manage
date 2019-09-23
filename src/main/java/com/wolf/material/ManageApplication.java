/**
 * @Title: ManageApplication
 * @Description: 物资管理项目启动类
 * @author 黄彦钊
 * @date 2019/9/23
 */
package com.wolf.material;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.wolf.material.service")
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

}
