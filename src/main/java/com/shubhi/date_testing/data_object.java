package com.shubhi.date_testing;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class data_object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.Date start_date = new Date();
	private java.util.Date end_date = new Date();

	public data_object() {
	}

	public java.util.Date getStart_date() {
	    SimpleDateFormat DateFor = new SimpleDateFormat("dd-MMM-yyyy");
	    Date date = new Date();
	    try{
        date = DateFor.parse(this.start_date.toString());
        }catch (ParseException e) {e.printStackTrace();}
        
		return date;
	}

	public void setStart_date(java.util.Date start_date) {
		SimpleDateFormat DateFor = new SimpleDateFormat("dd-MMM-yyyy");
	    Date date = new Date();
	    try{
        date = DateFor.parse(start_date.toString());
        }catch (ParseException e) {e.printStackTrace();}
        
		this.start_date = date;
	}

	public java.util.Date getEnd_date() {
		SimpleDateFormat DateFor = new SimpleDateFormat("dd-MMM-yyyy");
	    Date date = new Date();
	    try{
        date = DateFor.parse(this.end_date.toString());
        }catch (ParseException e) {e.printStackTrace();}
        
		return date;
	}

	public void setEnd_date(java.util.Date end_date) {
	    SimpleDateFormat DateFor = new SimpleDateFormat("dd-MMM-yyyy");
	    Date date = new Date();
	    try{
        date = DateFor.parse(end_date.toString());
        }catch (ParseException e) {e.printStackTrace();}
        
		this.end_date = date;
	}

	public data_object(java.util.Date start_date, java.util.Date end_date) {
		this.start_date = start_date;
		this.end_date = end_date;
	}

}