package Datevalid;

public class Date {
	int day,month,year;
	
	// checking if leap year or not 
	public boolean isLeapYear(){
		if(year%4==0 && year%100!=0) {
			return true;
		}
		else if(year%100==0 && year%400==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	//setting the date
	public void setDate(int day,int month,int year) {
		
		if(year>3100 || year<1970) {
			this.year=2026;
		}
		else {
			this.year=year;
		}
		
		if(month>12 || month <0) {
			this.month=1;
		}
		else {
			this.month=month;
		}
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			if(day<1 || day>31) {
				this.day=1;
			}
			else {
				this.day=day;
			}
		}
		else if(month==4 || month==6 || month==9 || month==11 ) {
			if(day<1 || day>30) {
				this.day=1;
			}
			else {
				this.day=day;
			}
		}
		else{
			if(isLeapYear()) {
				if(day<1 || day>29) {
					this.day=1;
				}
				else {
					this.day=day;
				}
			}
			else {
				if(day<1 || day>28) {
					this.day=1;
				}
				else {
					this.day=day;
				}
			}
		}
		
	}
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	int countdays=0;
	int countmonths =1;
	int countyear=0;
	
	//checking leap year when adding the days
	public boolean isLeapYearAdd(){
		if(countyear%4==0 && countyear%100!=0) {
			return true;
		}
		else if(countyear%100==0 && countyear%400==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	//adding days
	public void addDay(int adddays) {
		countyear = year;
		countdays +=  adddays+day;
		//counting the days if leap year
		if(isLeapYear()){
			for(int i =1; i < month; i++) {  
				if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
					countdays +=31;
				}
				else if(i==4 || i==6 || i==9 || i==11) {
					countdays +=30;
				}
				else {
					countdays +=29;
				}
			}
		}
		//counting the day if not leap year
		else{
			for(int i =1; i < month; i++) {   
				if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
					countdays +=31;
				}
				else if(i==4 || i==6 || i==9 || i==11) {
					countdays +=30;
				}
				else {
					countdays +=28;
				}
			}
		}
		
		//adding days   
		while(countdays >0) {
			// adding days  if leap year
			if(isLeapYearAdd()) {
				
				if(countmonths==1 || countmonths==3 || countmonths==5 || countmonths==7 || countmonths==8 || countmonths==10) {
					if(countdays>31) {
						countdays -=31;
						countmonths++;
					}
					else {
						day =countdays;
						countdays =0;
					}
				}
				
				else if(countmonths==4 || countmonths==6 || countmonths==9 ||countmonths==11) {
					if(countdays>30) {
						countdays -=30;
						countmonths++;
					}
					else {
						day =countdays;
						countdays=0;
					}	
				}
				
				else if(countmonths ==2) {
					if(countdays>29) {
						countdays -=29;	
						countmonths ++;
					}
					else {
						day = countdays;
						countdays = 0;
					}
				}
				
				else if(countmonths ==12) {
					if(countdays>31) {
						countdays -=31;	
						countmonths =1;
						countyear++;
					}
					else {
						day = countdays;
						countdays = 0;
					}
				}
			}
			// adding days is not leap year
           if(!isLeapYearAdd()) {
				
				if(countmonths==1 || countmonths==3 || countmonths==5 || countmonths==7 || countmonths==8 || countmonths==10) {
					if(countdays>31) {
						countdays -=31;
						countmonths++;
					}
					else {
						day =countdays;
						countdays =0;
					}
				}
				
				else if(countmonths==4 || countmonths==6 || countmonths==9 ||countmonths==11) {
					if(countdays>30) {
						countdays -=30;
						countmonths++;
					}
					else {
						day =countdays;
						countdays=0;
					}	
				}
				
				else if(countmonths ==2) {
					if(countdays>28) {
						countdays -=28;	
						countmonths ++;
					}
					else {
						day = countdays;
						countdays = 0;
					}
				}
				
				else if(countmonths ==12) {
					if(countdays>31) {
						countdays -=31;	
						countmonths =1;
						countyear++;
					}
					else {
						day = countdays;
						countdays = 0;
					}
				}
			}
		}
		
		// updating the month and year
		month = countmonths;
		year = countyear; 
			
	}
	// adding months
	public void addMonth(int addmonths) {
		 for (int i = 1; i <= addmonths; i++) {
		        if (month == 12) {
		            month = 1;
		            year++;
		        } else {
		            month++;
		        }

		        int maxDays;

		        if (month == 2) {
		            if (isLeapYear()) {
		                maxDays = 29;
		            } else {
		                maxDays = 28;
		            }
		        } 
		        else if (month == 4 || month == 6 || month == 9 || month == 11) {
		            maxDays = 30;
		        } 
		        else {
		            maxDays = 31;
		        }

		        if (day > maxDays) {
		            day = maxDays;
		        }
		    }
		
	}
	// adding new year
	public void addYear(int addyear) {
	    int newYear = year + addyear; 
	    
	    if (month == 2 && day == 29) {
	        if (!(newYear % 4 == 0 && newYear % 100 != 0) || (newYear % 400 != 0 && newYear % 100 == 0)) {
	            day = 28; 
	        }
	    }

	    year = newYear;
	}
	//comparing to dates
	public int compareTo(Date d) {
	    if (this.year != d.year) {
	        return this.year - d.year;
	    }
	    if (this.month != d.month) {
	        return this.month - d.month;
	    }
	    return this.day - d.day;
	}
}