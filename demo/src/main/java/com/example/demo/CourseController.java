package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

@RequestMapping("/Courses")
public List<Course> RetrieveAllCourses(){

    return Arrays.asList(
            new Course(1,"Excel AI","Udemy",15.5),
            new Course(2,"IntelliJ","Udemy",20.5)
    );
}

}
