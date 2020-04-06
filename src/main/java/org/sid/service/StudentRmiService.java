package org.sid.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import org.sid.entity.Student;

/**
 * Service RMI pour gérer des étudiants
 *
 */
public interface StudentRmiService extends Remote {

	public List<Student> getStudents() throws RemoteException;

	public Student getStudent(Long id) throws RemoteException;
	
	public Student saveStudent(Student student) throws RemoteException;
	
	public Student updateStudent(Long id, Student student) throws RemoteException;
	
	public void deleteStudent(Long id) throws RemoteException;
}
