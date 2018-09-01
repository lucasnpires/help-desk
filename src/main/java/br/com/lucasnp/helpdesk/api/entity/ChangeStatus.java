package br.com.lucasnp.helpdesk.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.lucasnp.helpdesk.api.enums.StatusEnum;

@Document
public class ChangeStatus {
	@Id
	private String id;
	
	@DBRef
	private Ticket ticket;
	
	@DBRef
	private User userChanged;
	
	private Date dtChangedStatus;
	
	private StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserChanged() {
		return userChanged;
	}

	public void setUserChanged(User userChanged) {
		this.userChanged = userChanged;
	}

	public Date getDtChangedStatus() {
		return dtChangedStatus;
	}

	public void setDtChangedStatus(Date dtChangedStatus) {
		this.dtChangedStatus = dtChangedStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

}
