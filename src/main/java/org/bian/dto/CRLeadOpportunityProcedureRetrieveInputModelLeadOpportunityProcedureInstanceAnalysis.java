package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceAnalysis
 */
public class CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceAnalysis   {
  private String leadOpportunityProcedureInstanceAnalysisReference = null;

  private String leadOpportunityProcedureInstanceAnalysisReportType = null;

  private String leadOpportunityProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return leadOpportunityProcedureInstanceAnalysisReference
  **/

  public String getLeadOpportunityProcedureInstanceAnalysisReference() {
    return leadOpportunityProcedureInstanceAnalysisReference;
  }

  public void setLeadOpportunityProcedureInstanceAnalysisReference(String leadOpportunityProcedureInstanceAnalysisReference) {
    this.leadOpportunityProcedureInstanceAnalysisReference = leadOpportunityProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return leadOpportunityProcedureInstanceAnalysisParameters
  **/

  public String getLeadOpportunityProcedureInstanceAnalysisParameters() {
    return leadOpportunityProcedureInstanceAnalysisParameters;
  }

  public void setLeadOpportunityProcedureInstanceAnalysisParameters(String leadOpportunityProcedureInstanceAnalysisParameters) {
    this.leadOpportunityProcedureInstanceAnalysisParameters = leadOpportunityProcedureInstanceAnalysisParameters;
  }


}

