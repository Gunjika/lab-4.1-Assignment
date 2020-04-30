package gunjika.cg.capgemini.spring.service;

import java.util.List;

import gunjika.cg.capgemini.spring.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}
