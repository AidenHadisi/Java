package edu.orangecoastcollege.shadsi.cs170.ic12;

public class CreditCard
{
    // Never store the full credit card number in the database
    private String mCardHolder;
    private String mCardNumber;
    private String mExpirationDate;
    private CardNetwork mNetwork;
    // Use enum as your data type
    private int mSecurityCode;
   
    public CreditCard (CardNetwork network, String cardHolder, String cardNumber, String expirationDate, int securityCode)
    {
        mNetwork = network;
        mCardHolder = cardHolder;
        mCardNumber = cardNumber;
        mExpirationDate = expirationDate;
        mSecurityCode = securityCode;
        
    }
    public String toString ()
    {
        return "Credit Card [" + mNetwork + ", " + mCardNumber.substring(12) + ", " + mCardHolder + ", " + mExpirationDate;
    }
    public CardNetwork getNetwork()
    {
        return mNetwork;
    }
    public String getCardNumber()
    {
        return mCardNumber;
    }
    public String getExpirationDate()
    {
        return mExpirationDate;
    }
    public String getCardHolder()
    {
        return mCardHolder;
    }
    public int getSecurityCode()
    {
        return mSecurityCode;
    }
    public void setCardHolder(String CardHolder)
    {
        mCardHolder = CardHolder;
    }
}
