package com.cotx.dao;

import com.cotx.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    int insertStudent(Student student);

    int deleteStudentByPrimaryKey(String key);

    int updateStudentByPrimaryKey(String key);

    @Select("select * from student")
    List<Student> selectAll();
}
