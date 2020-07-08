package com.xr.microservicecloudproviderdept.service.impl;

import com.xr.microservicecloudproviderdept.dao.DeptDao;
import com.xr.microservicecloudproviderdept.entities.Dept;
import com.xr.microservicecloudproviderdept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import java.util.List;
/** * Created By xf on 2019/9/27 * 部门业务实现类 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao ;
@Override
public boolean add(Dept dept) {
    return dao.addDept(dept);}
    @Override
    public Dept get(Long id) {
    return dao.findById(id); }
    @Override
    public List<Dept> list() {
    return dao.findAll();}}