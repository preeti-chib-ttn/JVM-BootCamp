/*Q6. Implement a banking system using java.
Create 3 subclass of Bank : SBI, BOI, ICICI
Classes should have attributes like Name,
headofficeAddress, chairmanName, branchCount, fdInterestRate,
personalLoanInterestRate, homeLoanInterestRate.
All 3 should have the following methods:
1. add getters and setters for the fields
2. print details of every bank (override toString)
*/

package IntrotoJava.Day1.Question6;

class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public Bank(String name){
        this.name=name;
    }

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Bank Name: " + name + "\n" +
                "Head Office Address: " + headOfficeAddress + "\n" +
                "Chairman: " + chairmanName + "\n" +
                "Branch Count: " + branchCount + "\n" +
                "FD Interest Rate: " + fdInterestRate + "%\n" +
                "Personal Loan Interest Rate: " + personalLoanInterestRate + "%\n" +
                "Home Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

class SBI extends Bank {
    public SBI(){
        super("State Bank of India");
    }
    public SBI(String headOfficeAddress, String chairmanName, int branchCount,
               double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super("State Bank of India", headOfficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

class BOI extends Bank {
    public BOI(){
        super("Bank of India");
    }

    public BOI(String headOfficeAddress, String chairmanName, int branchCount,
               double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super("Bank of India", headOfficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

class ICICI extends Bank {
    public ICICI(){
        super("ICICI Bank");
    }
    public ICICI(String headOfficeAddress, String chairmanName, int branchCount,
                 double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        super("ICICI Bank", headOfficeAddress, chairmanName, branchCount,
                fdInterestRate, personalLoanInterestRate, homeLoanInterestRate);
    }
}

