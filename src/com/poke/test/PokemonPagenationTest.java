package com.poke.test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;

import org.junit.BeforeClass;
import org.junit.Test;

public class PokemonPagenationTest {

	static final int VALID_ID = 67;

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";
	}

	@Test
	public void testResposeStatus200() {
		when().get("?offset=10&limit=10").then().statusCode(200);
	}

	@Test
	public void testResultLength() {
		when().get("?offset=5&limit=25").then()
				.body("results.size()", equalTo(25));
	}
	
	@Test
	public void testNextPaginationNull() {
		when().get("?offset=965&limit=25").then()
				.body("next", equalTo(null));
	}
	
	
	@Test
	public void testResultWhenOffsetGrtrThanCount() {
		when().get("?offset=965&limit=5").then()
				.body("results.size()", equalTo(0));
	}

	@Test
	public void testPreviousIsNull() {
		when().get("?offset=0&limit=5").then().body("previous", equalTo(null));
	}

	@Test
	public void testValidIdInResponse() {
		when().get("/" + VALID_ID).then().body("id", equalTo(VALID_ID));
	}

}
