package com.company.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class FriendVo implements Serializable {
    private Long id;
    private Long code;
    private String name;
    private String imagePath;
    private Boolean flag;
    public FriendVo(){}
}
