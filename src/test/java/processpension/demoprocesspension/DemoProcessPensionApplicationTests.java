package processpension.demoprocesspension;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;



import processpension.demoprocesspension.model.ProcessModel;
import processpension.demoprocesspension.repository.ProcessRepo;
import processpension.demoprocesspension.service.ProcessService;


@SpringBootTest
class DemoProcessPensionApplicationTests {

	@Autowired
	private ProcessService pmservice;
	
	@MockBean  // @MockBean creates a Mock for the Repository, which can be used to call the actual Repository
	private ProcessRepo pensionrepo;   
	
	@Test
	void findByProcessPension()
	{
		ProcessModel pmModel = new ProcessModel();
		
		pmModel.setAadharNumber(6849072063696130L);
		pmModel.setAllowances(555.0);
		pmModel.setBankAccountNumber(998877665585L);
		pmModel.setBankName("Better Life Holdings Inc");
		pmModel.setDate_of_birth("21-08-2021");
		pmModel.setFamilyPension(0.0);
		pmModel.setName("Jacqui Vanover");
		pmModel.setPan("YSNCH0058E");
		pmModel.setPensionType( "Family Pension");
		pmModel.setSalaryEarned(50044.0);
		pmModel.setSelfPension(0.0);
		
		
		
		Mockito.when(pensionrepo.findByAadharNumber(9060421389253850L)).thenReturn(pmModel);
		Double obj2=pmservice.findByProcessPension(9060421389253850L);
	}
	
	
	@Test
	void findByProcessPension_else()
	{
		ProcessModel pmModel = new ProcessModel();
		pmModel.setAadharNumber(6849072063696130L);
		pmModel.setAllowances(555.0);
		pmModel.setBankAccountNumber(998877665585L);
		pmModel.setBankName("Better Life Holdings Inc");
		pmModel.setDate_of_birth("21-08-2021");
		pmModel.setFamilyPension(0.0);
		pmModel.setName("Jacqui Vanover");
		pmModel.setPan("YSNCH0058E");
		pmModel.setPensionType( "Self Pension");
		pmModel.setSalaryEarned(50044.0);
		pmModel.setSelfPension(0.0);
		
		
		
	    Mockito.when(pensionrepo.findByAadharNumber(9060421389253850L)).thenReturn(pmModel);
		Double obj2=pmservice.findByProcessPension(9060421389253850L);
	}

}
