package connectivity.ws.operations;

import java.io.IOException;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class RestHTTPClient {

	
	public JSONObject CallingRestConnection(String url) throws IOException   {
	
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		  JSONObject data_obj = null;

		try {
			System.out.println("URL:"+url);
			HttpGet request = new HttpGet(url);
			CloseableHttpResponse response = httpClient.execute(request);
		
			try {

			    
				System.out.println(response.getStatusLine().getStatusCode());   
				System.out.println(response.getStatusLine().getReasonPhrase()); 
				System.out.println(response.getStatusLine().toString());       
				
				String result=null;
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					result = EntityUtils.toString(entity);
					System.out.println(result);
				}

			     System.out.println("result:"+result);
			     try {
			    	    JSONParser parse = new JSONParser();
		                data_obj = (JSONObject) parse.parse(result);
                        System.out.println("data_obj:"+data_obj);
			     }
			     catch(Exception e) {
			    	 System.out.println("Exception are:"+e);
			     }
              


			}
			catch(Exception e) {
				System.out.println("Exception:"+e.getMessage());
			}
			finally {
				response.close();
			}
		} catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}

		finally {
			httpClient.close();
		}
		return data_obj;


	}
}


