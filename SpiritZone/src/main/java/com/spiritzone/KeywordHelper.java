package com.spiritzone;

import com.Pages.DashboardPage;
import com.Pages.SpiritZoneLoginPage;
import com.Pages.SpiritZoneSearch;
import com.Pages.NseQuotePage;
import com.Pages.OrderStatusPage;
import com.Pages.PlaceOrderPage;
import com.Pages.SpiritSupport;
import com.Pages.SpiritZoneHomeAddress;
import com.Pages.SpiritZoneHomeOrder;
import com.Pages.MyProfile;
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
	
	
	public String MyProfile(String stepGroup) throws FilloException {
		Recordset recordset = EntityRunner.getEntityObject("DT_MyProfile", this,stepGroup);
		while (recordset.next()) {
			if (recordset.getField("Action").equals("add")) {
				this.setEntityRunner(recordset);		
				MyProfile obj = new MyProfile(this);
				obj.FillMyProfileModules();
				this.setEntityRunner(recordset);
			}

		}
		return recordset.getField("Action").toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public String EditLoginNSEMobile(String stepGroup) throws FilloException {
//
//		Recordset recordset = EntityRunner.getEntityObject("DT_LoginEntity", this,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("edit")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling EditLoginNSEMobile");
//				SpiritZoneLoginPage login1 = new SpiritZoneLoginPage(this);
//				login1.fillAndSubmitLoginDetails();
//				this.setEntityRunner(recordset);
//			}
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String VerifyLoginNSEMobile(String stepGroup) throws FilloException {
//
//		Recordset recordset = EntityRunner.getEntityObject("DT_LoginEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("verify")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling VerifyLoginNSEMobile");
//				SpiritZoneLoginPage login1 = new SpiritZoneLoginPage(this);
//				login1.fillAndSubmitLoginDetails();
//				this.setEntityRunner(recordset);
//			}
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String CreateDashboardMobile(String stepGroup) throws FilloException {
//
//		Recordset recordset = EntityRunner.getEntityObject("DT_DashboardEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("add")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreateDashboardMobile");
//				DashboardPage login1 = new DashboardPage(this);
//				login1.fillAndSubmitDashboardPageDetails();
//				this.setEntityRunner(recordset);
//			}
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String EditDashboardMobile(String stepGroup) throws FilloException {
//
//		Recordset recordset = EntityRunner.getEntityObject("DT_DashboardEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("edit")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling EditDashboardMobile");
//				DashboardPage login1 = new DashboardPage(this);
//				login1.fillAndSubmitDashboardPageDetails();
//				this.setEntityRunner(recordset);
//			}
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String VerifyDashboardMobile(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_DashboardEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("add")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling VerifyDashboardMobile");
//				DashboardPage login1 = new DashboardPage(this);
//				login1.fillAndSubmitDashboardPageDetails();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String CreateQuoteMobile(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_QuoteEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("add")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreateQuoteMobile");
//				NseQuotePage login1 = new NseQuotePage(this);
//				login1.fillAndSubmitQuoteDetails();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String EditQuoteMobile(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_QuoteEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("edit")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreateQuoteMobile");
//				NseQuotePage login1 = new NseQuotePage(this);
//				login1.fillAndSubmitQuoteDetails();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String VerifyQuoteMobile(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_QuoteEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("Verify")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreateQuoteMobile");
//				NseQuotePage login1 = new NseQuotePage(this);
//				login1.fillAndSubmitQuoteDetails();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String CreatePlaceOrder(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_PlaceOrderEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("add")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreatePlaceOrder");
//				PlaceOrderPage login1 = new PlaceOrderPage(this);
//				login1.fillAndSubmitPlaceOrderDetails();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String EditPlaceOrder(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_PlaceOrderEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("edit")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreatePlaceOrder");
//				PlaceOrderPage login1 = new PlaceOrderPage(this);
//				login1.fillAndSubmitPlaceOrderDetails();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String VerifyPlaceOrder(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_PlaceOrderEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("verify")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreatePlaceOrder");
//				PlaceOrderPage login1 = new PlaceOrderPage(this);
//				login1.fillAndSubmitPlaceOrderDetails();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String CreateOrderStatus(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_OrderStatusEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("add")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreatePlaceOrder");
//				OrderStatusPage login1 = new OrderStatusPage(this);
//				login1.fillAndSubmitOrderStatusPage();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String EditOrderStatus(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_OrderStatusEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("edit")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreatePlaceOrder");
//				OrderStatusPage login1 = new OrderStatusPage(this);
//				login1.fillAndSubmitOrderStatusPage();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
//
//	public String VerifyOrderStatus(String stepGroup) throws FilloException {
//		Recordset recordset = EntityRunner.getEntityObject("DT_OrderStatusEntity", this ,stepGroup);
//		while (recordset.next()) {
//			if (recordset.getField("Action").equals("verify")) {
//				this.setEntityRunner(recordset);
//				System.out.println("calling CreatePlaceOrder");
//				OrderStatusPage login1 = new OrderStatusPage(this);
//				login1.fillAndSubmitOrderStatusPage();
//				this.setEntityRunner(recordset);
//
//			}
//
//		}
//		return recordset.getField("Action").toString();
//	}
}
