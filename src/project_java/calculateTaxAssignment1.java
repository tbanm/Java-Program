package project_java;
//Custom exception for when the employee is not an Indian citizen
class CountryNotValidException extends Exception {
 public CountryNotValidException(String message) {
     super(message);
 }
}

//Custom exception for when the employee name is empty or null
class EmployeeNameInvalidException extends Exception {
 public EmployeeNameInvalidException(String message) {
     super(message);
 }
}

//Custom exception for when the employee is not eligible for tax calculation
class TaxNotEligibleException extends Exception {
 public TaxNotEligibleException(String message) {
     super(message);
 }
}

//TaxCalculator class
class TaxCalculator {
 public double calculateTax(String empName, boolean isIndian, double empSal)
         throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
     if (!isIndian) {
         throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
     }

     if (empName == null || empName.isEmpty()) {
         throw new EmployeeNameInvalidException("The employee name cannot be empty");
     }

     if (empSal > 100000) {
         return empSal * 8 / 100;
     } else if (empSal >= 50000 && empSal <= 100000) {
         return empSal * 6 / 100;
     } else if (empSal >= 30000 && empSal < 50000) {
         return empSal * 5 / 100;
     } else if (empSal >= 10000 && empSal < 30000) {
         return empSal * 4 / 100;
     } else {
         throw new TaxNotEligibleException("The employee does not need to pay tax");
     }
 }
}

//CalculatorSimulator class
public class calculateTaxAssignment1 {
 public static void main(String[] args) {
     TaxCalculator taxCalculator = new TaxCalculator();

     try {
         // Test cases
         double taxAmount1 = taxCalculator.calculateTax("John", true, 120000);
         System.out.println("Tax amount is $" + taxAmount1);

         double taxAmount2 = taxCalculator.calculateTax(null, true, 60000);
         System.out.println("Tax amount is $" + taxAmount2);
     } catch (CountryNotValidException e) {
         System.out.println("Country not valid: " + e.getMessage());
     } catch (EmployeeNameInvalidException e) {
         System.out.println("Employee name not valid: " + e.getMessage());
     } catch (TaxNotEligibleException e) {
         System.out.println("Not eligible for Tax calculation: " + e.getMessage());
     }
 }
}


