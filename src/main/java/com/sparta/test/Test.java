package com.sparta.test;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Test {
    
    @Column(nullable = false)
    private String name;

}
