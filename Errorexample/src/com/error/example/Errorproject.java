package com.error.example;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Errorproject {



    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  length = arr1.length;
        for(int i=0; i<length;i++){
            System.out.println(arr[i] +" ");
            // display the all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        expenses.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=length;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                    	 sortExpenses(expenses);
                    	
                    	 
                               
                             //System.out.println(expenses+"\n");
                       
                      
                       
                        optionsSelection();
                        break;
                    case 5:
                    	System.out.println("Please enter your expense::");
                		Scanner expenseinput = new Scanner(System.in);
                		int inputuserexpense = expenseinput.nextInt();
                		System.out.println("expense entered by the user is :: " + inputuserexpense);
                        searchExpenses(expenses,inputuserexpense);
                        
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
  
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList, int inputuserexpense) {
       // int leng = arrayList.size();
       // System.out.println("Enter the expense you need to search:\t");
        //Complete the method
    	if(arrayList.contains(inputuserexpense))
    	{
    		//System.out.println(inputuserexpense);
    		System.out.println("the expense is found.......");
    	}else {System.out.println("else not found");
    	}
    }

    private static void sortExpenses(ArrayList<Integer> arrayList) {
    	//System.out.println(arrayList);
        int arrlength =  arrayList.size();
      int temp=0;
     int arr2[]=new int[arrayList.size()];
     for(int i=0;i<arrlength;i++) {
    	 arr2[i]=arrayList.get(i);
     }
     //arrayList.toArray();
      for(int i=0;i<arrlength;i++) {
			for(int j=1;j<(arrlength-i);j++) {
				if(arr2[j-1]>arr2[j]) {
					//swap the elements
					temp=arr2[j-1];
					arr2[j-1]=arr2[j];
					arr2[j]=temp;
				}
			}
      }
      System.out.println("you are about to sort all the expenditures...\n");
      for(int i=0;i<arrlength;i++) {
    	  System.out.println(arr2[i]);
      }
      System.out.println("the expenses are sorted........\n");
      
		
    }
    }

