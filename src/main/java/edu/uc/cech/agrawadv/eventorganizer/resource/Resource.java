package edu.uc.cech.agrawadv.eventorganizer.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resource")
public class Resource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int resourceId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	public Resource() {}

	public Resource(int resourceId, String title, String description) {
		this.resourceId = resourceId;
		this.title = title;
		this.description = description;
	}

	public int getResourceId() {
		return resourceId;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + ", title=" + title + ", description=" + description + "]";
	}
}
