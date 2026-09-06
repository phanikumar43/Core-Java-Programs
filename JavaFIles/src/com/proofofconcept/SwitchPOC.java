//Date:-04-09-2026
//Class Program
//Write a program to print Veg,Non-Veg,Starters,Soups using the switch statement

package com.proofofconcept;

import java.util.Scanner;

public class SwitchPOC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cyn = "";
		do {
			System.out.println("Enter the Category: ");
			System.out.println("-----------------------------------");
			System.out.println("1.Veg");
			System.out.println("2.Non-Veg");
			System.out.println("3.Starters");
			System.out.println("4.Soups");
			System.out.println("------------------------------------");
			String catg = sc.next();
			switch (catg) {
			// Case for Veg Category
			case "1" -> {
				String Vyn = "";
				double totalVegCost = 0;
				String selectedItems = "";
				do {
					System.out.println("--------------------------------");
					System.out.println("Available Veg Items:");
					System.out.println("1.Veg-Biriyani");
					System.out.println("2.Paneer-Biriyani");
					System.out.println("3.Veg-Fried-Rice");
					System.out.println("4.Paneer-Fried-Rice");
					System.out.println("5.Paneer-Butter-Masala");
					System.out.println("--------------------------------");
					System.out.println("Enter the Item: ");
					String item = sc.next();
					switch (item) {
					case "1" -> {
						System.out.println("Veg-Biriyani Rate is 130 Rupees..");
						double VbPrice = 130;
						totalVegCost = totalVegCost + VbPrice;
						selectedItems = selectedItems + "Veg-Biriyani\n";
					}
					case "2" -> {
						System.out.println("Paneer-Biriyani Rate is 180 Rupees..");
						double PbPrice = 180;
						totalVegCost = totalVegCost + PbPrice;
						selectedItems = selectedItems + "Paneer-Biriyani\n";
					}
					case "3" -> {
						System.out.println("Veg-Fried-Rice Rate is 120 Rupees..");
						double VfrPrice = 120;
						totalVegCost = totalVegCost + VfrPrice;
						selectedItems = selectedItems + "Veg-Fried-Rice\n";
					}
					case "4" -> {
						System.out.println("Paneer-Fried-Rice Rate is 160 Rupees..");
						double PfrPrice = 160;
						totalVegCost = totalVegCost + PfrPrice;
						selectedItems = selectedItems + "Paneer-Fried-Rice\n";
					}
					case "5" -> {
						System.out.println("Paneer-Butter-Masala Rate is 190 Rupees..");
						double PbmPrice = 190;
						totalVegCost = totalVegCost + PbmPrice;
						selectedItems = selectedItems + "Paneer-Butter-Masala\n";
					}
					default -> System.out.println("Your Entered Item is not available...");
					}
					System.out.println("Do You Want to Continue? If yes click Y (or) If No click N..");
					Vyn = sc.next();
				} while (Vyn.equalsIgnoreCase("Y"));
				System.out.println("--------------------------------");
				System.out.println("Your Total Veg Cost is: " + totalVegCost);
				System.out.println("--------------------------------");
				System.out.println("Your Selected Items are: " + selectedItems);
				System.out.println("Exited From Veg Category..");
			}
			// Case for Non-Veg Category
			case "2" -> {
				String Nyn = "";
				double totalNonVegCost = 0;
				String selectedItems = "";
				do {
					System.out.println("Non-Veg Category Selected");
					System.out.println("--------------------------------------");
					System.out.println("1.Butter-Chicken");
					System.out.println("2.Chicken-Biriyani");
					System.out.println("3.Chicken-65");
					System.out.println("4.Tandoori-Chicken");
					System.out.println("5.Chicken-Chettinad");
					System.out.println("---------------------------------------");
					System.out.println("Enter the Non-Veg Item to Proceed..");
					String item = sc.next();
					switch (item) {
					case "1" -> {
						System.out.println("Butter-Chicken Rate is: 250 Rupees");
						double BCPrice = 250;
						totalNonVegCost = totalNonVegCost + BCPrice;
						selectedItems = selectedItems + "Butter-Chicken\n";
					}
					case "2" -> {
						System.out.println("Chicken-Biriyani Rate is : 200 Rupees");
						double CBPrice = 200;
						totalNonVegCost = totalNonVegCost + CBPrice;
						selectedItems = selectedItems + "Chicken-Biriyani\n";
					}
					case "3" -> {
						System.out.println("Chicken-65 Rate is : 180 Rupees");
						double C65Price = 180;
						totalNonVegCost = totalNonVegCost + C65Price;
						selectedItems = selectedItems + "Chicken-65\n";
					}
					case "4" -> {
						System.out.println("Tandoori-Chicken Rate is : 220 Rupees");
						double TCPrice = 220;
						totalNonVegCost = totalNonVegCost + TCPrice;
						selectedItems = selectedItems + "Tandoori-Chicken\n";
					}
					case "5" -> {
						System.out.println("Chicken-Chettinad Rate is : 250 Rupees");
						double CCPrice = 250;
						totalNonVegCost = totalNonVegCost + CCPrice;
						selectedItems = selectedItems + "Chicken-Chettinad\n";
					}
					default -> {
						System.out.println("Please Enter Correct Item in the Given List");
					}
					}
					System.out.println("Do You Want to Continue..if Yes Click Y (or) If No click N...");
					Nyn = sc.next();
				} while (Nyn.equalsIgnoreCase("Y"));
				System.out.println("Your Selected Items are: " + selectedItems);
				System.out.println("--------------------------------");
				System.out.println("Your Total Non-Veg Cost is: " + totalNonVegCost);
				System.out.println("--------------------------------");
				System.out.println("Exited From Non-Veg Category...");
			}

			// Case for Starters Category
			case "3" -> {
				String sts = "";
				double totalStartersPrice = 0;
				String selectedItems = "";
				do {
					System.out.println("Starters Category Selected");
					System.out.println("-------------------------------------");
					System.out.println("1.Gobi-Manchurian-Dry");
					System.out.println("2.Chilli-Potato");
					System.out.println("3.Veg-Manchurian-Dry");
					System.out.println("4.Chilli-Soya-Chaap");
					System.out.println("5.Chilli-Paneer-Dry");
					System.out.println("-------------------------------------");
					System.out.println("Enter the items to Proceed");
					String item = sc.next();
					switch (item) {
					case "1" -> {
						System.out.println("Gobi-Manchurian-Dry is 40 Rupees");
						double GMDPrice = 40;
						totalStartersPrice = totalStartersPrice + GMDPrice;
						selectedItems = selectedItems + "Gobi-Manchurian-Dry\n";
					}
					case "2" -> {
						System.out.println("Chilli-Potato is 50 Rupees");
						double CPPrice = 50;
						totalStartersPrice = totalStartersPrice + CPPrice;
						selectedItems = selectedItems + "Chilli-Potato\n";
					}
					case "3" -> {
						System.out.println("Veg-Manchurian-Dry is 60 Rupees");
						double VMDPrice = 60;
						totalStartersPrice = totalStartersPrice + VMDPrice;
						selectedItems = selectedItems + "Veg-Manchurian-Dry\n";
					}
					case "4" -> {
						System.out.println("Chilli-Soya-Chaap is 60 Rupees");
						double CSCPrice = 60;
						totalStartersPrice = totalStartersPrice + CSCPrice;
						selectedItems = selectedItems + "Chilli-Soya-Chaap\n";
					}
					case "5" -> {
						System.out.println("Chilli-Paneer-Dry is 80 Rupees");
						double CPDPrice = 80;
						totalStartersPrice = totalStartersPrice + CPDPrice;
						selectedItems = selectedItems + "Chilli-Paneer-Dry\n";
					}
					default -> {
						System.out.println("Enter the Correct Item in the Given List...");
					}
					}
					System.out.println("Do You Want to Proceed...if Yes Click Y (Or) If No Click N");
					sts = sc.next();
				} while (sts.equalsIgnoreCase("Y"));
				System.out.println("Your Selected Items are: " + selectedItems);
				System.out.println("-----------------------");
				System.out.println("Your Total Price is: " + totalStartersPrice);
				System.out.println("-----------------------");
				System.out.println("End Of Starters Category...");
			}

			// Case for Soups Category
			case "4" -> {
				String syn = "";
				double totalSoupsPrice = 0;
				String SelectedItems = "";
				do {
					System.out.println("Soups Category Selected");
					System.out.println("-----------------------------------");
					System.out.println("1.Veg-Clear-Soup");
					System.out.println("2.Veg-Manchow-Soup");
					System.out.println("3.Hot-and-Sour-Soup");
					System.out.println("4.Sweet-Corn-Soup");
					System.out.println("5.Cream-of-Mushroom-Soup");
					System.out.println("-----------------------------------");
					System.out.println("Enter The Item To Proceed....");
					String item = sc.next();
					switch (item) {
					case "1" -> {
						System.out.println("Veg-Clear-Soup is 130 Rupees");
						double VCSPrice = 130;
						totalSoupsPrice = totalSoupsPrice + VCSPrice;
						SelectedItems = SelectedItems + "Veg-Clear-Soup\n";
					}
					case "2" -> {
						System.out.println("Veg-Manchow-Soup is 140 Rupees");
						double VMSPrice = 140;
						totalSoupsPrice = totalSoupsPrice + VMSPrice;
						SelectedItems = SelectedItems + "Veg-Manchow-Soup\n";
					}
					case "3" -> {
						System.out.println("Hot-and-Sour-Soup is 140 Rupees");
						double HSSPrice = 140;
						totalSoupsPrice = totalSoupsPrice + HSSPrice;
						SelectedItems = SelectedItems + "Hot-and-Sour-Soup\n";
					}
					case "4" -> {
						System.out.println("Sweet-Corn-Soup is 140 Rupees");
						double SCSPrice = 140;
						totalSoupsPrice = totalSoupsPrice + SCSPrice;
						SelectedItems = SelectedItems + "Sweet-Corn-Soup\n";
					}
					case "5" -> {
						System.out.println("Cream-of-Mushroom-Soup is 135 Rupees");
						double CMSPrice = 135;
						totalSoupsPrice = totalSoupsPrice + CMSPrice;
						SelectedItems = SelectedItems + "Cream-of-Mushroom-Soup\n";
					}
					default -> {
						System.out.println("Enter the Correct Items that are available in the list");
					}
					}
					System.out.println("Do You Want to Continue if yes click Y (or) if no Click N");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("Y"));
				System.out.println("The Selected Items are: " + SelectedItems);
				System.out.println("--------------------------------");
				System.out.println("The Total Price is: " + totalSoupsPrice);
				System.out.println("--------------------------------");
				System.out.println("Exited from the soups category...");
			}
			default -> {
				System.out.println("Invalid Category Entered");
			}
			}
			System.out.println("Do You want to Continue..if Yes click Y (or) if No click N");
			cyn = sc.next();
		} while (cyn.equalsIgnoreCase("Y"));
		System.out.println("Thank You For Visiting");
		System.out.println("Your Attention are needs us");
		sc.close();
	}
}