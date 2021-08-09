package declare.service;

import declare.dao.StudentDao;
import declare.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对学生表进行增删查改
 */
@Service
public class StudentService {

    //自动装配StudentDao bean
    @Resource
    private StudentDao studentDao;

    //添加学生信息
    public int AddStudent(Student student){
        return studentDao.AddStudent(student);
    }

    //更新学生信息
    public int UpdateStudent(Student student){return studentDao.UpdateStudent(student);}

    //根据学号删除学生信息
    public int DeleteStudentBySon(String sno){return studentDao.DeleteStudentBySno(sno);}

    //根据学号查询单个学生信息
    public List<Student> SelectStudentBySno(String sno){return studentDao.SelectStudentBySno(sno);}
}
