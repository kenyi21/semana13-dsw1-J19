package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductoRepository repo1;
	private final CategoriaRepository repo2;

	@Autowired
	public DatabaseLoader(
		ProductoRepository repo1,
		CategoriaRepository repo2
		) {
		this.repo1=repo1;
		this.repo2=repo2;
	}

	@Override
	public void run(String... strings) throws Exception {
		Categoria cat1=new Categoria("Frutas", "Vitaminas puras");
		Categoria cat2=new Categoria("Verduras", "Muy nutritivas");
		this.repo2.save(cat1);
		this.repo2.save(cat2);
		Producto producto1=new Producto("Manzana", 5.50f, cat1);
		Producto producto2=new Producto("Melocoton", 1.50f, cat1);
		Producto producto3=new Producto("Zanahoria", 5.50f, cat2);
		this.repo1.save(producto1);
		this.repo1.save(producto2);
		this.repo1.save(producto3);

	}
}