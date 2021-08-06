package declare.dao;

import declare.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    int AddStudent(Student student);
}
