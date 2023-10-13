package com.example.demo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BigPart {

    private String partName;
    private int partNumber;
    private int number;
}
