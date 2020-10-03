package com.harry.datalayer;

import java.time.LocalDate;



public class Todo {

    
    private String title;
    private String username;
    private String description;
    private LocalDate date;
    private boolean status;

    protected Todo() {

    }

   
    public Todo(String title, String username, String description, LocalDate date, boolean isDone) {
        super();
        this.title = title;
        this.username = username;
        this.description = description;
        this.date = date;
        this.status = isDone;
    }

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return date;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.date = date;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Todo [title=" + title + ", username=" + username + ", description=" + description + ", date=" + date
				+ ", status=" + status + "]";
	}

	

	
}