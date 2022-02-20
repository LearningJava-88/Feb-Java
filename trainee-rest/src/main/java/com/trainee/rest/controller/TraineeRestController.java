package com.trainee.rest.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.rest.dto.TraineeDto;
import com.trainee.rest.dto.TraineeModelDto;
import com.trainee.rest.model.TraineeModel;
import com.trainee.rest.model.Trainees;
import com.trainee.rest.repository.TraineeModelRepository;
import com.trainee.rest.repository.TraineeRepository;


@RestController
@RequestMapping("/dashboard/v1")
public class TraineeRestController {
	
	
	@Autowired
	private TraineeRepository rep;
	
	
	@Autowired
	private TraineeModelRepository modelRep;
	
	@Autowired
    private ModelMapper modelMapper;

	
		@GetMapping("/something")
		public String getSomething() {
			return "Hello Trianees";
			
		}
		
		@GetMapping("/trainees")
		public List<Trainees> getTrainees() {
			return rep.findAll();
		}
		
		@GetMapping("/traineemodel/{id}")
		public TraineeModel getTrainees(@PathVariable("id") Integer id) {
			Optional<TraineeModel> t =  modelRep.findByEmpid(id);
			return t.get();
		}
		
		
		@PostMapping("/postTrainee")
		public ResponseEntity<Trainees> insertRec(@RequestBody TraineeDto tra){
			
			 Trainees tr = modelMapper.map(tra, Trainees.class);
			 rep.save(tr);
			 
			 return new ResponseEntity<Trainees>(tr,HttpStatus.OK);
		}
		
		@PostMapping("/postTraineeModel")
		public ResponseEntity<TraineeModel> insertRecModel(@RequestBody TraineeModelDto model){
			
			TraineeModel traineeModel = modelMapper.map(model, TraineeModel.class);
			/*
			 * traineeModel.setEffDate("01/01/2022"); traineeModel.setEmpid(1112);
			 * traineeModel.setProj("DEVOPS-AWS");
			 */
			/*
			 * traineeModel.setEffDate(model.getEffDate());
			 * traineeModel.setEmpid(model.getEmpid());
			 * traineeModel.setProj(model.getProj());
			 */
			
			TraineeModel tr = modelRep.save(traineeModel);
			 
			 return new ResponseEntity<TraineeModel>(tr,HttpStatus.OK);
		}
		
		@DeleteMapping("/delete/{id}")
		public void deleteModel(@PathVariable("id") Integer empId){
			
						
			 rep.deleteById(empId);
			 
		}		
		
		
		
		
		
		
		
}
	