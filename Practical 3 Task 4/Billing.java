public class Billing {
    final static double TAX = 0.08;
    public static void main(String[] args)
    {
        double bill;
        bill = computeBill(12.00);
        System.out.println("The total billing of the photobook is $" + bill);
        bill = computeBill(24.00, 48);
        System.out.println("The total billing of the 48 photobooks is $" + bill);
        bill = computeBill(36.00, 6, 18);
        System.out.println("The total billing of the 18 photobooks is $" + bill + ". A $18 coupon value has been applied.");
    }
    public static double computeBill(double input)
    {
        double bill;
        bill = input + input * TAX;
        return bill;
    }
    public static double computeBill(double input, int quantity)
    {
        double bill;
        bill = input * quantity + (input * quantity) * TAX;
        return bill;
    }
    public static double computeBill(double input, int quantity, double coupon)
    {
        double bill = input * quantity;
        bill = bill - coupon;
        bill = bill + bill * TAX;
        return bill;
    }
}
