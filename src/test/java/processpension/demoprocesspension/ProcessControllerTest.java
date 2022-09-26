package processpension.demoprocesspension;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import processpension.demoprocesspension.controller.ProcessController;
import processpension.demoprocesspension.service.ProcessService;
import processpension.demoprocesspension.service.ProcessUtil;





@AutoConfigureMockMvc
@SpringBootTest
public class ProcessControllerTest {
	
	
	@Autowired
	private ProcessController pmController;
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProcessService pmservice;
	
	@MockBean
	private ProcessUtil jwtUtil;
	
	
	
	
	@Test
	void getProcessPension() throws Exception
	{
		when(pmservice.findByProcessPension(6849072063696130L)).thenReturn(12.0);
		RequestBuilder requestBuilder=MockMvcRequestBuilders.post("/ProcessPension/6849072063696130").content("acv")
        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		//RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/v1/giftcard/", giftCardPaymentRequest).content(new ObjectMapper().writeValueAsString(giftCardPaymentRequest)).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);when(giftCardService.postGCPayment(Mockito.any(),Mockito.anyString())).thenReturn(giftCardPaymentResponseEnvelope);MvcResult result = mockMvc.perform(requestBuilder).andReturn();


		//MockMvcRequestBuilders.post( "/ProcessPension/{aadhar_number}").contentType(MediaType.APPLICATION_JSON)
	}

}
