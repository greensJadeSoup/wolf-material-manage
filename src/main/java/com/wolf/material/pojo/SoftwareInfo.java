/**
 * @Title: SoftwareInfo
 * @Description: 软件组数据库实体类
 * @author 黄彦钊
 * @date 2019/9/23
 **/
package com.wolf.material.pojo;
import lombok.Data;
import java.util.Date;
@Data//自动实现get，set，toString等方法，减少代码
public class SoftwareInfo {
    private Integer sw_id;  //ID
    private String sw_name; //姓名
    private String sw_sex;  //性别
    private Date sw_birthday;//生日
    private String sw_grade;//年级
    private String sw_major;//专业
}


