package com.xr.microservicecloudproviderdept.dao;
import com.xr.microservicecloudproviderdept.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created By xf on 2019/9/27
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
