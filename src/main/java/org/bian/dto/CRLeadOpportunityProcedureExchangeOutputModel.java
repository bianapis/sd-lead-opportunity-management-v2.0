package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureExchangeOutputModel
 */
public class CRLeadOpportunityProcedureExchangeOutputModel   {
  private String leadOpportunityProcedureExchangeActionTaskReference = null;

  private Object leadOpportunityProcedureExchangeActionTaskRecord = null;

  private String leadOpportunityProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Lead Opportunity Procedure instance exchange service call 
   * @return leadOpportunityProcedureExchangeActionTaskReference
  **/

  public String getLeadOpportunityProcedureExchangeActionTaskReference() {
    return leadOpportunityProcedureExchangeActionTaskReference;
  }

  public void setLeadOpportunityProcedureExchangeActionTaskReference(String leadOpportunityProcedureExchangeActionTaskReference) {
    this.leadOpportunityProcedureExchangeActionTaskReference = leadOpportunityProcedureExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return leadOpportunityProcedureExchangeActionResponse
  **/

  public String getLeadOpportunityProcedureExchangeActionResponse() {
    return leadOpportunityProcedureExchangeActionResponse;
  }

  public void setLeadOpportunityProcedureExchangeActionResponse(String leadOpportunityProcedureExchangeActionResponse) {
    this.leadOpportunityProcedureExchangeActionResponse = leadOpportunityProcedureExchangeActionResponse;
  }


}

