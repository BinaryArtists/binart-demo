package com.binart.binartsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="t_sys_log")
public class SysLog {

    private static final long serialVersionUID = -8878596941954995444L;

//    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

//    @ExcelField(value = "操作人")
    private String username;

//    @ExcelField(value = "操作描述")
    private String operation;

//    @ExcelField(value = "耗时（毫秒）")
    private Long time;

//    @ExcelField(value = "执行方法")
    private String method;

//    @ExcelField(value = "方法参数")
    private String params;

//    @ExcelField(value = "IP地址")
    private String ip;

//    @ExcelField(value = "操作时间", writeConverter = TimeConverter.class)
    private Date createTime;

    private transient String createTimeFrom;
    private transient String createTimeTo;

//    @ExcelField(value = "操作地点")
    private String location;
}
