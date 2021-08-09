package declare.dao;

import declare.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    //添加学生个人信息
    int AddStudent(Student student);
    //更新学生个人信息
    int UpdateStudent(Student student);
    //删除学生个人信息
    int DeleteStudentBySno(@Param("sno") String sno);
    //查询学生个人信息
    List<Student> SelectStudentBySno(@Param("sno") String sno);
}
