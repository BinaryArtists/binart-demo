package com.binart.binartsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

//@Excel("字典信息表")
@Data
@Entity
@Table(name="t_sys_dict")
public class SysDict implements Serializable {
    private static final long serialVersionUID = 7780820231535870010L;

//    @TableId(value = "DICT_ID", type = IdType.AUTO)
    private Long dictId;

//    @NotBlank(message = "{required}")
//    @Size(max = 10, message = "{noMoreThan}")
//    @ExcelField(value = "键")
    private String keyy;

//    @NotBlank(message = "{required}")
//    @Size(max = 20, message = "{noMoreThan}")
//    @ExcelField(value = "值")
    private String valuee;

//    @NotBlank(message = "{required}")
//    @Size(max = 20, message = "{noMoreThan}")
//    @ExcelField(value = "表名")
    private String tableName;

//    @NotBlank(message = "{required}")
//    @Size(max = 20, message = "{noMoreThan}")
//    @ExcelField(value = "字段名")
    private String fieldName;
}
