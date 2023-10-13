package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

	@MockBean
	private PartsRepository partsRepository;

	@Autowired
	private PartsService partsService;

	@Test
	void retrieveItemsfromRepo() {
		PartsRepository partsRepository = new PartsRepository();

		assertThat(partsRepository.getParts().size()).isEqualTo(4);
	}

	@Test
	void addPartAndRetrieveNewParts(){
		ArrayList<Part> testList = new ArrayList<>(List.of(new Part("coffee")));
		when(partsRepository.getParts()).thenReturn(testList);

		assertThat(partsService.getParts().size()).isEqualTo(1);
		assertThat(partsService.getParts().get(0).name()).isEqualTo("coffee");
	}
}
