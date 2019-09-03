package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentInitiateInputModelDevelopmentInstanceRecord;
import org.bian.dto.BQDevelopmentInitiateInputModelLeadOpportunityProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentInitiateInputModel
 */
public class BQDevelopmentInitiateInputModel   {
  private BQDevelopmentInitiateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord = null;

  private String leadOpportunityProcedureInstanceReference = null;

  private Object developmentInitiateActionRecord = null;

  private BQDevelopmentInitiateInputModelDevelopmentInstanceRecord developmentInstanceRecord = null;


  /**
   * Get leadOpportunityProcedureInstanceRecord
   * @return leadOpportunityProcedureInstanceRecord
  **/

  public BQDevelopmentInitiateInputModelLeadOpportunityProcedureInstanceRecord getLeadOpportunityProcedureInstanceRecord() {
    return leadOpportunityProcedureInstanceRecord;
  }

  public void setLeadOpportunityProcedureInstanceRecord(BQDevelopmentInitiateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord) {
    this.leadOpportunityProcedureInstanceRecord = leadOpportunityProcedureInstanceRecord;
  }


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
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentInitiateInputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentInitiateInputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


}

