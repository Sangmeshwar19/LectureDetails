package com.example.LectureDetails.Service;

import com.example.LectureDetails.Model.Teacher;
import com.example.LectureDetails.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepo teacherRepo;
    public void addTeacher(Teacher teacher){
        teacherRepo.save(teacher);
    }
    public List<Teacher> getallteacher(){
       return teacherRepo.findAll();
    }
}
