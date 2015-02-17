package com.sao.mybatis.dao;

import com.sao.mybatis.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by navia on 2015/2/14.
 */
@Repository
public class StudentDao2 {
    @Autowired
    private SqlSession sqlSession;


    public void insetStudent(Student s){

    }
}
