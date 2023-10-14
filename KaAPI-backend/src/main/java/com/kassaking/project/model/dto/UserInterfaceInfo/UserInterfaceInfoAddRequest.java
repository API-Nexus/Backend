package com.kassaking.project.model.dto.UserInterfaceInfo;

import lombok.Data;

import java.io.Serializable;


@Data
public class UserInterfaceInfoAddRequest implements Serializable {

    private Long userId;

    private Long interfaceInfoId;

    private Integer totalNum;

    private Integer leftNum;

}