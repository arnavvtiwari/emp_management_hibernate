package com.emp.dao;

import java.util.List;
import com.emp.entity.Emp;

public interface EmpDao {
    int saveEmp(Emp emp);
    Emp getEmpbyId(int eid);
    List<Emp> getAllEmp();
    void updateEmp(Emp emp);
    void deleteEmp(int eid);
}
