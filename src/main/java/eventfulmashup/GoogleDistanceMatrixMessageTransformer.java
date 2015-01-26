package eventfulmashup;

import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;
 
public class GoogleDistanceMatrixMessageTransformer extends AbstractMessageTransformer{
    /**
     * @param args
     */
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        Distance distance  = null;
        
        try {
        	JSONObject jsonObject = new JSONObject(message.getPayloadAsString());
        	distance = MessageFactory.distance(jsonObject);
        	
        	Event object = (Event)message.getProperty("eventVariable", PropertyScope.SESSION);
        	
        	DistanceInfo distanceInfo = new DistanceInfo();
        	Integer distanceMeters =distance.getDistanceMeters();  
        	distanceInfo.setDistanceMeters(distanceMeters);
        	distanceInfo.setDistance(distance.getDistance());
        	Integer durationSeconds=distance.getDurationSeconds();
        	distanceInfo.setDurationSeconds(durationSeconds);
        	distanceInfo.setDuration(distance.getDuration());
        	object.setDistanceInfo(distanceInfo);
        	
        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return distance;
    }
}