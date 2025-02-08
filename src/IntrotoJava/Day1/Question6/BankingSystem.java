package IntrotoJava.Day1.Question6;

public class BankingSystem {
    public static void main(String[] args) {
        SBI sbi = new SBI("Noida", "Ram",
                1500, 6.5, 10.5, 8.0);
        BOI boi = new BOI("Noida", "Seeta",
                1200, 6.0, 11.0, 8.2);
        ICICI icici = new ICICI();

        icici.setHeadOfficeAddress("Noida");
        icici.setChairmanName("Shyam");
        icici.setBranchCount(1300);
        icici.setFdInterestRate(7.0);
        icici.setPersonalLoanInterestRate(9.5);
        icici.setHomeLoanInterestRate(8.5);

        System.out.println("SBI Bank Details");
        System.out.println(sbi);

        System.out.println("BOI Bank Details");
        System.out.println(boi);

        System.out.println("ICICI Bank Details");
        System.out.println(icici);
    }
}