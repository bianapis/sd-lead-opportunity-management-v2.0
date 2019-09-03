package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveOutputModelDevelopmentInstanceReport
 */
public class BQDevelopmentRetrieveOutputModelDevelopmentInstanceReport   {
  private Object developmentInstanceReportRecord = null;

  private String developmentInstanceReportType = null;

  private String developmentInstanceReportParameters = null;

  private Object developmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return developmentInstanceReportRecord
  **/

  public Object getDevelopmentInstanceReportRecord() {
    return developmentInstanceReportRecord;
  }

  public void setDevelopmentInstanceReportRecord(Object developmentInstanceReportRecord) {
    this.developmentInstanceReportRecord = developmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return developmentInstanceReportType
  **/

  public String getDevelopmentInstanceReportType() {
    return developmentInstanceReportType;
  }

  public void setDevelopmentInstanceReportType(String developmentInstanceReportType) {
    this.developmentInstanceReportType = developmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return developmentInstanceReportParameters
  **/

  public String getDevelopmentInstanceReportParameters() {
    return developmentInstanceReportParameters;
  }

  public void setDevelopmentInstanceReportParameters(String developmentInstanceReportParameters) {
    this.developmentInstanceReportParameters = developmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return developmentInstanceReport
  **/

  public Object getDevelopmentInstanceReport() {
    return developmentInstanceReport;
  }

  public void setDevelopmentInstanceReport(Object developmentInstanceReport) {
    this.developmentInstanceReport = developmentInstanceReport;
  }


}

