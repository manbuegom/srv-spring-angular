package com.manbuegom.srv_backend.repository;

import com.manbuegom.srv_backend.model.Teacher;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends ListCrudRepository<Teacher,Long> {

}
