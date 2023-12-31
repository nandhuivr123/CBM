package connectivity.ws.operations;

/**
 * This class is generated automatically.  Manual edits must be outside of the tagged
 * areas (for example, "START:CLASS:..." and "END:CLASS:...").  Changes within the
 * tag areas will be overwritten when the web service operation is regenerated.
 * Last generated by Orchestration Designer at: 2023-JUL-07  03:45:36 PM
 */
public class AgentAPI extends com.avaya.sce.runtime.connectivity.restws.CallService {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

    /**
    * Constructor for AgentAPI.
    */
    public AgentAPI( com.avaya.sce.runtimecommon.IRuntimeSession mySession ) {
		//{{START:CLASS:CONSTRUCTOR
        super(mySession);

        //Web Service
        setServiceName("AgentAPI");
		setHttpMethod("GET");
		setOutputFormat("JSON");
		setUseQuery("true");
		setUseJavaObject("true");
		setUseBody("false");
        setTimeoutSecondsFromParameter("AgentAPI_1690783438466TimeoutSeconds");
        setEndpointFromParameter("AgentAPI_1690783438466EndpointUrl");
        setAuthenticationFromParameter("AgentAPI_1690783438466Authentication");
        setPasswordFromParameter("AgentAPI_1690783438466Password");
        setUsernameFromParameter("AgentAPI_1690783438466Username");
        setPreemptiveFromParameter("AgentAPI_1690783438466Preemptive");
        setSecurityFromParameter("AgentAPI_1690783438466Security");
        setPortFromParameter("AgentAPI_1690783438466Port");

        //Operation
        setOperation(new javax.xml.namespace.QName("", "AgentAPI_OP"));

        //Input parameters

        //Output parameters
        {
            com.avaya.sce.runtime.connectivity.restws.WsParam param1 = new com.avaya.sce.runtime.connectivity.restws.WsParam(new javax.xml.namespace.QName("fact"));
            param1.setWrapped(false);
            param1.setParamType(0);
            param1.setDDVariableName("CallBack:RestAPIResponse");
            addOutParameter(param1);
        }
		setMessageBody("");
        //}}END:CLASS:CONSTRUCTOR









































































































































































































































    }

}

