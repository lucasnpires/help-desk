package br.com.lucasnp.helpdesk.api.enums;

public enum StatusEnum {
	NEW,
	ATTRIBUTED,
	RESOLVED,
	ASSIGNED,
	APPROVED,
	DISAPPROVED,
	CLOSED;
	
	public static StatusEnum getStatus(String status) {
		switch (status) {
			case "New": return NEW;
			case "Attributed": return ATTRIBUTED;			
			case "Assigned": return ASSIGNED;	
			case "Resolved": return RESOLVED;
			case "Approved": return APPROVED;			
			case "Disapproved": return DISAPPROVED;
			case "Closed":	return CLOSED;
			default: return NEW;			
		}
	}
}
