package com.liang.spring.api;

import com.liang.spring.api.dto.GradeDto;

import java.util.List;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/10 16:56
 */
public interface GradeService {
    public List<GradeDto> getAllGrade() throws Exception;
    public boolean addgrade(GradeDto gradeDto) throws Exception;
}
