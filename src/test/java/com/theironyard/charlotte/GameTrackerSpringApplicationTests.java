package com.theironyard.charlotte;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameTrackerSpringApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void whoIsTheUser() {
		User initialUser = new User();
		initialUser.setName("Zach");
		initialUser.setPassword("b00gieMan");

		String result = initialUser.getName();

		assertEquals("Zach", result);

//		ObjectMapper mapper = new ObjectMapper();
//
//		String json = mapper.writeValueAsString(user);
//
//		mockMvc.perform(
//				MockMvcRequestBuilders.post("/user")
//						.content(json)
//						.contentType("application/json")
//		);
//
//		Assert.assertTrue(users.count() == 1);
//	}
//	}
//	@Test
//    public void
	}
}
