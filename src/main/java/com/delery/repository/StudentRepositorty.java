package com.delery.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.delery.entity.Student;

public interface StudentRepositorty extends JpaRepository<Student, Long> {

}
