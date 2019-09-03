package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveOutputModelDevelopmentInstanceAnalysis
 */
public class BQDevelopmentRetrieveOutputModelDevelopmentInstanceAnalysis   {
  private Object developmentInstanceAnalysisRecord = null;

  private String developmentInstanceAnalysisReportType = null;

  private String developmentInstanceAnalysisParameters = null;

  private Object developmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return developmentInstanceAnalysisRecord
  **/

  public Object getDevelopmentInstanceAnalysisRecord() {
    return developmentInstanceAnalysisRecord;
  }

  public void setDevelopmentInstanceAnalysisRecord(Object developmentInstanceAnalysisRecord) {
    this.developmentInstanceAnalysisRecord = developmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return developmentInstanceAnalysisReportType
  **/

  public String getDevelopmentInstanceAnalysisReportType() {
    return developmentInstanceAnalysisReportType;
  }

  public void setDevelopmentInstanceAnalysisReportType(String developmentInstanceAnalysisReportType) {
    this.developmentInstanceAnalysisReportType = developmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return developmentInstanceAnalysisParameters
  **/

  public String getDevelopmentInstanceAnalysisParameters() {
    return developmentInstanceAnalysisParameters;
  }

  public void setDevelopmentInstanceAnalysisParameters(String developmentInstanceAnalysisParameters) {
    this.developmentInstanceAnalysisParameters = developmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return developmentInstanceAnalysisReport
  **/

  public Object getDevelopmentInstanceAnalysisReport() {
    return developmentInstanceAnalysisReport;
  }

  public void setDevelopmentInstanceAnalysisReport(Object developmentInstanceAnalysisReport) {
    this.developmentInstanceAnalysisReport = developmentInstanceAnalysisReport;
  }


}

