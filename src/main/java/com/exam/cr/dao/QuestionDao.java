package com.exam.cr.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exam.cr.entity.dto.QuestionsDto;

import java.util.List;

/**
 * @Author:chen
 * @Date:2020/5/25 17:53
 * @version:1.0
 */
public interface QuestionDao extends BaseMapper<QuestionsDto> {




    List<QuestionsDto> selectQuestions();



}
