package com.example.pokemon.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemon.entity.Customer;

@RestController
@RequestMapping("/details")
public class PokemonController {
	
	@Value("${spring.cloud.config.server.git.uri: default value}")
	private String url;
		
	@GetMapping("/pokemon")
	public void getPokemon() {
		System.out.println("skksks");
		System.out.println(url);
	}
	
	@GetMapping(value = "/customer", produces =MediaTypes.HAL_JSON_VALUE)
	public List<Customer> getCustomer() {
		Customer c = new Customer("111", "jack", "bcc");
		Customer c1 = new Customer("112", "jill", "acc");
		
		Link link = Link.of("/something", "my-rel");
		Link selfLink = WebMvcLinkBuilder.linkTo(PokemonController.class).slash(c.getCustomerId()).withSelfRel();
       // c.add(selfLink);
		c.add(Link.of("/something", "my-rel"));
		return Arrays.asList(c, c1);
	}

}
