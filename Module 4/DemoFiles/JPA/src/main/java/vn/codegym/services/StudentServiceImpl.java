package vn.codegym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import vn.codegym.model.Student;
import vn.codegym.repository.StudentRepository;

import java.util.List;

@Service
@Primary
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.update(student);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }
}