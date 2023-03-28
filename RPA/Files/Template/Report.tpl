<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:pub="http://xmlns.oracle.com/oxp/service/PublicReportService">
   <soap:Header/>
   <soap:Body>
      <pub:runReport>
         <pub:reportRequest>
            <pub:attributeFormat>xml</pub:attributeFormat>
           
            <pub:flattenXML>false</pub:flattenXML>
			<!$MGREPEAT>
            <pub:parameterNameValues>
               <pub:item>
                  <pub:name><!$MG_pub:name></pub:name>
                  <pub:values>
				     <!$MGREPEAT>
                     <pub:item><!$MG_pub:item></pub:item>
                     <!$MGENDREPEAT>
                  </pub:values>
               </pub:item>
             <!$MGENDREPEAT>  
            </pub:parameterNameValues>
            <pub:reportAbsolutePath>/Custom/Integration/Reports/SIS GRN Attributes Report.xdo</pub:reportAbsolutePath>
           
            <pub:sizeOfDataChunkDownload>-1</pub:sizeOfDataChunkDownload>
         </pub:reportRequest>
      </pub:runReport>
   </soap:Body>
</soap:Envelope>