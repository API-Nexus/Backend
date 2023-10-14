package com.kassaking.project.model.dto.UserInterfaceInfo;

import com.kassaking.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@EqualsAndHashCode(callSuper = true)
@Data
public class UserInterfaceInfoQueryRequest extends PageRequest implements Serializable {

    private Long id;

    private Long userId;

    private Long interfaceInfoId;

    private Integer totalNum;

    private Integer leftNum;

    private Integer status;
}