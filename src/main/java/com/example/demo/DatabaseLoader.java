package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductoRepository repos;
	private final CategoriaRepository repo;

	@Autowired
	public DatabaseLoader(
		ProductoRepository repos,
		CategoriaRepository repo
		) {
		this.repos=repos;
		this.repo=repo;
	}

	@Override
	public void run(String... strings) throws Exception {
		

	}
}