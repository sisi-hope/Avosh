/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.services.MessageService;
import com.avosh.baseproject.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Scope("request")
public class NewsBean extends BaseBean<NewsService,NewsDto>{

    private NewsDto newsDto;
    private List<NewsDto> newsDtoList;


    @Autowired
    public void setService(NewsService service) {
        this.service = service;
    }

    public NewsBean() {
        UserDto userDto = new UserDto();
        userDto.setName("gholi");
        userDto.setFamily("gholipor");
        NewsDto dto = new NewsDto(1l,"brif","news",new Date(),userDto);
        newsDtoList = new ArrayList<>();
        newsDtoList.add(dto);

    }

    public NewsDto getNewsDto() {
        return newsDto;
    }

    public void setNewsDto(NewsDto newsDto) {
        this.newsDto = newsDto;
    }

    public List<NewsDto> getNewsDtoList() {
        return newsDtoList;
    }

    public void init(){

    }
}
