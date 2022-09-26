package processpension.demoprocesspension.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import processpension.demoprocesspension.service.ProcessService;


@RestController
@CrossOrigin
public class ProcessController {
	
	

	@Autowired
	private ProcessService pmservice;
	
	

	
	@PostMapping("/ProcessPension/{aadhar_number}")
	public ResponseEntity<Map<String, String>> getProcessPension(@PathVariable(value = "aadhar_number") long aadhar_number) {
		Double amount = pmservice.findByProcessPension(aadhar_number);
		Map<String,String> map = new HashMap<String, String>();
		map.put("pension_amount",amount.toString());
		return ResponseEntity.ok(map);	
			
	

	
	
	}
}
