package eventfulmashup;

import java.util.ArrayList;
import java.util.List;


import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
 
public class EventfulMessageTransformer extends AbstractMessageTransformer{
    /**
     * @param args
     */
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        List<Event> test = new ArrayList<Event>();
        
        try {
        	JSONObject object = new JSONObject(message.getPayloadAsString());
        	JSONArray array = object.getJSONObject("events").getJSONArray("event");
        	
				System.out.println("message transformation for ");
			
				for(int i=0;i<array.length();i++) {
					JSONObject jsonObject = array.getJSONObject(i);
					Event e = MessageFactory.event(jsonObject);
					test.add(e);
				}
				
            } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return test;
    }
}