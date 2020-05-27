package com.exam.cr.controller;

import com.exam.cr.entity.ResultData;
import com.exam.cr.entity.po.Score;
import com.exam.cr.entity.dto.QuestionsDto;
import com.exam.cr.entity.po.Answers;
import com.exam.cr.service.AnswersService;
import com.exam.cr.service.QuestionServie;
import com.exam.cr.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:chen
 * @Date:2020/5/25 17:49
 * @version:1.0
 */
@Controller
@RequestMapping("/ques")
public class QuestionController {

    @Autowired
    private QuestionServie questionServie;

    @Autowired
    private AnswersService answersService;

    @Autowired
    private ScoreService scoreService;

    @RequestMapping("/questions")
    @ResponseBody
    public Map<String , List<QuestionsDto>> selectList(){
        Map<String,List<QuestionsDto>> map=new HashMap();

        map.put("questions",questionServie.selectQuestions());

        return map;
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/inserAns")
    @ResponseBody
    public ResultData<Object> inserAns(String ans){
        Answers answers = answersService.selectByname(ans);
        ResultData<Object> res= new ResultData<>();
        Score score = new Score();
        score.setQid(answers.getQid()).setAid(answers.getAid());
        Score insert = scoreService.insert(score);
        if(insert!=null){
            res.setCode(200);
            return res;
        }
        return res;
    }

}
