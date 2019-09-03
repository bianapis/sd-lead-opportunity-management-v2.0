package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentRequestOutputModelDevelopmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRequestOutputModel
 */
public class BQDevelopmentRequestOutputModel   {
  private BQDevelopmentRequestOutputModelDevelopmentInstanceRecord developmentInstanceRecord = null;

  private String developmentRequestActionTaskReference = null;

  private Object developmentRequestActionTaskRecord = null;

  private String developmentRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentRequestOutputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentRequestOutputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Development instance request service call 
   * @return developmentRequestActionTaskReference
  **/

  public String getDevelopmentRequestActionTaskReference() {
    return developmentRequestActionTaskReference;
  }

  public void setDevelopmentRequestActionTaskReference(String developmentRequestActionTaskReference) {
    this.developmentRequestActionTaskReference = developmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return developmentRequestActionTaskRecord
  **/

  public Object getDevelopmentRequestActionTaskRecord() {
    return developmentRequestActionTaskRecord;
  }

  public void setDevelopmentRequestActionTaskRecord(Object developmentRequestActionTaskRecord) {
    this.developmentRequestActionTaskRecord = developmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Development service request record 
   * @return developmentRequestRecordReference
  **/

  public String getDevelopmentRequestRecordReference() {
    return developmentRequestRecordReference;
  }

  public void setDevelopmentRequestRecordReference(String developmentRequestRecordReference) {
    this.developmentRequestRecordReference = developmentRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

