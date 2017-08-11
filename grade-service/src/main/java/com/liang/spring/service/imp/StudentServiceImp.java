package com.liang.spring.service.imp;

import com.liang.spring.api.StudentService;
import com.liang.spring.api.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/11 8:55
 */
@Service("studentService")
public class StudentServiceImp implements StudentService{
    @Override
    public StudentDto queryByName(String name) throws Exception {
        return null;
    }

    @Override
    public List<StudentDto> getAllStudenets() throws Exception {
        List<StudentDto> list = new ArrayList<>( );
        StudentDto st = new StudentDto();
        st.setUsername( "liang test duubo" );
        list.add(st);
        return list;
    }

    @Override
    public boolean addStudent(StudentDto studentDto) throws Exception {
        return false;
    }

    @Override
    public boolean eidtStudent(StudentDto studentDto) throws Exception {
        return false;
    }
}
