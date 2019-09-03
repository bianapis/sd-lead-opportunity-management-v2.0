package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureInitiateOutputModelLeadOpportunityProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureInitiateOutputModel
 */
public class CRLeadOpportunityProcedureInitiateOutputModel   {
  private String leadOpportunityProcedureInstanceReference = null;

  private String leadOpportunityProcedureInitiateActionReference = null;

  private Object leadOpportunityProcedureInitiateActionRecord = null;

  private String leadOpportunityProcedureInstanceStatus = null;

  private CRLeadOpportunityProcedureInitiateOutputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return leadOpportunityProcedureInitiateActionReference
  **/

  public String getLeadOpportunityProcedureInitiateActionReference() {
    return leadOpportunityProcedureInitiateActionReference;
  }

  public void setLeadOpportunityProcedureInitiateActionReference(String leadOpportunityProcedureInitiateActionReference) {
    this.leadOpportunityProcedureInitiateActionReference = leadOpportunityProcedureInitiateActionReference;
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

  public CRLeadOpportunityProcedureInitiateOutputModelLeadOpportunityProcedureInstanceRecord getLeadOpportunityProcedureInstanceRecord() {
    return leadOpportunityProcedureInstanceRecord;
  }

  public void setLeadOpportunityProcedureInstanceRecord(CRLeadOpportunityProcedureInitiateOutputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord) {
    this.leadOpportunityProcedureInstanceRecord = leadOpportunityProcedureInstanceRecord;
  }


}

