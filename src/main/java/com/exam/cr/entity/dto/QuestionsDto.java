package com.exam.cr.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author:chen
 * @Date:2020/5/25 17:39
 * @version:1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class QuestionsDto implements Serializable {



    private String question;
    private Integer correctAnswer;

    private String[] answers;


}
