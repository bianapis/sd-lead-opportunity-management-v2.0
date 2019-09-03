package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentRetrieveInputModelDevelopmentInstanceAnalysis;
import org.bian.dto.BQDevelopmentRetrieveInputModelDevelopmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveInputModel
 */
public class BQDevelopmentRetrieveInputModel   {
  private Object developmentRetrieveActionTaskRecord = null;

  private String developmentRetrieveActionRequest = null;

  private BQDevelopmentRetrieveInputModelDevelopmentInstanceReport developmentInstanceReport = null;

  private BQDevelopmentRetrieveInputModelDevelopmentInstanceAnalysis developmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return developmentRetrieveActionRequest
  **/

  public String getDevelopmentRetrieveActionRequest() {
    return developmentRetrieveActionRequest;
  }

  public void setDevelopmentRetrieveActionRequest(String developmentRetrieveActionRequest) {
    this.developmentRetrieveActionRequest = developmentRetrieveActionRequest;
  }


  /**
   * Get developmentInstanceReport
   * @return developmentInstanceReport
  **/

  public BQDevelopmentRetrieveInputModelDevelopmentInstanceReport getDevelopmentInstanceReport() {
    return developmentInstanceReport;
  }

  public void setDevelopmentInstanceReport(BQDevelopmentRetrieveInputModelDevelopmentInstanceReport developmentInstanceReport) {
    this.developmentInstanceReport = developmentInstanceReport;
  }


  /**
   * Get developmentInstanceAnalysis
   * @return developmentInstanceAnalysis
  **/

  public BQDevelopmentRetrieveInputModelDevelopmentInstanceAnalysis getDevelopmentInstanceAnalysis() {
    return developmentInstanceAnalysis;
  }

  public void setDevelopmentInstanceAnalysis(BQDevelopmentRetrieveInputModelDevelopmentInstanceAnalysis developmentInstanceAnalysis) {
    this.developmentInstanceAnalysis = developmentInstanceAnalysis;
  }


}

