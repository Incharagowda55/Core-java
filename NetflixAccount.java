class NetflixAccount {
    private String userName;
    private String email;
    private String password;
    private String planType;  
    private int profileCount;  
    private boolean isUltraHD; 
    private String phoneNumber;

    // Getters and Setters
    public String getUserName() { 
	return userName; 
	}
    public void setUserName(String userName)
	{ this.userName = userName; 
	}

    public String getEmail() 
	{ return email; 
	}
    public void setEmail(String email) { 
	this.email = email;
	}

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getPlanType() { 
	return planType; 
	}
    public void setPlanType(String planType) {
		this.planType = planType;
		}

    public int getProfileCount() {
		return profileCount; 
		}
    public void setProfileCount(int profileCount) 
	{ this.profileCount = profileCount;
	}

    public boolean isUltraHD() { 
	return isUltraHD; }
    public void setUltraHD(boolean isUltraHD) 
	{ this.isUltraHD = isUltraHD; }

    public String getPhoneNumber()
	{ return phoneNumber; 
	}
    public void setPhoneNumber(String phoneNumber) 
	{ this.phoneNumber = phoneNumber; 
	}
}