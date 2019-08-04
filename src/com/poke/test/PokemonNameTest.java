package com.poke.test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;

import org.junit.BeforeClass;
import org.junit.Test;

public class PokemonNameTest {

	static final String VALID_NAME = "machoke";

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";
	}

	@Test
	public void testResposeStatus200() {
		when().get("/machoke").then().statusCode(200);
	}

	@Test
	public void testResposeStatus404() {
		when().get("/machokesss").then().statusCode(404);
	}

	@Test
	public void testValidNameInResponse() {
		when().get("/" + VALID_NAME).then().body("name", equalTo(VALID_NAME));
	}

}
