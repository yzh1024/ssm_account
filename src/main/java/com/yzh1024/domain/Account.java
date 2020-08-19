package com.yzh1024.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
