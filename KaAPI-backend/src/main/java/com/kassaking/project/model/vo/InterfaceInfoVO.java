package com.kassaking.project.model.vo;

import com.kassaking.kaapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {


    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}
