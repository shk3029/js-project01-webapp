package demos.comm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demos.comm.dao.BoardDAO;
import demos.comm.domain.Board;
/**
 * @author 171179
 *
 */
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO dao;

	@Override
	public void regist(Board board) throws Exception {
		dao.create(board);
	}
	
	@Override
	public Board read(Integer bno) throws Exception {
		return dao.read(bno);
	}
	
	@Override
	public void modify(Board board) throws Exception {
		dao.update(board);
	}
	
	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}
	
	@Override
	public List<Board> listAll(String searchOption, String keyword) throws Exception {
		return dao.listAll(searchOption, keyword);
	}
	
	@Override
	public int countArticle(String searchOption, String keyword) throws Exception {
		return dao.countArticle(searchOption, keyword);
	}
	
}
