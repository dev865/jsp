package repository;

import java.util.List;

import domain.ProductVO;

public interface ProductDAO {
	public int insert(ProductVO pvo);
	public List<ProductVO> list();
	public ProductVO selectOne(long pno);	
	public int update(ProductVO pvo);
	public int delete(long pno);
}
