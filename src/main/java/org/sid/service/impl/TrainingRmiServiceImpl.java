package org.sid.service.impl;

import java.rmi.RemoteException;
import java.util.List;

import org.sid.entity.Training;
import org.sid.repository.TrainingRepository;
import org.sid.service.TrainingRmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingRmiServiceImpl implements TrainingRmiService {
	
	@Autowired
	private TrainingRepository trainingRepository;

	@Override
	public List<Training> getTrainings() throws RemoteException {
		return trainingRepository.findAll();
	}
	
	@Override
	public Training getTraining(Long id) throws RemoteException {
		return trainingRepository.findById(id).get();
	}

	@Override
	public Training save(Training training) throws RemoteException {
		return trainingRepository.save(training);
	}
	
	@Override
	public Training update(Long id, Training training) throws RemoteException {		
		training.setId(id);
		return trainingRepository.save(training);
	}

	@Override
	public void delete(Long id) throws RemoteException {
		trainingRepository.deleteById(id);
	}

}
