package com.exam.cr.service.impl;

import com.exam.cr.dao.QuestionDao;
import com.exam.cr.entity.dto.QuestionsDto;
import com.exam.cr.service.QuestionServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:chen
 * @Date:2020/5/25 17:52
 * @version:1.0
 */
@Service
public class QuestionServiceImpl implements QuestionServie {


    @Autowired
    private QuestionDao questionDao;

    @Override
    public List<QuestionsDto> selectQuestions() {
        return questionDao.selectQuestions();
    }
}
