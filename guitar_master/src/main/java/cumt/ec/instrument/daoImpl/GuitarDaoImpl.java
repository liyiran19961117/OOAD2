package cumt.ec.instrument.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cumt.ec.util.*;
import cumt.ec.instrument.common.daoImpl.BaseDaoHibernate4;
import cumt.ec.instrument.dao.GuitarDao;
import net.sf.json.JSONArray;
import cumt.ec.instrument.domain.Guitar;
import cumt.ec.instrument.domain.Inventory;
import net.sf.json.JSONObject;

public class GuitarDaoImpl extends BaseDaoHibernate4 implements GuitarDao {
//	private Connection connection = null; // �������ӵĶ���
//	private PreparedStatement ps = null; // ����Ԥ׼���Ķ���
//	private JDBConnection jdbc = null;  // �������ݿ����Ӷ���
//	public  GuitarDaoImpl(){
//		jdbc = new JDBConnection();
//		connection = jdbc.connection; // ���ù��췽��ȡ�����ݿ�����
//	}
//	public JSONArray searchGuitar(String price,String builder,String model,String type,
//			String backWood,String topWood){
//		    JSONArray array=new JSONArray();
//			String sql = "select * from inventory where 1=1";
//			if (price != null && !price.equals("")) {
//				Integer price1=Integer.parseInt(price);
//			    sql = sql + "  and price="  + price1 ;   
//			}
//			if (builder != null && !builder.equals("")) {
//			    sql = sql + "  and builder='" + builder + "'"; 
//			}
//			if (model != null && !model.equals("")) {
//				sql = sql + "  and model='" + model + "'"; 
//			}
//			if (type != null && !type.equals("")) {
//				sql = sql + "  and type='" + type + "'"; 
//			}
//			if (topWood != null && !topWood.equals("")) {
//				sql = sql + "  and topwood='" + topWood + "'"; 
//			}
//			if (backWood != null && !backWood.equals("")) {
//				sql = sql + "  and backwood='" + backWood + "'"; 
//			}
//			try {
//				ps = connection.prepareStatement(sql);
//				ResultSet rs = ps.executeQuery();
//				while(rs.next()) {
//					JSONObject guitar=new JSONObject();
//					guitar.put("builder",rs.getString(3));
//					guitar.put("price",rs.getDouble(2));
//					guitar.put("model",rs.getString(4));
//					guitar.put("type",rs.getString(5));
//					guitar.put("topWood",rs.getString(6));
//					guitar.put("backWood",rs.getString(7));
//					array.add(guitar);
//				}
//			} catch (SQLException ex) {
//				ex.printStackTrace();
//			}
//		return array;
//	} 
	public JSONArray searchGuitar(String numStrings,String builder,String model,
			String backWood,String topWood){
		 Inventory inv=new Inventory();
		 String hql="select distinct g from Guitar g";
		 //List<Guitar> guitars = new LinkedList<Guitar>();
		 inv.setGuitars(getSessionFactory().getCurrentSession().createQuery(hql).list());
		 Guitar searchGuitar=new Guitar();
		 searchGuitar.setTopWood(topWood);
		 searchGuitar.setBackWood(backWood);
		 searchGuitar.setBuilder(builder);
		 searchGuitar.setModel(model);
		 searchGuitar.setNumStrings(numStrings);

		 return inv.search(searchGuitar);
	}
	
}
