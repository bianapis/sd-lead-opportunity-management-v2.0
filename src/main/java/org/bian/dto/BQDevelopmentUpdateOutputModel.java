package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentUpdateInputModelDevelopmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentUpdateOutputModel
 */
public class BQDevelopmentUpdateOutputModel   {
  private BQDevelopmentUpdateInputModelDevelopmentInstanceRecord developmentInstanceRecord = null;

  private String developmentUpdateActionTaskReference = null;

  private Object developmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentUpdateInputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentUpdateInputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return developmentUpdateActionTaskReference
  **/

  public String getDevelopmentUpdateActionTaskReference() {
    return developmentUpdateActionTaskReference;
  }

  public void setDevelopmentUpdateActionTaskReference(String developmentUpdateActionTaskReference) {
    this.developmentUpdateActionTaskReference = developmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return developmentUpdateActionTaskRecord
  **/

  public Object getDevelopmentUpdateActionTaskRecord() {
    return developmentUpdateActionTaskRecord;
  }

  public void setDevelopmentUpdateActionTaskRecord(Object developmentUpdateActionTaskRecord) {
    this.developmentUpdateActionTaskRecord = developmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

