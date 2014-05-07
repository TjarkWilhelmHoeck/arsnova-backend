package de.thm.arsnova.entities;

public class ServiceDescription {
	private String id;
	private String name;
	private String dialogUrl;
	private boolean allowLecturer = true;

	public ServiceDescription(String id, String name, String dialogUrl) {
		this.id = id;
		this.name = name;
		this.dialogUrl = dialogUrl;
	}

	public ServiceDescription(String id, String name, String dialogUrl, boolean allowLecturer) {
		this.id = id;
		this.name = name;
		this.dialogUrl = dialogUrl;
		this.allowLecturer = allowLecturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDialogUrl() {
		return dialogUrl;
	}

	public void setDialogUrl(String dialogUrl) {
		this.dialogUrl = dialogUrl;
	}

	public boolean isAllowLecturer() {
		return allowLecturer;
	}

	public void setAllowLecturer(boolean allowLecturer) {
		this.allowLecturer = allowLecturer;
	}
}
