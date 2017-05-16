package cumt.ec.instrument.serviceImpl;

import cumt.ec.instrument.service.GuitarService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import cumt.ec.instrument.dao.*;
import cumt.ec.instrument.domain.Guitar;
import cumt.ec.instrument.domain.Inventory;

public class GuitarServiceImpl implements GuitarService {
		protected GuitarDao guitarDao;
		public void setGuitarDao(GuitarDao guitarDao) {
			this.guitarDao = guitarDao;
		}
	@Override
	public JSONArray searchGuitar(String numStrings,String builder,String model,
			String backWood,String topWood) {
		 ArrayList<Guitar> guitars=(ArrayList<Guitar>)guitarDao.searchGuitar(numStrings,builder,model,backWood,topWood);
		 Inventory inv=new Inventory();
		 inv.setGuitars(guitars);
		 Guitar searchGuitar=new Guitar();
		 searchGuitar.setTopWood(topWood);
		 searchGuitar.setBackWood(backWood);
		 searchGuitar.setBuilder(builder);
		 searchGuitar.setModel(model);
		 searchGuitar.setNumStrings(numStrings);
		 List<Guitar> matchingGuitars = inv.search(searchGuitar);
		  JSONArray array=new JSONArray();
		  for(Guitar guitar:matchingGuitars){
			  JSONObject jo=new JSONObject();
			  jo.put("topWood", guitar.getTopWood());
			  jo.put("backWood", guitar.getBackWood());
			  jo.put("numStrings", guitar.getNumStrings());
			  jo.put("model", guitar.getModel());
			  jo.put("builder", guitar.getBuilder());
			  array.add(jo);
		  }
		 return array; 
	}}
