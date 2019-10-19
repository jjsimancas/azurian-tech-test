package cl.azurian.test.app;

import cl.azurian.test.app.models.Client;
import cl.azurian.test.app.service.ServiceClient;
import cl.azurian.test.app.service.ServiceClientImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ClAzurianTestAppApplicationTests {

	@Mock
	private ServiceClientImpl serviceClient;

	@Test
	void contextLoads() {
	}

	/*DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);*/

	@Test
	public void findAllTest(){
		Client client = new Client();
		client.setRun(23232333);
		client.setDigitVer(4);
		client.setFirstName("Alonso");
		client.setLastName("Ojeda");
		client.setPhoneClient("979002323");
		List<Client> clients = new ArrayList<>();
		clients.add(client);
		Mockito.when(serviceClient.findAll()).thenReturn(clients);



	}

}
