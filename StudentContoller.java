package Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import Entity.StudentEntity;
import Repository.StudentRepository;

public class StudentContoller {
	@Autowired
	private StudentRepository studentRepository;
	@RequestMapping
	@PostMapping("/save")
	
public StudentEntity saveStudent(@RequestBody     StudentEntity s) {
	return studentRepository.save(s);	

}
	@GetMapping("/fetch")
	public List<StudentEntity> fetchall() {
		return	 studentRepository.findAll();
		
	}
	ArrayList<StudentEntity> slist=new ArrayList<>();

	public List<StudentEntity> getdata(){
	

	return slist=(ArrayList<StudentEntity>) studentRepository.findAll();
	//ssCollections.sort(slist,(e1,e2)->e1.getName().compareTo(e2.getName()));

		//System.out.println(slist);
	
			
	}
	
}