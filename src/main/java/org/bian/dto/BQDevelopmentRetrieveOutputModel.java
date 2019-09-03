package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentRetrieveOutputModelDevelopmentInstanceAnalysis;
import org.bian.dto.BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecord;
import org.bian.dto.BQDevelopmentRetrieveOutputModelDevelopmentInstanceReport;
import org.bian.dto.BQDevelopmentRetrieveOutputModelLeadOpportunityProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveOutputModel
 */
public class BQDevelopmentRetrieveOutputModel   {
  private BQDevelopmentRetrieveOutputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord = null;

  private BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecord developmentInstanceRecord = null;

  private String developmentRetrieveActionTaskReference = null;

  private Object developmentRetrieveActionTaskRecord = null;

  private String developmentRetrieveActionResponse = null;

  private BQDevelopmentRetrieveOutputModelDevelopmentInstanceReport developmentInstanceReport = null;

  private BQDevelopmentRetrieveOutputModelDevelopmentInstanceAnalysis developmentInstanceAnalysis = null;


  /**
   * Get leadOpportunityProcedureInstanceRecord
   * @return leadOpportunityProcedureInstanceRecord
  **/

  public BQDevelopmentRetrieveOutputModelLeadOpportunityProcedureInstanceRecord getLeadOpportunityProcedureInstanceRecord() {
    return leadOpportunityProcedureInstanceRecord;
  }

  public void setLeadOpportunityProcedureInstanceRecord(BQDevelopmentRetrieveOutputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord) {
    this.leadOpportunityProcedureInstanceRecord = leadOpportunityProcedureInstanceRecord;
  }


  /**
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Development instance retrieve service call 
   * @return developmentRetrieveActionTaskReference
  **/

  public String getDevelopmentRetrieveActionTaskReference() {
    return developmentRetrieveActionTaskReference;
  }

  public void setDevelopmentRetrieveActionTaskReference(String developmentRetrieveActionTaskReference) {
    this.developmentRetrieveActionTaskReference = developmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return developmentRetrieveActionTaskRecord
  **/

  public Object getDevelopmentRetrieveActionTaskRecord() {
    return developmentRetrieveActionTaskRecord;
  }

  public void setDevelopmentRetrieveActionTaskRecord(Object developmentRetrieveActionTaskRecord) {
    this.developmentRetrieveActionTaskRecord = developmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return developmentRetrieveActionResponse
  **/

  public String getDevelopmentRetrieveActionResponse() {
    return developmentRetrieveActionResponse;
  }

  public void setDevelopmentRetrieveActionResponse(String developmentRetrieveActionResponse) {
    this.developmentRetrieveActionResponse = developmentRetrieveActionResponse;
  }


  /**
   * Get developmentInstanceReport
   * @return developmentInstanceReport
  **/

  public BQDevelopmentRetrieveOutputModelDevelopmentInstanceReport getDevelopmentInstanceReport() {
    return developmentInstanceReport;
  }

  public void setDevelopmentInstanceReport(BQDevelopmentRetrieveOutputModelDevelopmentInstanceReport developmentInstanceReport) {
    this.developmentInstanceReport = developmentInstanceReport;
  }


  /**
   * Get developmentInstanceAnalysis
   * @return developmentInstanceAnalysis
  **/

  public BQDevelopmentRetrieveOutputModelDevelopmentInstanceAnalysis getDevelopmentInstanceAnalysis() {
    return developmentInstanceAnalysis;
  }

  public void setDevelopmentInstanceAnalysis(BQDevelopmentRetrieveOutputModelDevelopmentInstanceAnalysis developmentInstanceAnalysis) {
    this.developmentInstanceAnalysis = developmentInstanceAnalysis;
  }


}

