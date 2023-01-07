package com.itwill.tmr_house.product.성민모;

import java.util.List;

public class ProductService {
	private ProductDao productDao;
	public ProductService() throws Exception{
		productDao=new ProductDao();
	}
	/*
	 * 전체상품조회
	 */
	public List<Product> productList() throws Exception{
			return productDao.findAll();
	}
	/*
	 * 상품상세조회
	 */
	public Product productDetail(int p_no) throws Exception{
		return productDao.findByPrimaryKey(p_no);
	}
	
}