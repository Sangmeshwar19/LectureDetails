package com.example.LectureDetails.Controller;

import com.example.LectureDetails.Model.Teacher;
import com.example.LectureDetails.Repository.TeacherRepo;
import com.example.LectureDetails.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;


    @PostMapping("/add_Teacher")
    public void addTeacher(Teacher teacher){
        teacherService.addTeacher(teacher);
    }
    @GetMapping("/get_Allte")
    public List<Teacher> getallte(){
        return  teacherService.getallteacher();
    }
}
