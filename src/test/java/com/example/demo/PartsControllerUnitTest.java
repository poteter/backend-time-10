package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class PartsControllerUnitTest {

    @MockBean
    private PartsService partsService;

    @Autowired
    private PartsController partsController;

    @Test
    void shouldRetrunReslut(){
        ArrayList<Part> testList = new ArrayList<>(List.of(new Part("coffee")));
        when(partsService.getParts()).thenReturn(testList);

        assertThat(partsController.getParts().getBody().get(0).name()).isEqualTo("coffee");
    }
}
