package com.meetmyteam.playermanager.feature;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.util.CollectionUtils.isEmpty;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meetmyteam.domain.Player;
import com.meetmyteam.feature.players.PlayerController;
import com.meetmyteam.feature.players.PlayerRepository;

@SpringBootTest
@AutoConfigureMockMvc
class PlayersControllerTest {

	 @Autowired
	    private MockMvc mvc;

	    @Autowired
		private PlayerRepository playerRepositary;
	    
		@Autowired
		private PlayerController playerController;


	  @Test
		void getAllPlayersTest() throws Exception {
			playerRepositary.save(new Player());
			MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/players").accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk()).andReturn();
			String contentAString = mvcResult.getResponse().getContentAsString();
			List<Player> reponsePlayersList = new ObjectMapper().readValue(contentAString, new TypeReference<>() {
			});

			assertNotNull(reponsePlayersList);
			assertFalse(isEmpty(reponsePlayersList));
	  }
	  
		PlayerController mock = org.mockito.Mockito.mock(PlayerController.class);

		@Test
		void getPlayerByIdTest() throws Exception {
			LocalDate birthDate = LocalDate.of(1992, 12, 01);

			Player player1 = new Player("Foo", "Bar", birthDate, "http://photo");
			Player player2 = new Player("Tic", "Toc", birthDate, "http://photo");

			Mockito.when(mock.getPlayerById(1L)).thenReturn(player1);
			Mockito.when(mock.getPlayerById(2L)).thenReturn(player2);

			Player player = mock.getPlayerById(1L);

			assertEquals("Foo", player.getFirstName());
		}

}
