import java.util.Scanner;

public class Markup {
 
    public static void main(String[] args) {

    double bookprice;
    double bookprice1;
    double bookprice2;
    double markup = 0.1;
    double totalmarkup;
    double totalsalesprices;
    double wholesaleamount;
    double markupamount;
    int numberofbooks;

    Scanner reader = new Scanner(System.in);
    System.out.println(" How any book are you buying?");
    numberofbooks = reader.nextInt();

    if(numberofbooks > 1 ) {

        System.out.println(" Enter in the price of books ");
        bookprice = reader.nextDouble();
        bookprice1 = reader.nextDouble();
        bookprice2 = reader.nextDouble();


        markupamount = (bookprice * markup) * numberofbooks;
        System.out.println(" The markup amount for the book just sold is " + markupamount);

        wholesaleamount = (bookprice - markup) * numberofbooks;
        System.out.println(" The wholesale amount is "+ wholesaleamount) ;

        totalsalesprices = bookprice + markup;
        System.out.println(" The total sales price of all the books sold is " + totalsalesprices);

        totalmarkup = numberofbooks * markup;
        System.out.println("The total mark up amount of all the books sold thus far is " + totalmarkup );

        reader.close();

    }

    else {

        System.out.println(" How any book are you buying?");
        numberofbooks = reader.nextInt();


        System.out.println(" Enter in the price of books ");
        bookprice = reader.nextDouble();

        markupamount = (bookprice * markup) * numberofbooks;
        System.out.println(" The markup amount for the book just sold is " + markupamount);

        wholesaleamount = (bookprice - markup) * numberofbooks;
        System.out.println(" The wholesale amount is "+ wholesaleamount) ;

        totalsalesprices = bookprice + markup;
        System.out.println(" The total sales price of all the book sold is " + totalsalesprices);

        totalmarkup = numberofbooks * markup;
        System.out.println("The total mark up amount of all the book sold thus far is " + totalmarkup );

        if (numberofbooks <= 10) {

            System.out.print(" Sorry that is too many books for me to compute. So have a nice day");

        }

        }

    }
}