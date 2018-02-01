package com.greenfoxacademy.pallidaretake;

import static org.junit.Assert.*;

import com.greenfoxacademy.pallidaretake.models.entities.Merchandise;
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
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = PallidaretakeApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class PallidaretakeApplicationTest {

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
  public void checkEqualQuery() throws Exception {
    mockMvc.perform(
                    get("/warehouse/query?price=39&type=equal"))

                    .andExpect(status().isOk())
                    .andExpect(content().contentType(contentType))
                    .andExpect(jsonPath("$.result", is("ok")))
                    .andExpect(jsonPath("$.clothes[0].id", is(16)));

  }

  @Test
  public void checkMissingPriceQuery() throws Exception {
    List<Merchandise> clothes = null;
    mockMvc.perform(
                    get("/warehouse/query?price=&type=equal"))
                    .andExpect(status().isBadRequest())
                    .andExpect(content().contentType(contentType))
                    .andExpect(jsonPath("$.result", is("error - no input")))
                    .andExpect(jsonPath("$.clothes", is(clothes)));
  }
}