package com.spiritzone;


import com.Pages.SpiritZoneLoginPage;
import com.Pages.SpiritZoneSearch;
import com.Pages.SpiritSupport;
import com.Pages.SpiritZoneHomeAddress;
import com.Pages.SpiritZoneHomeOrder;
import com.Pages.SpiritZoneMyProfile;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.spiritzone.EntityRunner;

public class KeywordHelper extends Pojo {
	Pojo objpojo;
	TestScenarios TestScanerio;
	
	@SuppressWarnings({ "static-access", "deprecation" })
	public String CreateLoginSpiritLogin(String stepGroup) throws FilloException, InterruptedException {
		Recordset recordset = EntityRunner.getEntityObject("DT_LoginEntity", this,stepGroup);
		while (recordset.next()) {
			if (recordset.getField("Action").equals("add")) {
				this.setEntityRunner(recordset);
				SpiritZoneLoginPage login1 = new SpiritZoneLoginPage(this);
				login1.fillAndSubmitLoginDetails();
				this.setEntityRunner(recordset);
			}

		}
		return recordset.getField("Action").toString();
	}
	
	public String CreateHomeAddress(String stepGroup) throws FilloException 
	{
		Recordset recordset = EntityRunner.getEntityObject("DT_Address", this,stepGroup);
		while (recordset.next()) {
			if (recordset.getField("Action").equals("add")) {
				this.setEntityRunner(recordset);
				SpiritZoneHomeAddress login1 = new SpiritZoneHomeAddress(this);
				login1.fillAndSubmitHomeDetails();
				this.setEntityRunner(recordset);
			}

		}
		return recordset.getField("Action").toString();
	}
	
	
	public String CreateOrder(String stepGroup) throws FilloException, InterruptedException {
		Recordset recordset = EntityRunner.getEntityObject("DT_CreateOrder", this,stepGroup);
		while (recordset.next()) {
			if (recordset.getField("Action").equals("add")) {
				this.setEntityRunner(recordset);
				SpiritZoneHomeOrder login1 = new SpiritZoneHomeOrder(this);
				login1.fillAndSubmitHomeOrder();
				this.setEntityRunner(recordset);
			}

		}
		return recordset.getField("Action").toString();
	}
	
	
	public String SearchOrder(String stepGroup) throws FilloException , Exception{
		Recordset recordset = EntityRunner.getEntityObject("DT_SearchBar", this,stepGroup);
		while (recordset.next()) {
			if (recordset.getField("Action").equals("add")) {
				this.setEntityRunner(recordset);
				SpiritZoneSearch login1 = new SpiritZoneSearch(this);
				login1.fillAndSubmitSearchDetails();
				this.setEntityRunner(recordset);
			}

		}
		return recordset.getField("Action").toString();
	}
	
	
	public String Support(String stepGroup) throws FilloException {
		Recordset recordset = EntityRunner.getEntityObject("DT_Support", this,stepGroup);
		while (recordset.next()) {
			if (recordset.getField("Action").equals("add")) {
				this.setEntityRunner(recordset);		
				SpiritSupport obj = new SpiritSupport(this);
				obj.fillSupportModule();
				this.setEntityRunner(recordset);
			}

		}
		return recordset.getField("Action").toString();
	}
	
	
	public String MyProfile(String stepGroup) throws FilloException, InterruptedException {
		Recordset recordset = EntityRunner.getEntityObject("DT_MyProfile", this,stepGroup);
		while (recordset.next()) {
			if (recordset.getField("Action").equals("add")) {
				this.setEntityRunner(recordset);		
				SpiritZoneMyProfile obj = new SpiritZoneMyProfile(this);
				obj.FillMyProfileModules();
				this.setEntityRunner(recordset);
			}

		}
		return recordset.getField("Action").toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
