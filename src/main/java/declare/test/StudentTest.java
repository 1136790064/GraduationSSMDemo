package declare.test;

import com.alibaba.fastjson.JSON;
import declare.entity.Student;
import declare.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试增删查改学生信息
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class StudentTest {

    @Resource
    private StudentService studentService;

    //测试添加学生信息
    @Test
    public void TestAddStudent(){

        Student student = new Student();
        student.setSno("20172109");
        student.setName("李军");
        student.setPassword("342623");
        student.setSex("男");
        student.setCollege("管理科学与工程学院");
        student.setIdCard("342623200001265937");
        student.setMajor("计算机科学与技术");
        student.setEnrollmentYear(2017);
        student.setPhone("13866517320");
        student.setEmail("1136790064@qq.com");

        System.out.println(studentService.AddStudent(student));

    }

    //测试更新学生信息
    @Test
    public void TestUpdateStudent(){

        Student student = new Student();
        student.setSno("20172109");
        student.setName("李军");
        student.setPassword("265937");
        student.setSex("男");
        student.setCollege("管理科学与工程学院");
        student.setIdCard("342623200001265937");
        student.setMajor("计算机科学与技术");
        student.setEnrollmentYear(2017);
        student.setPhone("13866517320");
        student.setEmail("1136790064@qq.com");

        System.out.println(studentService.UpdateStudent(student));

    }

    //测试根据学号删除学生信息
    @Test
    public void TestDeleteStudentBySno(){

        String sno = "20172109";

        System.out.println(studentService.DeleteStudentBySon(sno));

    }

    //测试根据学号查询学生信息
    @Test
    public void TestSelectStudentBySno(){
        String sno = "20172109";

        System.out.println(JSON.toJSONString(studentService.SelectStudentBySno(sno)));
    }
}
