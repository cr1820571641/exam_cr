package com.exam.cr.service;

import com.exam.cr.entity.po.Answers;

import java.util.List;

/**
 * @Author:chen
 * @Date:2020/5/25 18:18
 * @version:1.0
 */
public interface AnswersService {


    List<Answers> selectAll();

    Answers selectByname(String ans);
}
