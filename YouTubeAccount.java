class YouTubeAccount {

    private String channelName;
    private String ownerName;
    private String email;
    private String password;
    private int subscribers;
    private String category;
    private String appName;


    public void setChannelName(String channelName)
	{ this.channelName = channelName; 
	}
    public String getChannelName() 
	{ return channelName;
	}

    public void setOwnerName(String ownerName) 
	{ this.ownerName = ownerName; 
	}
    public String getOwnerName() 
	{ return ownerName; 
	}

    public void setEmail(String email) {
		this.email = email;
		}
    public String getEmail() {
		return email;
		}

    public void setPassword(String password) {
		this.password = password; 
		}
    public String getPassword() {
		return password;
		}

    public void setSubscribers(int subscribers) { 
	this.subscribers = subscribers;
	}
    public int getSubscribers() { 
	return subscribers; 
	}

    public void setCategory(String category) { 
	this.category = category;
	}
    public String getCategory() { 
	return category; 
	}

    public void setAppName(String appName) { 
	this.appName = appName;
	}
    public String getAppName() {
		return appName;
		}
}