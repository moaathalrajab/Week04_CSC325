package com.mycompany.agency;




public class Intern extends StaffMember
{
    //-----------------------------------------------------------------
    //  Constructor: Sets up this intern using the specified
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }

    //-----------------------------------------------------------------
    //  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }
}
