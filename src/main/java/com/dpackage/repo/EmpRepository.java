package com.dpackage.repo;


import com.dpackage.model.Emp;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpRepository extends CrudRepository<Emp, Long> {
    List<Emp> findByLeave(String leave);
}