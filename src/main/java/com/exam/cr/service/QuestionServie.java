package com.exam.cr.service;

import com.exam.cr.entity.dto.QuestionsDto;

import java.util.List;

/**
 * @Author:chen
 * @Date:2020/5/25 17:52
 * @version:1.0
 */
public interface QuestionServie {

    List<QuestionsDto> selectQuestions();
}
