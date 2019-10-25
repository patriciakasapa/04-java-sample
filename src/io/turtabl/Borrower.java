package io.turtabl;

public class Borrower {

    public io.turtabl.BorrowerType get;
    private String name;
private Integer AccountNumber;
private BorrowerType BorrowerType;

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", BorrowerType=" + BorrowerType +
                '}';
    }

    public Borrower(String name, int accountNumber, BorrowerType type) {
        this.name = name;
        AccountNumber = accountNumber;
        BorrowerType = type;
    }

    public io.turtabl.BorrowerType getGet() {
        return get;
    }

    public void setGet(io.turtabl.BorrowerType get) {
        this.get = get;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        AccountNumber = accountNumber;
    }

    public io.turtabl.BorrowerType getBorrowerType() {
        return BorrowerType;
    }

    public void setBorrowerType(io.turtabl.BorrowerType borrowerType) {
        BorrowerType = borrowerType;
    }
}
