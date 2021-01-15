package com.zqh.springboot.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: zhangqinghua
 * @email: zidian.zqh@raycloud.com
 * @date: 2021/1/15 9:35 上午
 */
public class RequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer isEnable;

//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date startTimeEachDay;


    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Date getStartTimeEachDay() {
        return startTimeEachDay;
    }

    public void setStartTimeEachDay(Date startTimeEachDay) {
        this.startTimeEachDay = startTimeEachDay;
    }
}
