package repository;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.ProdVO;

public interface ProductDAO {
	public int insert(ProdVO pvo);
	public List<ProdVO> selectList();
	public ProdVO selectOne(int pno);
	public int update(ProdVO pvo);
	public int delete(int pno);
}
