package com.emp.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.emp.entity.*;

@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(readOnly = false)
    public int saveEmp(Emp emp) {
        return (int) hibernateTemplate.save(emp);
    }

    @Override
    public Emp getEmpbyId(int eid) {
        return hibernateTemplate.get(Emp.class, eid);
    }

    @Override
    public List<Emp> getAllEmp() {
        return hibernateTemplate.loadAll(Emp.class);
    }

    @Override
    @Transactional(readOnly = false)
    public void updateEmp(Emp emp) {
        hibernateTemplate.update(emp);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteEmp(int eid) {
        Emp emp = hibernateTemplate.get(Emp.class, eid);
        if (emp != null) {
            hibernateTemplate.delete(emp);
        }
    }
}
