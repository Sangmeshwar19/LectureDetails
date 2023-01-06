package com.example.LectureDetails.Controller;

import com.example.LectureDetails.Model.Course;
import com.example.LectureDetails.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("/add_Course")
    public void addcourse(Course course){
        courseService.addcourse(course);
    }
    @GetMapping("/get_all_courses")
    public List<Course> getAllcourse(){
        return courseService.getCourse();
    }
}
