package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureInitiateInputModelLeadOpportunityProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureInitiateInputModel
 */
public class CRLeadOpportunityProcedureInitiateInputModel   {
  private String leadOpportunityManagementServicingSessionReference = null;

  private Object leadOpportunityProcedureInitiateActionRecord = null;

  private String leadOpportunityProcedureInstanceStatus = null;

  private CRLeadOpportunityProcedureInitiateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return leadOpportunityProcedureInitiateActionRecord
  **/

  public Object getLeadOpportunityProcedureInitiateActionRecord() {
    return leadOpportunityProcedureInitiateActionRecord;
  }

  public void setLeadOpportunityProcedureInitiateActionRecord(Object leadOpportunityProcedureInitiateActionRecord) {
    this.leadOpportunityProcedureInitiateActionRecord = leadOpportunityProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Lead Opportunity Procedure instance (e.g. initialised, pending, active) 
   * @return leadOpportunityProcedureInstanceStatus
  **/

  public String getLeadOpportunityProcedureInstanceStatus() {
    return leadOpportunityProcedureInstanceStatus;
  }

  public void setLeadOpportunityProcedureInstanceStatus(String leadOpportunityProcedureInstanceStatus) {
    this.leadOpportunityProcedureInstanceStatus = leadOpportunityProcedureInstanceStatus;
  }


  /**
   * Get leadOpportunityProcedureInstanceRecord
   * @return leadOpportunityProcedureInstanceRecord
  **/

  public CRLeadOpportunityProcedureInitiateInputModelLeadOpportunityProcedureInstanceRecord getLeadOpportunityProcedureInstanceRecord() {
    return leadOpportunityProcedureInstanceRecord;
  }

  public void setLeadOpportunityProcedureInstanceRecord(CRLeadOpportunityProcedureInitiateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord) {
    this.leadOpportunityProcedureInstanceRecord = leadOpportunityProcedureInstanceRecord;
  }


}

