package com.liang.spring.web.controller;

import com.alibaba.fastjson.JSON;
import com.liang.spring.api.StudentService;
import com.liang.spring.api.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/10 15:47
 */
@Controller
@RequestMapping(value = "/st")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "success!";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public void addStudent(@RequestBody StudentDto studentDto) throws Exception{
        studentService.addStudent(studentDto);
    }
    @RequestMapping(value = "/paged", method = RequestMethod.GET)
    @ResponseBody
    public StudentDto paged() throws Exception{
        List<StudentDto> list = studentService.getAllStudenets();
        System.out.println( JSON.toJSONString(list));
        return list.get( 0 );
    }

}
