package com.chaman.gurjar.librarysystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Chaman Gurjar on 29-Apr-2020
 */

@RestController
public class HomeController {

    @Autowired
    private BuildProperties buildProperties;

    @GetMapping(value = {"/", "/version"})
    public String getVersion() {
        StringBuilder versioning = new StringBuilder(buildProperties.getName())
                .append(", ")
                .append(buildProperties.getVersion())
                .append(", ")
                .append(new Date());
        return versioning.toString();
    }

}
