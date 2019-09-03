package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureControlOutputModel
 */
public class CRLeadOpportunityProcedureControlOutputModel   {
  private String leadOpportunityProcedureControlActionTaskReference = null;

  private Object leadOpportunityProcedureControlActionTaskRecord = null;

  private String leadOpportunityProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Lead Opportunity Procedure instance control processing service call 
   * @return leadOpportunityProcedureControlActionTaskReference
  **/

  public String getLeadOpportunityProcedureControlActionTaskReference() {
    return leadOpportunityProcedureControlActionTaskReference;
  }

  public void setLeadOpportunityProcedureControlActionTaskReference(String leadOpportunityProcedureControlActionTaskReference) {
    this.leadOpportunityProcedureControlActionTaskReference = leadOpportunityProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return leadOpportunityProcedureControlActionTaskRecord
  **/

  public Object getLeadOpportunityProcedureControlActionTaskRecord() {
    return leadOpportunityProcedureControlActionTaskRecord;
  }

  public void setLeadOpportunityProcedureControlActionTaskRecord(Object leadOpportunityProcedureControlActionTaskRecord) {
    this.leadOpportunityProcedureControlActionTaskRecord = leadOpportunityProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return leadOpportunityProcedureControlActionResponse
  **/

  public String getLeadOpportunityProcedureControlActionResponse() {
    return leadOpportunityProcedureControlActionResponse;
  }

  public void setLeadOpportunityProcedureControlActionResponse(String leadOpportunityProcedureControlActionResponse) {
    this.leadOpportunityProcedureControlActionResponse = leadOpportunityProcedureControlActionResponse;
  }


}

