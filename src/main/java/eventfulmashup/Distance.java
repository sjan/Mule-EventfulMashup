package eventfulmashup;

/*
 * {
   "destination_addresses" : [ "277 Brooklyn Avenue, Brooklyn, NY 11213, USA" ],
   "origin_addresses" : [ "1500-1598 Moravian Street, Philadelphia, PA 19102, USA" ],
   "rows" : [
      {
         "elements" : [
            {
               "distance" : {
                  "text" : "157 km",
                  "value" : 156676
               },
               "duration" : {
                  "text" : "1 hour 59 mins",
                  "value" : 7137
               },
               "status" : "OK"
            }
         ]
      }
   ],
   "status" : "OK"
}
 * 
 * */
public class Distance {
	private String origin;
	private String destination;
	private String type;
	private String distance;
	private Integer distanceMeters;
	private String duration;
	private Integer durationSeconds;
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public Integer getDistanceMeters() {
		return distanceMeters;
	}
	public void setDistanceMeters(Integer distanceMeters) {
		this.distanceMeters = distanceMeters;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getDurationSeconds() {
		return durationSeconds;
	}
	public void setDurationSeconds(Integer durationSeconds) {
		this.durationSeconds = durationSeconds;
	}
	@Override
	public String toString() {
		return "Distance [origin=" + origin + ", destination=" + destination
				+ ", type=" + type + ", distance=" + distance
				+ ", distanceMeters=" + distanceMeters + ", duration="
				+ duration + ", durationSeconds=" + durationSeconds + "]";
	}
	
	
	
}
