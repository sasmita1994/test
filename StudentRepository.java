package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>

{
	

}
