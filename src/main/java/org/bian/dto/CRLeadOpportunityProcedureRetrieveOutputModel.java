package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceAnalysis;
import org.bian.dto.CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceRecord;
import org.bian.dto.CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureRetrieveOutputModel
 */
public class CRLeadOpportunityProcedureRetrieveOutputModel   {
  private CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord = null;

  private String leadOpportunityProcedureRetrieveActionTaskReference = null;

  private Object leadOpportunityProcedureRetrieveActionTaskRecord = null;

  private String leadOpportunityProcedureRetrieveActionResponse = null;

  private CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceReportRecord leadOpportunityProcedureInstanceReportRecord = null;

  private CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceAnalysis leadOpportunityProcedureInstanceAnalysis = null;


  /**
   * Get leadOpportunityProcedureInstanceRecord
   * @return leadOpportunityProcedureInstanceRecord
  **/

  public CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceRecord getLeadOpportunityProcedureInstanceRecord() {
    return leadOpportunityProcedureInstanceRecord;
  }

  public void setLeadOpportunityProcedureInstanceRecord(CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord) {
    this.leadOpportunityProcedureInstanceRecord = leadOpportunityProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Lead Opportunity Procedure instance retrieve service call 
   * @return leadOpportunityProcedureRetrieveActionTaskReference
  **/

  public String getLeadOpportunityProcedureRetrieveActionTaskReference() {
    return leadOpportunityProcedureRetrieveActionTaskReference;
  }

  public void setLeadOpportunityProcedureRetrieveActionTaskReference(String leadOpportunityProcedureRetrieveActionTaskReference) {
    this.leadOpportunityProcedureRetrieveActionTaskReference = leadOpportunityProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return leadOpportunityProcedureRetrieveActionTaskRecord
  **/

  public Object getLeadOpportunityProcedureRetrieveActionTaskRecord() {
    return leadOpportunityProcedureRetrieveActionTaskRecord;
  }

  public void setLeadOpportunityProcedureRetrieveActionTaskRecord(Object leadOpportunityProcedureRetrieveActionTaskRecord) {
    this.leadOpportunityProcedureRetrieveActionTaskRecord = leadOpportunityProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return leadOpportunityProcedureRetrieveActionResponse
  **/

  public String getLeadOpportunityProcedureRetrieveActionResponse() {
    return leadOpportunityProcedureRetrieveActionResponse;
  }

  public void setLeadOpportunityProcedureRetrieveActionResponse(String leadOpportunityProcedureRetrieveActionResponse) {
    this.leadOpportunityProcedureRetrieveActionResponse = leadOpportunityProcedureRetrieveActionResponse;
  }


  /**
   * Get leadOpportunityProcedureInstanceReportRecord
   * @return leadOpportunityProcedureInstanceReportRecord
  **/

  public CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceReportRecord getLeadOpportunityProcedureInstanceReportRecord() {
    return leadOpportunityProcedureInstanceReportRecord;
  }

  public void setLeadOpportunityProcedureInstanceReportRecord(CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceReportRecord leadOpportunityProcedureInstanceReportRecord) {
    this.leadOpportunityProcedureInstanceReportRecord = leadOpportunityProcedureInstanceReportRecord;
  }


  /**
   * Get leadOpportunityProcedureInstanceAnalysis
   * @return leadOpportunityProcedureInstanceAnalysis
  **/

  public CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceAnalysis getLeadOpportunityProcedureInstanceAnalysis() {
    return leadOpportunityProcedureInstanceAnalysis;
  }

  public void setLeadOpportunityProcedureInstanceAnalysis(CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceAnalysis leadOpportunityProcedureInstanceAnalysis) {
    this.leadOpportunityProcedureInstanceAnalysis = leadOpportunityProcedureInstanceAnalysis;
  }


}

