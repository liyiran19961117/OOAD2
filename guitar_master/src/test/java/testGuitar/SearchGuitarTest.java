package testGuitar;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import cumt.ec.instrument.domain.Guitar;
import cumt.ec.instrument.domain.Inventory;
public class SearchGuitarTest {
@Test
	public  void test() {
		 Inventory inventory = new Inventory();
		    initializeInventory(inventory);
		    Guitar whatErinLikes = new Guitar();
		    whatErinLikes.setBackWood("alder");
		    whatErinLikes.setTopWood("alder");
		    whatErinLikes.setBuilder("fender");
		    whatErinLikes.setModel("");
		    whatErinLikes.setNumStrings("6");
		    List matchingGuitars = inventory.search(whatErinLikes);
		    if (!matchingGuitars.isEmpty()) {
		      System.out.println("Erin, you might like these guitars:");
		      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
		        Guitar guitar = (Guitar)i.next();
		        System.out.println(" 制造商： " +
		        		guitar.getBuilder() + " 背部材料：" + guitar.getBackWood() + "顶部材料： " +
		        		guitar.getTopWood() + " 弦数：    " +
		          guitar.getNumStrings() + "型号：   " +
		          guitar.getModel() + " \n You can have it! ");
		      }
		    } else {
		      System.out.println("Sorry, Erin, we have nothing for you.");
		    }
		  }

		  private static void initializeInventory(Inventory inventory) {
		    inventory.addGuitar("6","fender","ff","alder","alder");		    
	}

}


