package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentExecuteOutputModelDevelopmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentExecuteOutputModel
 */
public class BQDevelopmentExecuteOutputModel   {
  private BQDevelopmentExecuteOutputModelDevelopmentInstanceRecord developmentInstanceRecord = null;

  private String developmentExecuteActionTaskReference = null;

  private Object developmentExecuteActionTaskRecord = null;

  private String developmentExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentExecuteOutputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentExecuteOutputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Development instance execute service call 
   * @return developmentExecuteActionTaskReference
  **/

  public String getDevelopmentExecuteActionTaskReference() {
    return developmentExecuteActionTaskReference;
  }

  public void setDevelopmentExecuteActionTaskReference(String developmentExecuteActionTaskReference) {
    this.developmentExecuteActionTaskReference = developmentExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return developmentExecuteActionTaskRecord
  **/

  public Object getDevelopmentExecuteActionTaskRecord() {
    return developmentExecuteActionTaskRecord;
  }

  public void setDevelopmentExecuteActionTaskRecord(Object developmentExecuteActionTaskRecord) {
    this.developmentExecuteActionTaskRecord = developmentExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Development execute transaction/record 
   * @return developmentExecuteRecordReference
  **/

  public String getDevelopmentExecuteRecordReference() {
    return developmentExecuteRecordReference;
  }

  public void setDevelopmentExecuteRecordReference(String developmentExecuteRecordReference) {
    this.developmentExecuteRecordReference = developmentExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

