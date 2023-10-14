package com.kassaking.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @TableName product
 */
@Data
public class InterfaceInfoUpdateRequest implements Serializable {

    private Long id;


    private String name;

    private String description;

    private String url;

    private String requestParams;

    private String requestHeader;

    private String responseHeader;

    /**
     * 0 for close, 1 for open
     */
    private Integer status;

    private String method;

    private static final long serialVersionUID = 1L;
}