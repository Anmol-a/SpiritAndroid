package com.spiritzone;

import java.util.ArrayList;

public class FunctionalKeyword extends KeywordHelper {

	protected void executeStep(MasterAutomationScriptSteps masterAutomationScriptSteps) throws Exception 
	{

		ArrayList<String> StepKeyword = masterAutomationScriptSteps.getStepKeyword();
		Integer stepNumber = masterAutomationScriptSteps.getExecutionSequence();

		ArrayList<String> StepGroup = masterAutomationScriptSteps.getStepGroup();

		int sizee = StepKeyword.size();
		for (int i = 0; i < sizee; i++) {
			int a =i+1;
			String string = StepKeyword.get(i);
			String stepGroup = StepGroup.get(i);
			this.getObjUtilities().logReporter("<B><u>StepNumber-</u>" + a
					+ "<i><Font Color = /'#00008B/'> Executing : " + string + " </Font></i></B>", true);

			switch (string) {

			case "CreateSpiritLogin":
				CreateLoginSpiritLogin(stepGroup);
				break;
					
			case "CreateApplicationHomeAddress":
				CreateHomeAddress(stepGroup);
				break;	
			
			case "CreateSearchLiquiorOrder":
				SearchOrder(stepGroup);
				break;	
				
			case "CreateCategory":
				CreateCategory(stepGroup);
				break;	
				
				
			case "CreateExclusiveReserve":
				CreateExclusiveReserve(stepGroup);
				break;	
				
				
			case "CreatePopularBrands":
				CreatePopularBrands(stepGroup);
				break;
				
				
			case "CreateCategoryProductDescription":
				ProductDescription(stepGroup);
				break;	
						
				
			case "CreateCategoryProductCartOrder":
				SpiritProductCartPage(stepGroup);
				break;	
			
			
			case "CreateSupport":
				Support(stepGroup);
				break;	
				
			case "CreateMyProfile":
				MyProfile(stepGroup);
				break;	
				
				

			}

		}
		stepNumber++;
	}

}
