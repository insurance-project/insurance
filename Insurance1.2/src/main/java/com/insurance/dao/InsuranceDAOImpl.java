package com.insurance.dao;

import com.insurance.model.insurance.Insurance;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class InsuranceDAOImpl extends DAO implements InsuranceDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void InsertInsurance(Insurance insurance) {
		sqlSession.insert("InsertInsurance", insurance);
	}

//	public InsuranceDAOImpl() {
//		try {
//			super.connect();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Override
//	public void create(Insurance insurance) {
//		// TODO Auto-generated method stub
//		String query = "insert into insurance (id,name,premium,warranty,rewardCost,premiumRate,rewardRate) values ("+
//		insurance.getId()+","+
//		"'"+insurance.getName()+"',"+
//		insurance.getPremium()+","+
//		insurance.getWarranty()+","+
//		insurance.getRewardCost()+","+
//		insurance.getPremiumRate()+","+
//		insurance.getRewardRate()+");";
//		
//		System.out.println(query);
//		try {
//			super.create(query);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		String query = "truncate insurance;";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void deleteByName(String name) {
//		// TODO Auto-generated method stub
//		String query = "alter table insurance drop column "+name;		
//		try {
//			super.delete(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	public Insurance retrieveById(int insId) {
//		// TODO Auto-generated method stub
//		Insurance ins = new Insurance();
//		String query = "select * from insurance where id = "+insId;
//		try {
//			ResultSet rs = super.retrieve(query);
//			while(rs.next()){
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				int premium = rs.getInt("premium");
//				int warranty = rs.getInt("warranty");
//				int rewardCost = rs.getInt("rewardCost");
//				int kind = rs.getInt("kind");
//				ins.setId(id);
//				ins.setName(name);
//				ins.setPremium(premium);
//				ins.setWarranty(warranty);
//				ins.setRewardCost(rewardCost);
//				ins.setKind(kind);
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return ins;
//	}
//
//	@Override
//	public void updateName(String name,String name2) {
//		// TODO Auto-generated method stub
//		String query = "alter table insurance change  "+name+" "+name2+" varchar(20);";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void updatePremium(String name,int premium) {
//		// TODO Auto-generated method stub
//		String query = "update insurance set premium="+"'"+premium+"'"+" where name = "+"'"+name+"';";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void updateWarranty(String name,int warranty) {
//		// TODO Auto-generated method stub
//		String query = "update insurance set warranty="+"'"+warranty+"'"+" where name = "+"'"+name+"';";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void updateRewardCost(String name,int rewardCost) {
//		// TODO Auto-generated method stub
//		String query = "update insurance set warranty="+"'"+rewardCost+"'"+" where name = "+"'"+name+"';";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void updatePremiumRate(String name,float premiumRate) {
//		// TODO Auto-generated method stub
//		String query = "update insurance set premiumRate="+"'"+premiumRate+"'"+" where name = "+"'"+name+"';";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void updateRewardRate(String name,float rewardRate) {
//		// TODO Auto-generated method stub
//		String query = "update insurance set rewardRate="+"'"+rewardRate+"'"+" where name = "+"'"+name+"';";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void addSurvivalInsurance(int id)
//	{
//		String query = "insert into survivalinsurance (insurance_id) values ("+id+");";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public void addDeathInsurance(int id)
//	{
//		String query = "insert into deathinsurance (insurance_id) values ("+id+");";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public void addMixedLifeInsurance(int id)
//	{
//		String query = "insert into mixedinsurance (insurance_id) values ("+id+");";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void addCarInsurance(int id)
//	{
//		String query = "insert into carinsurance (insurance_id) values ("+id+");";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public void addFireInsurance(int id)
//	{
//		String query = "insert into fireinsurance (insurance_id) values ("+id+");";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public void addMedicalInsurance(int id)
//	{
//		String query = "insert into medicalinsurance (insurance_id) values ("+id+");";		
//		try {
//			super.update(query);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
