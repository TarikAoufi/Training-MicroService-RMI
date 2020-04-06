package org.sid.service.impl;

import java.rmi.RemoteException;
import java.util.List;

import org.sid.entity.Student;
import org.sid.repository.StudentRepository;
import org.sid.service.StudentRmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentRmiServiceImpl implements StudentRmiService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudents() throws RemoteException {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(Long id) throws RemoteException {
		return studentRepository.getOne(id);
	}

	@Override
	public Student saveStudent(Student student) throws RemoteException {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Long id, Student student) throws RemoteException {
		student.setId(id);
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) throws RemoteException {
		studentRepository.deleteById(id);
	}

}
