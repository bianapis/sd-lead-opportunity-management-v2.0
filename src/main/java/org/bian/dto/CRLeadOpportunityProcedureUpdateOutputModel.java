package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureUpdateOutputModel
 */
public class CRLeadOpportunityProcedureUpdateOutputModel   {
  private CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord = null;

  private String leadOpportunityProcedureUpdateActionTaskReference = null;

  private Object leadOpportunityProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get leadOpportunityProcedureInstanceRecord
   * @return leadOpportunityProcedureInstanceRecord
  **/

  public CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord getLeadOpportunityProcedureInstanceRecord() {
    return leadOpportunityProcedureInstanceRecord;
  }

  public void setLeadOpportunityProcedureInstanceRecord(CRLeadOpportunityProcedureUpdateInputModelLeadOpportunityProcedureInstanceRecord leadOpportunityProcedureInstanceRecord) {
    this.leadOpportunityProcedureInstanceRecord = leadOpportunityProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return leadOpportunityProcedureUpdateActionTaskReference
  **/

  public String getLeadOpportunityProcedureUpdateActionTaskReference() {
    return leadOpportunityProcedureUpdateActionTaskReference;
  }

  public void setLeadOpportunityProcedureUpdateActionTaskReference(String leadOpportunityProcedureUpdateActionTaskReference) {
    this.leadOpportunityProcedureUpdateActionTaskReference = leadOpportunityProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return leadOpportunityProcedureUpdateActionTaskRecord
  **/

  public Object getLeadOpportunityProcedureUpdateActionTaskRecord() {
    return leadOpportunityProcedureUpdateActionTaskRecord;
  }

  public void setLeadOpportunityProcedureUpdateActionTaskRecord(Object leadOpportunityProcedureUpdateActionTaskRecord) {
    this.leadOpportunityProcedureUpdateActionTaskRecord = leadOpportunityProcedureUpdateActionTaskRecord;
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

