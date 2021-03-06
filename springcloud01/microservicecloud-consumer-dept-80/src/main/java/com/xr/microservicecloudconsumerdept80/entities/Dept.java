package com.xr.microservicecloudconsumerdept80.entities;


import lombok.Data;

import java.io.Serializable;

/**
 * Created By xf on 2019/9/27
 */
@Data
public class Dept implements Serializable {//必须序列化
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

}
