package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceReportRecord
 */
public class CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceReportRecord   {
  private String leadOpportunityProcedureInstanceReportData = null;

  private String leadOpportunityProcedureInstanceReportType = null;

  private Object leadOpportunityProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return leadOpportunityProcedureInstanceReportData
  **/

  public String getLeadOpportunityProcedureInstanceReportData() {
    return leadOpportunityProcedureInstanceReportData;
  }

  public void setLeadOpportunityProcedureInstanceReportData(String leadOpportunityProcedureInstanceReportData) {
    this.leadOpportunityProcedureInstanceReportData = leadOpportunityProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return leadOpportunityProcedureInstanceReportType
  **/

  public String getLeadOpportunityProcedureInstanceReportType() {
    return leadOpportunityProcedureInstanceReportType;
  }

  public void setLeadOpportunityProcedureInstanceReportType(String leadOpportunityProcedureInstanceReportType) {
    this.leadOpportunityProcedureInstanceReportType = leadOpportunityProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return leadOpportunityProcedureInstanceReport
  **/

  public Object getLeadOpportunityProcedureInstanceReport() {
    return leadOpportunityProcedureInstanceReport;
  }

  public void setLeadOpportunityProcedureInstanceReport(Object leadOpportunityProcedureInstanceReport) {
    this.leadOpportunityProcedureInstanceReport = leadOpportunityProcedureInstanceReport;
  }


}

