package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRLeadOpportunityProcedureInitiateInputModelLeadOpportunityProcedureInstanceRecord
 */
public class CRLeadOpportunityProcedureInitiateInputModelLeadOpportunityProcedureInstanceRecord   {
  private String customerReference = null;

  private String customerCampaignReference = null;

  private String customerCampaignType = null;

  private String customerCampaignVersionNumber = null;

  private String productServiceType = null;

  private String productInstanceReference = null;

  private String employeeBusinessUnitReference = null;

  private String leadOpportunityDescription = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer campaign generating the lead (if the opportunity is generated by a campaign) 
   * @return customerCampaignReference
  **/

  public String getCustomerCampaignReference() {
    return customerCampaignReference;
  }

  public void setCustomerCampaignReference(String customerCampaignReference) {
    this.customerCampaignReference = customerCampaignReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of campaign (e.g. cross-sell, up-sell, retention) 
   * @return customerCampaignType
  **/

  public String getCustomerCampaignType() {
    return customerCampaignType;
  }

  public void setCustomerCampaignType(String customerCampaignType) {
    this.customerCampaignType = customerCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version number of the campaign (used to track campaign impact) 
   * @return customerCampaignVersionNumber
  **/

  public String getCustomerCampaignVersionNumber() {
    return customerCampaignVersionNumber;
  }

  public void setCustomerCampaignVersionNumber(String customerCampaignVersionNumber) {
    this.customerCampaignVersionNumber = customerCampaignVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of product or service identified in the Lead Opportunity 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a specific product instance if the lead is an up-sell to an existing product agreement 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employees involved in capturing the Lead Opportunity 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Narrative/description of the opportunity if available 
   * @return leadOpportunityDescription
  **/

  public String getLeadOpportunityDescription() {
    return leadOpportunityDescription;
  }

  public void setLeadOpportunityDescription(String leadOpportunityDescription) {
    this.leadOpportunityDescription = leadOpportunityDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Date and time and the location the Lead Opportunity was captured 
   * @return dateTimeLocation
  **/

  public String getDateTimeLocation() {
    return dateTimeLocation;
  }

  public void setDateTimeLocation(String dateTimeLocation) {
    this.dateTimeLocation = dateTimeLocation;
  }


}

