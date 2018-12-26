package com.muhammetalikaya.example.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.muhammetalikaya.example.model.Owner;
import com.muhammetalikaya.example.service.ExampleService;

@RestController
@RequestMapping("/rest")
public class PharmaRestController {

	@Autowired
	private ExampleService exampleService;
	
	@RequestMapping(method=RequestMethod.GET,value="/owners")
	public ResponseEntity<List<Owner>> getOwners(){
		List<Owner> owners = exampleService.tumYoneticileriBul();
				return ResponseEntity.ok(owners);
	}
	
}












