package service;

import java.util.List;

import domain.ProductVO;

public interface ProductService {
	
	public int register(ProductVO pvo);
	public List<ProductVO> selectList();
	public ProductVO selectOne(long pno);
	public int modify(ProductVO pvo);
	public int delete(long pno);
}
