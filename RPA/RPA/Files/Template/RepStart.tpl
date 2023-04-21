<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:pub="http://xmlns.oracle.com/oxp/service/PublicReportService">
   <soap:Header/>
   <soap:Body>
      <pub:runReport>
         <pub:reportRequest>
            <pub:attributeFormat>xml</pub:attributeFormat>
           
            <pub:flattenXML>false</pub:flattenXML>
		
            <pub:parameterNameValues>
                <!$MGREPEAT>
               <pub:item>
                  <pub:name><!$MG_pub:name></pub:name>
                  <pub:values>
				     
                     <pub:item><!$MG_pub:item></pub:item>
                     
                  </pub:values>
               </pub:item>
             <!$MGENDREPEAT> 