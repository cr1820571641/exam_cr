package com.exam.cr.service.impl;

import com.exam.cr.dao.AnswersDao;
import com.exam.cr.entity.po.Answers;
import com.exam.cr.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:chen
 * @Date:2020/5/25 18:19
 * @version:1.0
 */
@Service
public class AnswersServieImp implements AnswersService {

    @Autowired
    private AnswersDao answersDao;

    @Override
    public List<Answers> selectAll() {
        return answersDao.selectList(null);
    }

    @Override
    public Answers selectByname(String ans) {
        return answersDao.selectByname(ans);
    }
}
