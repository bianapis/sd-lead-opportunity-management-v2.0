package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceAnalysis
 */
public class CRLeadOpportunityProcedureRetrieveOutputModelLeadOpportunityProcedureInstanceAnalysis   {
  private String leadOpportunityProcedureInstanceAnalysisData = null;

  private String leadOpportunityProcedureInstanceAnalysisReportType = null;

  private Object leadOpportunityProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return leadOpportunityProcedureInstanceAnalysisData
  **/

  public String getLeadOpportunityProcedureInstanceAnalysisData() {
    return leadOpportunityProcedureInstanceAnalysisData;
  }

  public void setLeadOpportunityProcedureInstanceAnalysisData(String leadOpportunityProcedureInstanceAnalysisData) {
    this.leadOpportunityProcedureInstanceAnalysisData = leadOpportunityProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return leadOpportunityProcedureInstanceAnalysisReportType
  **/

  public String getLeadOpportunityProcedureInstanceAnalysisReportType() {
    return leadOpportunityProcedureInstanceAnalysisReportType;
  }

  public void setLeadOpportunityProcedureInstanceAnalysisReportType(String leadOpportunityProcedureInstanceAnalysisReportType) {
    this.leadOpportunityProcedureInstanceAnalysisReportType = leadOpportunityProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return leadOpportunityProcedureInstanceAnalysisReport
  **/

  public Object getLeadOpportunityProcedureInstanceAnalysisReport() {
    return leadOpportunityProcedureInstanceAnalysisReport;
  }

  public void setLeadOpportunityProcedureInstanceAnalysisReport(Object leadOpportunityProcedureInstanceAnalysisReport) {
    this.leadOpportunityProcedureInstanceAnalysisReport = leadOpportunityProcedureInstanceAnalysisReport;
  }


}

