package eventfulmashup;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class MessageFactory {
	
	public static Event event(JSONObject object) { 
		Event ret = new Event();
		try {
			ret.setAddress(object.getString("venue_address"));
			//ret.setDate(object.getString("start_time"));
			ret.setTitle(object.getString("title"));
			ret.setLatitude(object.getString("latitude"));
			ret.setLongitude(object.getString("longitude"));
			ret.setUrl(object.getString("url"));
			ret.setEventId(object.getString("id"));
			ret.setDescription(object.getString("description"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public static Distance distance(JSONObject object) { 
		Distance ret = new Distance();
		try {
			ret.setDestination(object.getString("destination_addresses"));
			ret.setOrigin(object.getString("origin_addresses"));
			JSONArray rows = object.getJSONArray("rows");
			JSONObject elements = rows.getJSONObject(0); //
			JSONArray elementArray= elements.getJSONArray("elements");
			JSONObject object1 = elementArray.getJSONObject(0);
			
			JSONObject distance = object1.getJSONObject("distance");
			JSONObject duration= object1.getJSONObject("duration");
			
	
			ret.setDistanceMeters(Integer.parseInt(distance.getString("value")));
			ret.setDurationSeconds(Integer.parseInt(duration.getString("value")));
			
			ret.setDistance(distance.getString("text"));
			ret.setDuration(duration.getString("text"));

		} catch (JSONException e) {
			e.printStackTrace();
		}

		return ret;
	}
}
