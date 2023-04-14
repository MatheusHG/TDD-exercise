package com.gerador.notafiscal;


import com.gerador.notafiscal.controllers.InvoiceController;
import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.models.enums.ServiceType;

import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static InvoiceController controller = new InvoiceController();

    public static String input(String message) {
        String result = "";
        while (result.length() == 0) {
            System.out.print(message);
            result = sc.nextLine();
        }

        return result;
    }

    public static String getServiceTypeDescription() {
        List<String> serviceTypeDescriptions = ServiceType.getDescriptions();

        StringBuilder showOptions = new StringBuilder("What is the type of service?\n");
        for (int i = 0; i < serviceTypeDescriptions.size(); i++) {
            int position = i + 1;
            showOptions.append(position)
                    .append(" - ")
                    .append(serviceTypeDescriptions.get(i))
                    .append("\n");
        }
        System.out.println(showOptions);

        String choosedOption = input("Enter only the type number: ");
        try {
            int index = Integer.parseInt(choosedOption) - 1;
            return serviceTypeDescriptions.get(index);
        } catch (Exception e) {
            return getServiceTypeDescription();
        }
    }

    public static void main( String[] args ) {
        System.out.println("------------------------");
        System.out.println("Invoice Generator");
        System.out.println("------------------------\n");

        String clientName = input("Enter the customer's name: ");
        String clientAddress = input("Enter the customer's address: ");

        String serviceTypeDescription = getServiceTypeDescription();

        System.out.print("Enter the invoice amount: ");
        double billValue = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nWe will generate the invoice for you! ");
        NotaFiscal notaFiscal = controller.generate(clientName, clientAddress, serviceTypeDescription, billValue);

        System.out.println("\nYour invoice has the following information:");
        System.out.println(notaFiscal);

        String continueOption = input("\nDo you want to generate another invoice? (y/n)");
        if (continueOption.equalsIgnoreCase("y")) {
            System.out.println("\n\n\n");
            main(args);
        }
    }
}
