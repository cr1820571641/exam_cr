package com.exam.cr.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2020-05-25 18:22:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Score implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer sid;
    
    private Integer qid;
    
    private Integer aid;


}