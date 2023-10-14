package com.kassaking.project.model.dto.interfaceInfo;

import com.kassaking.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

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

    private Long userId;
}