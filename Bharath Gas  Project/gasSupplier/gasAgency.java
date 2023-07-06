package gasSupplier;

public interface gasAgency {
    public String agencyName = "Bharat Gas";
    public int agencyCode = 1234;
    public int phnNumber = 969189806;

    default void agencyDisplay(){
        System.out.println("The agency name is:"+agencyName);
        System.out.println("The agency code is:"+agencyCode);
        System.out.println("The agency phone number is:"+phnNumber);
    }
}
