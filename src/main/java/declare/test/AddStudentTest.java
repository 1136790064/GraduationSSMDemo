package declare.test;

import declare.entity.Student;
import declare.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试添加学生信息
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class AddStudentTest {

    @Resource
    private StudentService studentService;

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

}
