package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentExecuteInputModelDevelopmentInstanceRecord;
import org.bian.dto.BQDevelopmentExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDevelopmentExecuteInputModel
 */
public class BQDevelopmentExecuteInputModel   {
  private String leadOpportunityProcedureInstanceReference = null;

  private String developmentInstanceReference = null;

  private BQDevelopmentExecuteInputModelDevelopmentInstanceRecord developmentInstanceRecord = null;

  private Object developmentExecuteActionTaskRecord = null;

  private BQDevelopmentExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Lead Opportunity Procedure instance 
   * @return leadOpportunityProcedureInstanceReference
  **/

  public String getLeadOpportunityProcedureInstanceReference() {
    return leadOpportunityProcedureInstanceReference;
  }

  public void setLeadOpportunityProcedureInstanceReference(String leadOpportunityProcedureInstanceReference) {
    this.leadOpportunityProcedureInstanceReference = leadOpportunityProcedureInstanceReference;
  }


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
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentExecuteInputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentExecuteInputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQDevelopmentExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQDevelopmentExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

