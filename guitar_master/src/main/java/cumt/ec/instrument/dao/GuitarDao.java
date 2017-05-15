package cumt.ec.instrument.dao;

import net.sf.json.JSONArray;

public interface GuitarDao {
	public JSONArray searchGuitar(String numStrings,String builder,String model,
			String backWood,String topWood);

}
