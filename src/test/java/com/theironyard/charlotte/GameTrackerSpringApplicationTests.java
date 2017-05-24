package com.theironyard.charlotte;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GameTrackerSpringApplicationTests {

	MockMvc mockMvc;

	@Autowired
	WebApplicationContext wap;

	@Autowired
	UserRepository users;

	@Autowired
	GameRepository games;

	@Before
	public void initMethod () {
		mockMvc = MockMvcBuilders.webAppContextSetup(wap).build();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void whoIsTheUser() throws Exception {
//		User initialUser = new User();
//		initialUser.setName("Zach");
//		initialUser.setPassword("b00gieMan");

//		String result = initialUser.getName();
//
//		assertEquals("Zach", result);
//		Game initialGame = new Game("MarioKart", "Wii", "Racing", 2001, users.findOne(1));

		// from within the terminal at our project's directory:
		// `heroku create` -- creates a new heroku website for you
		// `git push heroku master` -- pushes our latest code to heroku


		int originalCount = (int) games.count();

		mockMvc.perform(
				MockMvcRequestBuilders.post("/add-game")
						.sessionAttr("userName", "Zach")
						.param("gameYear", "2001")
						.param("gameName", "FFVII")
						.param("gamePlatform", "PS1")
						.param("gameGenre", "RPG")
		);

		Assert.assertEquals(originalCount + 1, games.count());
//	}
//	}
//	@Test
//    public void
	}
}
