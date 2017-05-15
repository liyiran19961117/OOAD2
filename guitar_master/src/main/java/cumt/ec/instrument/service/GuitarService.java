package cumt.ec.instrument.service;
import net.sf.json.JSONArray;

public interface GuitarService {
	public JSONArray searchGuitar(String numStrings,String builder,String model,
			String backWood,String topWood);
}
