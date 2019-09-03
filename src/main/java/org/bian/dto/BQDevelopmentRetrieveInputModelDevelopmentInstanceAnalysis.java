package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveInputModelDevelopmentInstanceAnalysis
 */
public class BQDevelopmentRetrieveInputModelDevelopmentInstanceAnalysis   {
  private String developmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return developmentInstanceAnalysisReference
  **/

  public String getDevelopmentInstanceAnalysisReference() {
    return developmentInstanceAnalysisReference;
  }

  public void setDevelopmentInstanceAnalysisReference(String developmentInstanceAnalysisReference) {
    this.developmentInstanceAnalysisReference = developmentInstanceAnalysisReference;
  }


}

