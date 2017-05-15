package cumt.ec.instrument.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import cumt.ec.instrument.service.*;
import net.sf.json.JSONArray;

public class GuitarAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Resource(name="guitarService")
	protected GuitarService guitarService;
	private String numStrings;
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	private JSONArray jsonArray;
	public GuitarService getGuitarService() {
		return guitarService;
	}
	public void setGuitarService(GuitarService guitarService) {
		this.guitarService = guitarService;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	
	public String getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(String numStrings) {
		this.numStrings = numStrings;
	}
	public JSONArray getJsonArray() {
		return jsonArray;
	}
	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}
	public String searchGuitar(){
	//	GuitarService guitarServiceImpl=new GuitarServiceImpl();
		jsonArray=guitarService.searchGuitar(numStrings,builder,model,backWood,topWood);
			return "jsonArray";
	}

}
