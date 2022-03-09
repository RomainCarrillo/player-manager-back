package com.meetmyteam.playermanager.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PlayerDomainTest {

	@Test
	void playerDomainTest() {
		LocalDate birthDate = LocalDate.of(1992, 12, 01);
		List<Player> playersList = new ArrayList<>();
		Player player = new Player(1L, "Foo", "Bar", birthDate, "https://my-url.fr/");
		playersList.add(player);

		assertNotNull(playersList);
		assertEquals(player.getId(), 1L);
		assertEquals(player.getFirstName(), "Foo");
		assertEquals(player.getLastName(), "Bar");
		assertEquals(player.getBirthDate(), birthDate);
		assertEquals(player.getPhotoUrl(), "https://my-url.fr/");
	}
	
}
