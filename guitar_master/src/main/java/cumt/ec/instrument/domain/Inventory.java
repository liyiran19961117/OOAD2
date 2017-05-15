package cumt.ec.instrument.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import cumt.ec.instrument.common.daoImpl.BaseDaoHibernate4;
import net.sf.json.JSONArray;

@SuppressWarnings("rawtypes")
public class Inventory extends BaseDaoHibernate4{
	 private List guitars;
	 
	  public List getGuitars() {
		return guitars;
	}
	public void setGuitars(List guitars) {
		this.guitars = guitars;
	}
	public Inventory() {
	    guitars = new LinkedList();
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

