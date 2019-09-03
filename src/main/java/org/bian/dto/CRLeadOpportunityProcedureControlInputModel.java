package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureControlInputModelLeadOpportunityProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureControlInputModel
 */
public class CRLeadOpportunityProcedureControlInputModel   {
  private String leadOpportunityManagementServicingSessionReference = null;

  private String leadOpportunityProcedureInstanceReference = null;

  private Object leadOpportunityProcedureControlActionTaskRecord = null;

  private CRLeadOpportunityProcedureControlInputModelLeadOpportunityProcedureControlActionRequest leadOpportunityProcedureControlActionRequest = null;


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
   * Get leadOpportunityProcedureControlActionRequest
   * @return leadOpportunityProcedureControlActionRequest
  **/

  public CRLeadOpportunityProcedureControlInputModelLeadOpportunityProcedureControlActionRequest getLeadOpportunityProcedureControlActionRequest() {
    return leadOpportunityProcedureControlActionRequest;
  }

  public void setLeadOpportunityProcedureControlActionRequest(CRLeadOpportunityProcedureControlInputModelLeadOpportunityProcedureControlActionRequest leadOpportunityProcedureControlActionRequest) {
    this.leadOpportunityProcedureControlActionRequest = leadOpportunityProcedureControlActionRequest;
  }


}

