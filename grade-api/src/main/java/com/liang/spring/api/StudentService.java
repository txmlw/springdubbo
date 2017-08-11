package com.liang.spring.api;

import com.liang.spring.api.dto.StudentDto;

import java.util.List;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/10 16:56
 */
public interface StudentService {
    public StudentDto queryByName(String name) throws Exception;
    public List<StudentDto> getAllStudenets() throws Exception;
    public boolean addStudent(StudentDto studentDto) throws Exception;
    public boolean eidtStudent(StudentDto studentDto) throws Exception;
}
