package chapter5.spittr.web;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import chapter5.spittr.data.Spitter;
import chapter5.spittr.data.SpitterRepository;

public class SpitterControllerTest {

	@Test
	public void shouldShowRegistration() throws Exception {
		// Given
		
		SpitterController controller = new SpitterController(mock(SpitterRepository.class));
		MockMvc mockMvc = standaloneSetup(controller).build();

		// When
		ResultActions actions = mockMvc.perform(get("/spitter/register"));

		// Then
		actions.andExpect(view().name("registerForm"));
	}
	
	@Test
	public void shouldProcessRegistration() throws Exception {
		SpitterRepository mockRepository = mock(SpitterRepository.class);
		Spitter unsaved = new Spitter("jsmith", "24hours", "John", "Smith");
		Spitter saved = new Spitter(24L, "jsmith", "24hours", "John", "Smith");
		when(mockRepository.save(unsaved)).thenReturn(saved);

		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc = standaloneSetup(controller).build();

		// When
		ResultActions actions = mockMvc.perform(post("/spitter/register").param("firstName", "John")
				.param("lastName", "Smith").param("username", "jsmith").param("password", "24hours"));

		// Then
		actions.andExpect(redirectedUrl("/spitter/jsmith"));
		verify(mockRepository, atLeastOnce()).save(unsaved);
	}
}
