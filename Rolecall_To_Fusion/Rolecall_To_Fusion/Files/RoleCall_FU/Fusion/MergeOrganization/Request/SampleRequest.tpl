<?xml version="1.0" encoding="ISO-8859-1" standalone="no" ?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:app1="http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/" xmlns:ns3="http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/" xmlns:app2="http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/applicationModule/types/" xmlns:ns1="http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/applicationModule/types/" xmlns:ns2="http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/" xmlns:app3="http://xmlns.oracle.com/apps/cdm/foundation/parties/partyService/" xmlns:msdata="urn:schemas-microsoft-com:xml-msdata" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<soap:Body>
		<app2:mergeOrganization>
			<app2:organizationParty>
				<app1:PartyId><!$MG_PartyId></app1:PartyId>
				<app1:PartySite>
					<ns2:PartySiteNumber><!$MG_PartySiteNumber></ns2:PartySiteNumber>
					<ns2:PartySiteName><!$MG_PartySiteName></ns2:PartySiteName>
					<ns2:LocationId><!$MG_LocationId></ns2:LocationId>
					<ns2:CreatedByModule><!$MG_CreatedByModule></ns2:CreatedByModule>
					<ns2:PartySiteUse>
						<ns2:SiteUseType><!$MG_SiteUseType></ns2:SiteUseType>
						<ns2:CreatedByModule><!$MG_CreatedByModule1></ns2:CreatedByModule>
					</ns2:PartySiteUse>
				</app1:PartySite>
			</app2:organizationParty>
		</app2:mergeOrganization>
	</soap:Body>
</soap:Envelope>