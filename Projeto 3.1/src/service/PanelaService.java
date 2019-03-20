package service;

import java.util.List;

import javax.inject.Inject;

import com.stefanini.projeto.dao.panelaDAO;
import com.stefanini.projeto.model.Dono;

import dao.PanelaDAO;
import model.Panela;

public class PanelaService {

	@Inject
	PanelaDAO PanelaDao;

	public List<Panela> findAll() {
		return PanelaDao.findAll();
	}
	
	public long teste(Long numero1, Long numero2) {
		return numero1 == null || numero2 == null 
				? 0L : numero1 % 2l == 0 && numero2 % 2l == 0 
				? numero1 + numero2 
						: numero1 % 2l != 0 && numero2 % 2l != 0 
						? numero1-numero2 
								: 0l;
	}

	public void setPanelaDao(PanelaDAO panelaDao) {
		this.panelaDao = panelaDao;
	}

}
