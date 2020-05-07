package com.chaman.gurjar.librarysystem.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Chaman Gurjar on 29-Apr-2020
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.chaman.gurjar.librarysystem")
@PropertySource(value = "file:${user.home}/Spring-Practice/Config/Library-System.properties")
public class LibrarySystemConfig {

}
