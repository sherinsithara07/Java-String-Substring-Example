public class SalesAdder {
public static void main(String[] args) {
// Sample sales data for Branch 1 (e.g., in thousands of dollars)
double[] branch1Sales = {100.5, 120.0, 95.3, 110.7, 130.2, 140.8,
150.1, 160.5, 170.9, 180.3, 190.7, 200.0};

// Sample sales data for Branch 2  
    double[] branch2Sales = {90.2, 105.4, 88.6, 102.1, 115.8, 125.3,   
                             135.7, 145.2, 155.6, 165.9, 175.4, 185.8};  
      
    // Check if arrays are the same length  
    if (branch1Sales.length != branch2Sales.length) {  
        System.out.println("Error: Sales data arrays must be of equal length.");  
        return;  
    }  
      
    // Array to hold the summed sales  
    double[] totalSales = new double[branch1Sales.length];  
      
    // Add corresponding elements  
    for (int i = 0; i < branch1Sales.length; i++) {  
        totalSales[i] = branch1Sales[i] + branch2Sales[i];  
    }  
      
    // Print the results  
    System.out.println("Total monthly sales for the company:");  
    for (int i = 0; i < totalSales.length; i++) {  
        System.out.printf("Month %d: %.2f\n", (i + 1), totalSales[i]);  
    }  
}

}
