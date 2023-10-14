package com.kassaking.project.model.dto.UserInterfaceInfo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {

    private Long id;

    private Integer totalNum;

    private Integer leftNum;

    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}