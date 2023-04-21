	"invoiceLines": [
	<!$MGREPEAT><!$MGIF_GT_than_one_rec_1>,<!$MGENDIF>
		{
			"LineNumber": <!$MG_LineNumber>,
			"Description": "<!$MG_Description>",
			"LineAmount": <!$MG_LineAmount>,
			"ShipToLocation": <!$MG_ShipToLocation>,
			"ProductFiscalClassification": <!$MG_ProductFiscalClassification>,
			"ProductFiscalClassificationCode": <!$MG_ProductFiscalClassificationCod>,
			"ProductFiscalClassificationType": <!$MG_ProductFiscalClassificationTyp>,
			"Withholding": <!$MG_Withholding>,
			"MultiperiodAccountingStartDate": <!$MG_MultiperiodAccountingStartDate>,
			"MultiperiodAccountingEndDate": <!$MG_MultiperiodAccountingEndDate>,
			"MultiperiodAccountingAccrualAccount": <!$MG_MultiperiodAccAccrualAccount>,
			"TrackAsAssetFlag": "<!$MG_TrackAsAssetFlag>",
			"TaxClassification": "<!$MG_TaxClassification>",
			"IntendedUse": "<!$MG_IntendedUse>",
			"IntendedUseCode": "<!$MG_IntendedUseCode>",
			"DistributionCombination": "<!$MG_DistributionCombination>",
			"invoiceDistributions": [
			  <!$MGREPEAT><!$MGIF_GT_than_one_rec_2>,<!$MGENDIF>
				{
					"DistributionLineNumber": <!$MG_DistributionLineNumber>,
					"DistributionLineType": "<!$MG_DistributionLineType>",
					"DistributionAmount": <!$MG_DistributionAmount>,
					"DistributionCombination": "<!$MG_DistributionCombination>"
				}
				<!$MGENDREPEAT>
			],
			"invoiceLineDff": [
			<!$MGREPEAT><!$MGIF_GT_than_one_rec_3>,<!$MGENDIF>
				{
					"assetStartDate": "<!$MG_assetStartDate>",
					"assetLife": "<!$MG_assetLife>"
				}
				<!$MGENDREPEAT>
			]
		}
		<!$MGENDREPEAT>
	]
