// Kevin Chen
// 9/7/14
// CSE 02 ShopCalc
// this program calculates your total cost on a shopping trip
//
public class Arithmetic{
    //define main method
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSockCost$;   //total cost of socks
        double totalGlassCost$;  //total cost of drinking glass
        double totalEnvelopeCost$;  //total cost of boxes of envelopes
        double taxSock;  //tax for socks
        double taxGlass;  //tax for drinking glass
        double taxEnvelope;  //tax for boxes of envelopes
        double beforeTaxTotalCost$;  //total cost for all items before tax
        double totalCost$;  //total cost for all items
        double totalTax;  //total tax for all items
        
        //calculate total and tax for each item
        totalSockCost$ = nSocks*sockCost$;
        totalGlassCost$ = nGlasses*glassCost$;
        totalEnvelopeCost$ = nEnvelopes*envelopeCost$;
        taxSock = totalSockCost$*taxPercent;
        taxGlass = totalGlassCost$*taxPercent;
        taxEnvelope = totalEnvelopeCost$*taxPercent;
        
        //calculate total before tax
        beforeTaxTotalCost$ = totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        //calculate total tax
        totalTax = taxSock+taxGlass+taxEnvelope;
        //calculate total cost
        totalCost$ = beforeTaxTotalCost$+totalTax;
        
        //convert all numbers to intergers
        int totalSockCost1 = (int)totalSockCost$;
        int totalGlassCost1 = (int)totalGlassCost$;
        int totalEnvelopeCost1 = (int)totalEnvelopeCost$;
        int taxSock1 = (int)taxSock;
        int taxGlass1 = (int)taxGlass;
        int taxEnvelope1 = (int)taxEnvelope;
        int beforeTaxTotalCost1 = (int)beforeTaxTotalCost$;
        int totalCost1 = (int)totalCost$;
        int totalTax1 = (int)totalTax;
        
        //convert all numbers to 2 decimals or less
        int totalSockCost2 = totalSockCost1*100;
        int totalGlassCost2 = totalGlassCost1*100;
        int totalEnvelopeCost2 = totalEnvelopeCost1*100;
        int taxSock2 = taxSock1*100;
        int taxGlass2 = taxGlass1*100;
        int taxEnvelope2 = taxEnvelope1*100;
        int beforeTaxTotalCost2 = beforeTaxTotalCost1*100;
        int totalCost2 = totalCost1*100;
        int totalTax2 = totalTax1*100;
        
        double totalSockCost3 = ((int)totalSockCost2)/100.0;
        double totalGlassCost3 = ((int)totalGlassCost2)/100.0;
        double totalEnvelopeCost3 = ((int)totalEnvelopeCost2)/100.0;
        double taxSock3 = ((int)taxSock2)/100.0;
        double taxGlass3 = ((int)taxGlass2)/100.0;
        double taxEnvelope3 = ((int)taxEnvelope2)/100.0;
        double beforeTaxTotalCost3 = ((int)beforeTaxTotalCost2)/100.0;
        double totalCost3 = ((int)totalCost2)/100.0;
        double totalTax3 = ((int)totalTax2)/100.0;
        
        //print out required numbers
        System.out.println("The total cost for socks is "+totalSockCost3);
        System.out.println("The total tax for socks is "+taxSock3);
        System.out.println("The total cost for drinking glass is "+totalGlassCost3);
        System.out.println("The total tax for drinking glass is "+taxGlass3);
        System.out.println("The total cost for envelopes is "+totalEnvelopeCost3);
        System.out.println("The total tax for envelopes is "+taxEnvelope3);
        System.out.println("The total cost before tax is "+beforeTaxTotalCost3);
        System.out.println("The total tax is "+totalTax3);
        System.out.println("The total cost for all items is "+totalCost3);

    }
}