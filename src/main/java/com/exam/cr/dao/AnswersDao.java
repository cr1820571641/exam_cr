package com.exam.cr.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exam.cr.entity.po.Answers;

/**
 * @Author:chen
 * @Date:2020/5/25 18:20
 * @version:1.0
 */
public interface AnswersDao extends BaseMapper<Answers> {


    Answers selectByname(String ans);

}
