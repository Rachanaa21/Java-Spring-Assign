package com.example.springassignStudents.serviceimpl;

import com.example.springassignStudents.entity.Student;
import com.example.springassignStudents.repository.StudentRepository;
import com.example.springassignStudents.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository stdRepo;

    @Override
    public Student save(Student std) {
        String password = std.getPassword();

        std.setPassword(password);
        return stdRepo.save(std);
    }
    @Override
    public Optional<Student> getStdData(Long id) {
        return stdRepo.findById(id);
    }

    @Override
    public List<Student> getAll() {
        return stdRepo.findAll();
    }

    @Override
    public Student updatestd(Long id, Student student) {
        return stdRepo.save(student);
    }

    @Override
    public String deletebyID(Long id) {
        stdRepo.deleteById(id);
        return "deleted!";
    }

    /*public Student updateEmp(Long id, Student employee) {
        Optional<Student> updateEmp=stdRepo.findById(id);
        if(updateEmp.isPresent()) {
            return stdRepo.saveAll();
        }
        return null;
    }

    public String deleteEmpbyID(Long id) {
        String msg = null;
        Optional<Student> findstd = stdRepo.findById(id);
        if (findstd.isPresent()){
            stdRepo.deleteById(id);
            msg = "record deleted";
        }
        else {
            msg = "empty";
        }
        return msg;
    }
*/
}
