/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

public abstract class BaseBean<SRV extends BaseService, D extends BaseDto>  implements Serializable {

    public SRV service;
    public BaseDto dto;

    public BaseDto getDto() {
        return dto;
    }

    public void setDto(BaseDto dto) {
        this.dto = dto;
    }

    public void doAdd(){
        service.doAdd();
    }

    public void doDelete(){

    }
    public void doFind(){

    }
    public void doEdit(){

    }
}
