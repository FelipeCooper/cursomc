package com.felipecooper.cursomc.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter @Setter
public class StandError implements Serializable {
    private Integer status;
    private String msg;
    private Long timeStamp;
}
