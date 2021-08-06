package declare.service;

import declare.dao.StudentDao;
import declare.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对学生表进行增删查改
 */
@Service
public class StudentService {

    //自动装配StudentDao bean
    @Resource
    private StudentDao studentDao;

    //添加学生
    public int AddStudent(Student student){
        return studentDao.AddStudent(student);
    }

}
