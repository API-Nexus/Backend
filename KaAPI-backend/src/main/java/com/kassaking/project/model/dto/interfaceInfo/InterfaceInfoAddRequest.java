package com.kassaking.project.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;


@Data
public class InterfaceInfoAddRequest implements Serializable {

    private String name;

    private String description;

    private String url;

    private String requestParams;

    private String requestHeader;

    private String responseHeader;

    private String method;

}