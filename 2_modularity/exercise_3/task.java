public class Loan {

    /** Method 'Loan'
        Meaning: Constructs a Loan object representing a loan for 'principal' amount running for 'loan_term' months. 
        Parameter principal: an integer specifing the amount of loan the customer wants to receive.
        Parameter loan_term: integer specifying the number of months, each on which the customer must pay back a monthly installment.
        Precondition: 'principal' > 0. 'principal' is an integer. 'loan_term' > 0 && 'loan_term' <= 300. 'loan_term' is an integer.
        Postcondition: Returns a Loan object representing a loan for 'principal' amount running for 'loan_term' months.
        No side effects.
        Exceptions: none.
    */
    public Loan(int principal, int loan_term) {}

    /** Method 'getMonthlyInstallment'
        Meaning: Returns the amount to pay each month.
        Postcondition: Returns the amount to pay each month.
        No side effects.
        Exceptions: none.
    */
    public static int getMonthlyInstallment(int principal, int loan_term) {}


   // principal & return type of getMonhlyInstallment could be plausably float

   // a loan_term of 0 probably doesn't make sense. 
   // if it does for Duckburg's business because for example they provide overnight loans to other banks as customers,
   // the constructor's precondition should be loosened to accept a loan_term of 0,
   // and they should consider using a Loan class with an abstract getInstallment method,
   // with a subclass for normal customer term loans, and one for overnight loans. 

}
