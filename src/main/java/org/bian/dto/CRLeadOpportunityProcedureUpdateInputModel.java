package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureUpdateInputModel
 */
public class CRLeadOpportunityProcedureUpdateInputModel   {
  private String leadOpportunityManagementServicingSessionReference = null;

  private String leadOpportunityProcedureInstanceReference = null;

  private CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord = null;

  private Object leadOpportunityProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get leadOpportunityProcedureInstanceRecord
   * @return leadOpportunityProcedureInstanceRecord
  **/

  public CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord getLeadOpportunityProcedureInstanceRecord() {
    return leadOpportunityProcedureInstanceRecord;
  }

  public void setLeadOpportunityProcedureInstanceRecord(CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord) {
    this.leadOpportunityProcedureInstanceRecord = leadOpportunityProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return leadOpportunityProcedureUpdateActionTaskRecord
  **/

  public Object getLeadOpportunityProcedureUpdateActionTaskRecord() {
    return leadOpportunityProcedureUpdateActionTaskRecord;
  }

  public void setLeadOpportunityProcedureUpdateActionTaskRecord(Object leadOpportunityProcedureUpdateActionTaskRecord) {
    this.leadOpportunityProcedureUpdateActionTaskRecord = leadOpportunityProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

