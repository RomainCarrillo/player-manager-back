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
import com.meetmyteam.playermanager.domain.Player;
import com.meetmyteam.playermanager.feature.players.PlayerController;
import com.meetmyteam.playermanager.feature.players.PlayerRepositary;

@SpringBootTest
@AutoConfigureMockMvc
class PlayersControllerTest {

	 @Autowired
	    private MockMvc mvc;

	    @Autowired
		private PlayerRepositary playerRepositary;
	    
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
	  
		@Test
		void getPlayerByIdTest() throws Exception {
			LocalDate birthDate = LocalDate.of(1992, 12, 01);

			Player player1 = new Player("Foo", "Bar", birthDate, "http://photo");
			Player player2 = new Player("Tic", "Toc", birthDate, "http://photo");

			Mockito.when(playerController.getPlayerById(1L)).thenReturn(player1);
			Mockito.when(playerController.getPlayerById(2L)).thenReturn(player2);

			Player player = playerController.getPlayerById(1L);

			assertEquals("Foo", player.getFirstName());
		}
}
