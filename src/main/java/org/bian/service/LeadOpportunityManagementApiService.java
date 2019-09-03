/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface LeadOpportunityManagementApiService {

	SDLeadOpportunityManagementActivateOutputModel activate(SDLeadOpportunityManagementActivateInputModel request);
	
	SDLeadOpportunityManagementConfigureOutputModel configure(String sdReferenceId, SDLeadOpportunityManagementConfigureInputModel request);
	
	CRLeadOpportunityProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRLeadOpportunityProcedureControlInputModel request);
	
	CRLeadOpportunityProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRLeadOpportunityProcedureExchangeInputModel request);
	
	BQDevelopmentExecuteOutputModel executeDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentExecuteInputModel request);
	
	SDLeadOpportunityManagementFeedbackOutputModel feedback(String sdReferenceId, SDLeadOpportunityManagementFeedbackInputModel request);
	
	CRLeadOpportunityProcedureInitiateOutputModel initiate(String sdReferenceId, CRLeadOpportunityProcedureInitiateInputModel request);
	
	BQDevelopmentInitiateOutputModel initiateDevelopment(String sdReferenceId, String crReferenceId, BQDevelopmentInitiateInputModel request);
	
	BQDevelopmentRequestOutputModel requestDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentRequestInputModel request);
	
	CRLeadOpportunityProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQDevelopmentRetrieveOutputModel retrieveDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDLeadOpportunityManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRLeadOpportunityProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRLeadOpportunityProcedureUpdateInputModel request);
	
	BQDevelopmentUpdateOutputModel updateDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentUpdateInputModel request);
	
}
