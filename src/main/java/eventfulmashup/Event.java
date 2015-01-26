package eventfulmashup;

import java.util.Date;

public class Event {
	private String eventId;
	private String title;
	private String latitude;
	private String longitude;
	private String description;
	private Date date;
	private String url;
	private String address;
	
	private DistanceInfo distanceInfo;
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public DistanceInfo getDistanceInfo() {
		return distanceInfo;
	}
	public void setDistanceInfo(DistanceInfo distanceInfo) {
		this.distanceInfo = distanceInfo;
	}
	
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
		
}
