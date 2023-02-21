package service;

import java.util.List;

import domain.ProductVO;
import repository.ProductDAO;
import repository.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDAO pdao;
	public ProductServiceImpl() {pdao = new ProductDAOImpl();}
	
	@Override
	public int register(ProductVO pvo) {

		return pdao.insert(pvo);
	}

	@Override
	public List<ProductVO> selectList() {

		return pdao.list();
	}

	@Override
	public ProductVO selectOne(long pno) {

		return pdao.selectOne(pno);
	}

	@Override
	public int modify(ProductVO pvo) {

		return pdao.update(pvo);
	}

	@Override
	public int delete(long pno) {

		return pdao.delete(pno);
	}

}
