package gunjika.cg.capgemini.spring.dao;

import java.util.List;

import gunjika.cg.capgemini.spring.entity.Product;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}
