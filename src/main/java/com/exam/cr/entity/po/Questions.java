package com.exam.cr.entity.po;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Questions implements Serializable {

  @TableId(type = IdType.AUTO)
  private Integer qid;
  private String question;
  private Integer correctAnswer;
  private Integer sortNum;
  private Integer status;

}
