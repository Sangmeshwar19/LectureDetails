package com.example.LectureDetails.Service;

import com.example.LectureDetails.Model.Course;
import com.example.LectureDetails.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public void addcourse(Course course){
        courseRepo.save(course);
    }
    public List<Course> getCourse(){
      return courseRepo.findAll();
    }
}
