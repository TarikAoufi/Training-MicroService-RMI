package org.sid.config;

import org.sid.service.StudentRmiService;
import org.sid.service.TrainingRmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Classe de configuration 
 * pour exposer des services RMI
 * 
 */
@Configuration
public class MyConfig {
	
	@Bean
	@Autowired
	public RmiServiceExporter getTrainingRmiExporter(TrainingRmiService trainingService) {
		Class<TrainingRmiService> serviceInterface = TrainingRmiService.class;
	    RmiServiceExporter exporter = new RmiServiceExporter();
	    exporter.setServiceInterface(serviceInterface);
	    exporter.setService(trainingService);
	    exporter.setServiceName(serviceInterface.getSimpleName());
	    exporter.setRegistryPort(1099); 
	    return exporter;
	}
	
	@Bean
	@Autowired
	public RmiServiceExporter getStudentRmiExporter(StudentRmiService studentService) {
		Class<StudentRmiService> serviceInterface = StudentRmiService.class;
	    RmiServiceExporter exporter = new RmiServiceExporter();
	    exporter.setServiceInterface(serviceInterface);
	    exporter.setService(studentService);
	    exporter.setServiceName(serviceInterface.getSimpleName());
	    exporter.setRegistryPort(1099); 
	    return exporter;
	}
	
	// équivalent
	/*
	@Bean
	public RmiServiceExporter getStudentRmiExporter(ApplicationContext ctx) {
		Class<StudentRmiService> serviceInterface = StudentRmiService.class;
		StudentRmiService studentService = ctx.getBean(StudentRmiService.class);		
		RmiServiceExporter exporter = new RmiServiceExporter();		
		exporter.setService(studentService);	
		exporter.setServiceName(serviceInterface.getSimpleName());
		exporter.setRegistryPort(1099);	
		return exporter;
	}
	 */
}
