package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureExchangeInputModelLeadOpportunityProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureExchangeInputModel
 */
public class CRLeadOpportunityProcedureExchangeInputModel   {
  private String leadOpportunityManagementServicingSessionReference = null;

  private String leadOpportunityProcedureInstanceReference = null;

  private Object leadOpportunityProcedureExchangeActionTaskRecord = null;

  private CRLeadOpportunityProcedureExchangeInputModelLeadOpportunityProcedureExchangeActionRequest leadOpportunityProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return leadOpportunityManagementServicingSessionReference
  **/

  public String getLeadOpportunityManagementServicingSessionReference() {
    return leadOpportunityManagementServicingSessionReference;
  }

  public void setLeadOpportunityManagementServicingSessionReference(String leadOpportunityManagementServicingSessionReference) {
    this.leadOpportunityManagementServicingSessionReference = leadOpportunityManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Lead Opportunity Procedure instance 
   * @return leadOpportunityProcedureInstanceReference
  **/

  public String getLeadOpportunityProcedureInstanceReference() {
    return leadOpportunityProcedureInstanceReference;
  }

  public void setLeadOpportunityProcedureInstanceReference(String leadOpportunityProcedureInstanceReference) {
    this.leadOpportunityProcedureInstanceReference = leadOpportunityProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return leadOpportunityProcedureExchangeActionTaskRecord
  **/

  public Object getLeadOpportunityProcedureExchangeActionTaskRecord() {
    return leadOpportunityProcedureExchangeActionTaskRecord;
  }

  public void setLeadOpportunityProcedureExchangeActionTaskRecord(Object leadOpportunityProcedureExchangeActionTaskRecord) {
    this.leadOpportunityProcedureExchangeActionTaskRecord = leadOpportunityProcedureExchangeActionTaskRecord;
  }


  /**
   * Get leadOpportunityProcedureExchangeActionRequest
   * @return leadOpportunityProcedureExchangeActionRequest
  **/

  public CRLeadOpportunityProcedureExchangeInputModelLeadOpportunityProcedureExchangeActionRequest getLeadOpportunityProcedureExchangeActionRequest() {
    return leadOpportunityProcedureExchangeActionRequest;
  }

  public void setLeadOpportunityProcedureExchangeActionRequest(CRLeadOpportunityProcedureExchangeInputModelLeadOpportunityProcedureExchangeActionRequest leadOpportunityProcedureExchangeActionRequest) {
    this.leadOpportunityProcedureExchangeActionRequest = leadOpportunityProcedureExchangeActionRequest;
  }


}

