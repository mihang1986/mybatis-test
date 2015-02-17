package com.sao.mybatis.dao;

import com.sao.mybatis.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by navia on 2015/2/14.
 */
@Repository
public interface StudentDao {
    public void insertStudent(Student student);

    public void insertStudent2(Student student);
}
