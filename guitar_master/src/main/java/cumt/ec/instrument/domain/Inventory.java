package cumt.ec.instrument.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import cumt.ec.instrument.common.daoImpl.BaseDaoHibernate4;
import net.sf.json.JSONArray;

@SuppressWarnings("rawtypes")
public class Inventory extends BaseDaoHibernate4{
	 private List<Guitar> guitars;
	 
	  public List getGuitars() {
		return guitars;
	}
	public void setGuitars(List guitars) {
		this.guitars = guitars;
	}
	public Inventory() {
	    guitars = new LinkedList();
	  }
	public void addGuitar(String numStrings,String builder,String model,String backWood,String topWood) {
           Guitar guitar = new Guitar();
           guitar.setBackWood(backWood);
           guitar.setBuilder(builder);
           guitar.setModel(model);
           guitar.setNumStrings(numStrings);
           guitar.setTopWood(topWood);
           guitars.add(guitar);
}
@SuppressWarnings("unchecked")
public List search(Guitar searchSpec) {
	 List matchingGuitars = new LinkedList();
	// List<Guitar> guitars = new LinkedList<Guitar>();
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next(); 
      if (guitar.matches(searchSpec))
    	  matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }
}