package com.stanlytango.android.rounddate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dates {

    private static Dates staticDaysObj;
    private Date eventDate, tillDate;

    // PRIVATE CONSTRUCTOR--------------//
    private Dates (){					//
        eventDate = new Date();         //
        tillDate = new Date();			//
    }// --------------------------------//


    // METHOD TO GET INSTANCE---------------//
    public static Dates getInstance(){      //
        if(staticDaysObj == null){          //
            staticDaysObj = new Dates();    //
        }	return staticDaysObj;           //
    }//-------------------------------------//

    public void setEventDate(Date eD){
        eventDate = eD;
    }

    public void setTillDate(Date tD){
        tillDate = tD;
    }

    public Date getEventDate(){
        return eventDate;
    }

    public Date getTillDate(){
        return tillDate;
    }

    public int getDays (){
        Calendar calE = Calendar.getInstance();
        calE.setTime(eventDate);

        Calendar calT = Calendar.getInstance();
        calT.setTime(tillDate);

        long difference = calT.getTimeInMillis()-calE.getTimeInMillis();
        int days = (int) TimeUnit.MILLISECONDS.toDays(difference);

        return days;
    }

    public int getDays (Date evD, Date tillD){
        this.setEventDate(evD);
        this.setTillDate(tillD);
        Calendar calE = Calendar.getInstance();
        calE.setTime(eventDate);
        Calendar calT = Calendar.getInstance();
        calT.setTime(tillDate);
        long difference = calT.getTimeInMillis()-calE.getTimeInMillis();
        int days = (int) TimeUnit.MILLISECONDS.toDays(difference);
        return days;
    }
}




