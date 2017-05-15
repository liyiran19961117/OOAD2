package cumt.ec.instrument.dao;
import java.util.ArrayList;

import cumt.ec.instrument.common.dao.BaseDao;
import cumt.ec.instrument.domain.Guitar;

//import net.sf.json.JSONArray;

public interface GuitarDao {
	public ArrayList<Guitar> searchGuitar(String numStrings,String builder,String model,
			String backWood,String topWood);

}
