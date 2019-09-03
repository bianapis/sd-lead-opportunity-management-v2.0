package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentInitiateOutputModelDevelopmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentInitiateOutputModel
 */
public class BQDevelopmentInitiateOutputModel   {
  private String developmentInstanceReference = null;

  private String developmentInitiateActionReference = null;

  private Object developmentInitiateActionRecord = null;

  private String developmentInstanceStatus = null;

  private BQDevelopmentInitiateOutputModelDevelopmentInstanceRecord developmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Development instance 
   * @return developmentInstanceReference
  **/

  public String getDevelopmentInstanceReference() {
    return developmentInstanceReference;
  }

  public void setDevelopmentInstanceReference(String developmentInstanceReference) {
    this.developmentInstanceReference = developmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return developmentInitiateActionReference
  **/

  public String getDevelopmentInitiateActionReference() {
    return developmentInitiateActionReference;
  }

  public void setDevelopmentInitiateActionReference(String developmentInitiateActionReference) {
    this.developmentInitiateActionReference = developmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return developmentInitiateActionRecord
  **/

  public Object getDevelopmentInitiateActionRecord() {
    return developmentInitiateActionRecord;
  }

  public void setDevelopmentInitiateActionRecord(Object developmentInitiateActionRecord) {
    this.developmentInitiateActionRecord = developmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Development instance (e.g. initialised, pending, active) 
   * @return developmentInstanceStatus
  **/

  public String getDevelopmentInstanceStatus() {
    return developmentInstanceStatus;
  }

  public void setDevelopmentInstanceStatus(String developmentInstanceStatus) {
    this.developmentInstanceStatus = developmentInstanceStatus;
  }


  /**
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentInitiateOutputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentInitiateOutputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


}

