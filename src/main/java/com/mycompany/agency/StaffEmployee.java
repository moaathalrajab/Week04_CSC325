package com.mycompany.agency;



public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    //  Returns information about a staff employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this staff employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        return payRate;
    }
}
