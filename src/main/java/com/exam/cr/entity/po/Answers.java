package com.exam.cr.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Answers implements Serializable {

  @TableId(type = IdType.AUTO)
  private Integer aid;
  private String answers;
  private Integer qid;
  private Integer sortNum;
  private Integer status;

}
