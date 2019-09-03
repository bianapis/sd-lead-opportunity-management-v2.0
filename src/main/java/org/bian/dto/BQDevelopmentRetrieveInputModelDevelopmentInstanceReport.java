package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveInputModelDevelopmentInstanceReport
 */
public class BQDevelopmentRetrieveInputModelDevelopmentInstanceReport   {
  private String developmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return developmentInstanceReportReference
  **/

  public String getDevelopmentInstanceReportReference() {
    return developmentInstanceReportReference;
  }

  public void setDevelopmentInstanceReportReference(String developmentInstanceReportReference) {
    this.developmentInstanceReportReference = developmentInstanceReportReference;
  }


}

