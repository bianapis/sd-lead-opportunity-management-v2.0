package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceAnalysis;
import org.bian.dto.CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureRetrieveInputModel
 */
public class CRLeadOpportunityProcedureRetrieveInputModel   {
  private Object leadOpportunityProcedureRetrieveActionTaskRecord = null;

  private String leadOpportunityProcedureRetrieveActionRequest = null;

  private CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceReportRecord leadOpportunityProcedureInstanceReportRecord = null;

  private CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceAnalysis leadOpportunityProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return leadOpportunityProcedureRetrieveActionRequest
  **/

  public String getLeadOpportunityProcedureRetrieveActionRequest() {
    return leadOpportunityProcedureRetrieveActionRequest;
  }

  public void setLeadOpportunityProcedureRetrieveActionRequest(String leadOpportunityProcedureRetrieveActionRequest) {
    this.leadOpportunityProcedureRetrieveActionRequest = leadOpportunityProcedureRetrieveActionRequest;
  }


  /**
   * Get leadOpportunityProcedureInstanceReportRecord
   * @return leadOpportunityProcedureInstanceReportRecord
  **/

  public CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceReportRecord getLeadOpportunityProcedureInstanceReportRecord() {
    return leadOpportunityProcedureInstanceReportRecord;
  }

  public void setLeadOpportunityProcedureInstanceReportRecord(CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceReportRecord leadOpportunityProcedureInstanceReportRecord) {
    this.leadOpportunityProcedureInstanceReportRecord = leadOpportunityProcedureInstanceReportRecord;
  }


  /**
   * Get leadOpportunityProcedureInstanceAnalysis
   * @return leadOpportunityProcedureInstanceAnalysis
  **/

  public CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceAnalysis getLeadOpportunityProcedureInstanceAnalysis() {
    return leadOpportunityProcedureInstanceAnalysis;
  }

  public void setLeadOpportunityProcedureInstanceAnalysis(CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceAnalysis leadOpportunityProcedureInstanceAnalysis) {
    this.leadOpportunityProcedureInstanceAnalysis = leadOpportunityProcedureInstanceAnalysis;
  }


}

