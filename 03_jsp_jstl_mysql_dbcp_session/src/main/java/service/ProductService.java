package service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.ProdVO;
public interface ProductService {
	public int register(ProdVO pvo);
	public List<ProdVO> getList();
	public ProdVO getDetail(int pno);
	public int modify(ProdVO pvo);
	public int remove(int pno);
}
