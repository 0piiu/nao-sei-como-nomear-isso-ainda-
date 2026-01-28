package entities;

import java.util.List;

public class Product {
	
	private String nome;
	private Double price;
	
	
	public Product() {
		
	}
	
	public Product(Double price) {
		this.price = price;		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	// fucao para encontrar o maior valor da lista

	public static double maximo(List <Double> list) {
		if(list.isEmpty()){
			throw new IllegalStateException ("A lista precisa conter dados");
		}
		Double max = list.get(0);
		for(Double item:list) {
			if(max.compareTo(item) > 0) {
				max = item;
			}
		}
		return max;
	}
}
