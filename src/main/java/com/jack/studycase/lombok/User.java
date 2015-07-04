package com.jack.studycase.lombok;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class User {
    private String name;
    private int age;
    private String sex;
}

