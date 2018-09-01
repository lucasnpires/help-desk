package br.com.lucasnp.helpdesk.api.enums;

public enum PriorityEnum {
	HIGH,
	NORMAL,
	LOW;
	
	public static PriorityEnum getPriority(String priority) {
		switch (priority) {
			case "High": return HIGH;
			case "Normal": return NORMAL;			
			case "Low":	return LOW;
			default: return LOW;			
		}
	}
}
