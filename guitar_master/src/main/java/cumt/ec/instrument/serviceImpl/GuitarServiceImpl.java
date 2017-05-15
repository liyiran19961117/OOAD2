package cumt.ec.instrument.serviceImpl;

import cumt.ec.instrument.service.GuitarService;
import net.sf.json.JSONArray;
import javax.annotation.Resource;
import cumt.ec.instrument.dao.*;

public class GuitarServiceImpl implements GuitarService {
	//注入dao
		//@Resource(name="guitarDao")
		protected GuitarDao guitarDao;
		public void setGuitarDao(GuitarDao guitarDao) {
			this.guitarDao = guitarDao;
		}

	@Override
	public JSONArray searchGuitar(String numStrings,String builder,String model,
			String backWood,String topWood) {
		//GuitarDao guitarDaoImpl=new GuitarDaoImpl();
		return guitarDao.searchGuitar(numStrings,builder,model,backWood,topWood);
	}}
