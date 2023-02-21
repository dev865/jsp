package repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.ProductVO;

public class ProductDAOImpl implements ProductDAO {
	private static Logger log = LoggerFactory.getLogger(ProductDAOImpl.class);

	@Override
	public int insert(ProductVO pvo) {

		return 0;
	}

	@Override
	public List<ProductVO> list() {

		return null;
	}

	@Override
	public ProductVO selectOne(long pno) {

		return null;
	}

	@Override
	public int update(ProductVO pvo) {

		return 0;
	}

	@Override
	public int delete(long pno) {

		return 0;
	}

}
