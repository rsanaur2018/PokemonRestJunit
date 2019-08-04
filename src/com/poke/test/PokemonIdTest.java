package com.poke.test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;

import org.junit.BeforeClass;
import org.junit.Test;

public class PokemonIdTest {

	static final int VALID_ID = 67;

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";
	}

	@Test
	public void testResposeStatus200() {
		when().get("/50").then().statusCode(200);
	}

	@Test
	public void testResposeStatus404() {
		when().get("/50000067").then().statusCode(404);
	}

	@Test
	public void testValidIdInResponse() {
		when().get("/" + VALID_ID).then().body("id", equalTo(VALID_ID));
	}

}
