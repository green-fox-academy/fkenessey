package com.greenfoxacademy.dountil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DountilApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class DountilApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
					MediaType.APPLICATION_JSON.getSubtype(),
					Charset.forName("utf-8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void doublingTest() throws Exception {
		mockMvc.perform(
						get("/doubling?input=15"))

						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.received", is("15")))
						.andExpect(jsonPath("$.result", is("30")));
	}

	@Test
	public void doublingTestNoInputError() throws Exception {
		mockMvc.perform(
						get("/doubling"))

						.andExpect(status().isBadRequest())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.error", is("Please provide an input!")));

	}

	@Test
	public void greeterTest() throws Exception {
		mockMvc.perform(
						get("/greeter?name=Petike&title=student"))

						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.name", is("Petike")))
						.andExpect(jsonPath("$.title", is("student")))
						.andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
	}

	@Test
	public void greeterTestNoNameError() throws Exception {
		mockMvc.perform(
						get("/greeter"))

						.andExpect(status().isBadRequest())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.error", is("Please provide a name!")));

	}

	@Test
	public void greeterTestNoTitleError() throws Exception {
		mockMvc.perform(
						get("/greeter?name=Petike"))

						.andExpect(status().isBadRequest())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.error", is("Please provide a title!")));

	}

	@Test
	public void appendATest() throws Exception {
		mockMvc.perform(
						get("/appenda/kuty"))

						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.toAppend", is("kuty")))
						.andExpect(jsonPath("$.appended", is("kutya")));
	}

	@Test
	public void appendATestNoInputError() throws Exception {
		mockMvc.perform(
						get("/appenda"))

						.andExpect(status().isNotFound());

	}

	@Test
	public void doUntilTestSum() throws Exception {
		mockMvc.perform(
						post("/dountil/sum")
										.contentType(contentType)
										.content("{\"until\": 5}")
		)
						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.until", is(5)))
						.andExpect(jsonPath("$.result", is(15)));
	}

	@Test
	public void doUntilTestFactor() throws Exception {
		mockMvc.perform(
						post("/dountil/factor")
										.contentType(contentType)
										.content("{\"until\": 5}")
		)
						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.until", is(5)))
						.andExpect(jsonPath("$.result", is(120)));
	}

	@Test
	public void doUntilTestNoInputError() throws Exception {
		mockMvc.perform(
						post("/dountil/sum"))

						.andExpect(status().isBadRequest())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.error", is("Please provide a number!")));

	}

	@Test
	public void arrayHandlerTestSum() throws Exception {
		int[] result = {2, 4, 10, 20};
		mockMvc.perform(
						post("/arrays")
										.contentType(contentType)
										.content("{\"what\": \"sum\", \"numbers\": [1, 2, 5, 10]}")
		)
						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.result", is(18)));
	}

	@Test
	public void arrayHandlerTestMultiply() throws Exception {
		mockMvc.perform(
						post("/arrays")
										.contentType(contentType)
										.content("{\"what\": \"multiply\", \"numbers\": [1, 2, 5, 10]}")
		)
						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.result", is(100)));
	}

	/*@Test
	public void arrayHandlerTestDouble() throws Exception {
		mockMvc.perform(
						post("/arrays")
										.contentType(contentType)
										.content("{\"what\": \"double\", \"numbers\": [1, 2, 5, 10]}")
		)
						.andExpect(status().isOk())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.result", is(result)));
	}*/

	/*@Test
	public void arrayHandlerTestNoNumberError() throws Exception {
		mockMvc.perform(
						post("/arrays")
							.contentType(contentType)
							.content("{\"what\": \"sum\", \"numbers\": \"\""))
						.andExpect(status().isBadRequest())
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
	}*/
}
