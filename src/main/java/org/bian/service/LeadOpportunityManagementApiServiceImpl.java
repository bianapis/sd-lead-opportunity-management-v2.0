/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class LeadOpportunityManagementApiServiceImpl implements LeadOpportunityManagementApiService {

	public SDLeadOpportunityManagementActivateOutputModel activate(SDLeadOpportunityManagementActivateInputModel request){
		return JsonReader.read("activate-SDLeadOpportunityManagementActivateOutputModel.json",new TypeReference<SDLeadOpportunityManagementActivateOutputModel>(){});
	}
	
	public SDLeadOpportunityManagementConfigureOutputModel configure(String sdReferenceId, SDLeadOpportunityManagementConfigureInputModel request){
		return JsonReader.read("configure-SDLeadOpportunityManagementConfigureOutputModel.json",new TypeReference<SDLeadOpportunityManagementConfigureOutputModel>(){});
	}
	
	public CRLeadOpportunityProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRLeadOpportunityProcedureControlInputModel request){
		return JsonReader.read("control-CRLeadOpportunityProcedureControlOutputModel.json",new TypeReference<CRLeadOpportunityProcedureControlOutputModel>(){});
	}
	
	public CRLeadOpportunityProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLeadOpportunityProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRLeadOpportunityProcedureExchangeOutputModel.json",new TypeReference<CRLeadOpportunityProcedureExchangeOutputModel>(){});
	}
	
	public BQDevelopmentExecuteOutputModel executeDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentExecuteInputModel request){
		return JsonReader.read("execute-BQDevelopmentExecuteOutputModel.json",new TypeReference<BQDevelopmentExecuteOutputModel>(){});
	}
	
	public SDLeadOpportunityManagementFeedbackOutputModel feedback(String sdReferenceId, SDLeadOpportunityManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDLeadOpportunityManagementFeedbackOutputModel.json",new TypeReference<SDLeadOpportunityManagementFeedbackOutputModel>(){});
	}
	
	public CRLeadOpportunityProcedureInitiateOutputModel initiate(String sdReferenceId, CRLeadOpportunityProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRLeadOpportunityProcedureInitiateOutputModel.json",new TypeReference<CRLeadOpportunityProcedureInitiateOutputModel>(){});
	}
	
	public BQDevelopmentInitiateOutputModel initiateDevelopment(String sdReferenceId, String crReferenceId, BQDevelopmentInitiateInputModel request){
		return JsonReader.read("initiate-BQDevelopmentInitiateOutputModel.json",new TypeReference<BQDevelopmentInitiateOutputModel>(){});
	}
	
	public BQDevelopmentRequestOutputModel requestDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentRequestInputModel request){
		return JsonReader.read("request-BQDevelopmentRequestOutputModel.json",new TypeReference<BQDevelopmentRequestOutputModel>(){});
	}
	
	public CRLeadOpportunityProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRLeadOpportunityProcedureRetrieveOutputModel.json",new TypeReference<CRLeadOpportunityProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQDevelopmentRetrieveOutputModel retrieveDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDevelopmentRetrieveOutputModel.json",new TypeReference<BQDevelopmentRetrieveOutputModel>(){});
	}
	
	public SDLeadOpportunityManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDLeadOpportunityManagementRetrieveOutputModel.json",new TypeReference<SDLeadOpportunityManagementRetrieveOutputModel>(){});
	}
	
	public CRLeadOpportunityProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLeadOpportunityProcedureUpdateInputModel request){
		return JsonReader.read("update-CRLeadOpportunityProcedureUpdateOutputModel.json",new TypeReference<CRLeadOpportunityProcedureUpdateOutputModel>(){});
	}
	
	public BQDevelopmentUpdateOutputModel updateDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentUpdateInputModel request){
		return JsonReader.read("update-BQDevelopmentUpdateOutputModel.json",new TypeReference<BQDevelopmentUpdateOutputModel>(){});
	}
	
}
