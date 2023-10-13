package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PartsServiceUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldRetrieveAPartFromRepo() throws Exception {
        mockMvc.perform(get("/api/part?id=0"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("wololo")))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

}
