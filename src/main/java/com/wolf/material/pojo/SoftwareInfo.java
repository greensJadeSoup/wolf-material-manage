/**
 * @Title: SoftwareInfo
 * @Description: 软件组数据库实例
 * @author 黄彦钊
 * @date 2019/9/23
 **/
package com.wolf.material.pojo;
import lombok.Data;
import java.util.Date;
@Data//自动实现get，set，toString等方法，减少代码
public class SoftwareInfo {
    private Integer sw_id;
    private String sw_name;
    private String sw_sex;
    private Date sw_birthday;
    private String sw_grade;
    private String sw_major;
}


