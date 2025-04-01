package com.estsoft.lombok;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Person {
    private Long id;
    private String name;
    private int age;
    private List<String> hobbies;
}
