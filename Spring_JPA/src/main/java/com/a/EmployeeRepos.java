package com.a;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a.EmpRec;

@Repository
public interface EmployeeRepos extends JpaRepository<EmpRec, Integer> {

}
