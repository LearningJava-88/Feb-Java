package com.trainee.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainee.rest.model.Trainees;

public interface TraineeRepository extends JpaRepository<Trainees, Integer> {

}
