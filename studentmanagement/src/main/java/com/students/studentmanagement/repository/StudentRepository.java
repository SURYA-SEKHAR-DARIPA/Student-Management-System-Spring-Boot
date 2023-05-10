package com.students.studentmanagement.repository;

import com.students.studentmanagement.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Students,Long>{

    @Query(value = "select * from students s where s.reg_number like %:keyword% or " +
            "s.full_name like %:keyword% or s.course_enrolled like %:keyword%", nativeQuery = true)
    List<Students> findByKeyword(@Param("keyword") String keyword);

}
