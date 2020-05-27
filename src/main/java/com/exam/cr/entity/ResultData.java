package com.exam.cr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author:chen
 * @Date:2020/5/25 18:16
 * @version:1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ResultData<E> {

    private int code;

    private String msg;

    private E data;
}
