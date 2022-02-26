package com.trainee.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainee.rest.model.TraineeModel;
import com.trainee.rest.model.Trainees;

public interface TraineeModelRepository extends JpaRepository<TraineeModel,Integer> {

	public Optional<TraineeModel> findByEmpid(Integer id);
	
}

