package org.sid.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import org.sid.entity.Training;

/**
 * Service RMI pour gérer des formations
 *
 */
public interface TrainingRmiService extends Remote {

	public List<Training> getTrainings() throws RemoteException;

	public Training getTraining(Long id) throws RemoteException;

	public Training save(Training training) throws RemoteException;

	public Training update(Long id, Training training) throws RemoteException;

	public void delete(Long id) throws RemoteException;
}
