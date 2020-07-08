package com.xr.microservicecloudproviderdept.service;
import com.xr.microservicecloudproviderdept.entities.Dept;

import java.util.List;

/**
 * Created By xf on 2019/9/27
 */
public interface DeptService {
    /**
     * 添加部门
     * @param dept 部门信息
     * @return true添加成功
     */
    public boolean add(Dept dept);

    /**
     * 根据id查询部门
     * @param id 部门id
     * @return 部门对象
     */
    public Dept    get(Long id);

    /**
     * 查询所有部门
     * @return 部门集合
     */
    public List<Dept> list();

}