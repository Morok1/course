package com.controller;

import com.example.smagin.course.CourseApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CourseApplication.class)
public class TestControllerTest {

    private MockMvc mockMvc;

    @Mock
    private TestService service;

    @InjectMocks
    private TestController controller;

    private final String jsonBody = "{\"username\": \"username\", \"password\": \"password\"}";

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

    }

    @Test
    public void hello() throws Exception {
        Mockito.doNothing().when(service).hello();
        mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk());
    }
}