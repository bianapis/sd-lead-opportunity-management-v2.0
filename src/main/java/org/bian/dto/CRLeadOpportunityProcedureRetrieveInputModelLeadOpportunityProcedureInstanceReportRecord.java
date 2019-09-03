package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceReportRecord
 */
public class CRLeadOpportunityProcedureRetrieveInputModelLeadOpportunityProcedureInstanceReportRecord   {
  private String leadOpportunityProcedureInstanceReportReference = null;

  private String leadOpportunityProcedureInstanceReportType = null;

  private String leadOpportunityProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return leadOpportunityProcedureInstanceReportReference
  **/

  public String getLeadOpportunityProcedureInstanceReportReference() {
    return leadOpportunityProcedureInstanceReportReference;
  }

  public void setLeadOpportunityProcedureInstanceReportReference(String leadOpportunityProcedureInstanceReportReference) {
    this.leadOpportunityProcedureInstanceReportReference = leadOpportunityProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return leadOpportunityProcedureInstanceReportParameters
  **/

  public String getLeadOpportunityProcedureInstanceReportParameters() {
    return leadOpportunityProcedureInstanceReportParameters;
  }

  public void setLeadOpportunityProcedureInstanceReportParameters(String leadOpportunityProcedureInstanceReportParameters) {
    this.leadOpportunityProcedureInstanceReportParameters = leadOpportunityProcedureInstanceReportParameters;
  }


}

