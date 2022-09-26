package processpension.demoprocesspension.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import processpension.demoprocesspension.model.ProcessModel;
import processpension.demoprocesspension.repository.ProcessRepo;



@Service

public class ProcessService {
	
	@Autowired   //  inject the value of the class PMRepository
	private ProcessRepo pensionrepo; 
	
	public Double findByProcessPension(long aadharNumber) {
		
		ProcessModel model = pensionrepo.findByAadharNumber(aadharNumber);
		Double pensionAmount=null;
		if (model != null)
		{
			if(model.getPensionType().equalsIgnoreCase("Self Pension"))
			{
				pensionAmount = (0.8*model.getSalaryEarned()) + model.getAllowances();
			}
			else
			{
				pensionAmount =  (0.5*model.getSalaryEarned()) + model.getAllowances();
			}
		}
		return pensionAmount;
		}

}
