package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        Bank bank = new Bank();
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        System.out.println("Vítej v Bance!");
        System.out.println("------------------");
        System.out.println("Zadej prosím své jméno pro první účet:");
        customer1.setName(sc.nextLine());
        System.out.println("Zadejte prosím své jméno pro druhý účet:");
        customer2.setName(sc.nextLine());
        System.out.println("Zadejte u jaké banky chcete mít účet se jménem: " + customer1.getName());
        System.out.println("1) AirBank");
        System.out.println("2) KMB");
        int option = sc.nextInt();
        if (option == 1) {
            String account = bank.getAccountCreate() + "/" + bank.getAirBank();
            customer1.setAccounts(account);

        }
        if (option == 2) {
            String account = bank.getAccountCreate() + "/" + bank.getKmb();
            customer1.setAccounts(account);
        }
        System.out.println("Zadejte u jaké banky chcete mít účet se jménem: " + customer2.getName());
        System.out.println("1) AirBank");
        System.out.println("2) KMB");
        int option2 = sc.nextInt();
        if (option2 == 1) {
            String account = bank.getAccountCreate() + "/" + bank.getAirBank();
            customer2.setAccounts(account);

        }
        if (option2 == 2) {
            String account = bank.getAccountCreate() + "/" + bank.getKmb();
            customer2.setAccounts(account);
        }
        sc.nextLine();
        System.out.println("Zadej kolik chceš mít peněz na účtě se jménem: " + customer1.getName());
        customer1.setAccmoney(sc.nextInt());

        System.out.println("Zadej kolik chceš mít peněz na účtě se jménem: " + customer2.getName());
        customer2.setAccmoney(sc.nextInt());
        sc.nextLine();
        System.out.println("Zvolte si heslo které budete používat na účtě se jménem: " + customer1.getName());
        customer1.setPass(sc.nextLine());

        System.out.println("Zvolte si heslo které budete používat na účtě se jménem: " + customer2.getName());
        customer2.setPass(sc.nextLine());

        System.out.println("Zadejte který účet chcete požívat");

        System.out.println("1) " + customer1.getName());
        System.out.println("2) " + customer2.getName());

        int option3 = sc.nextInt();
        sc.nextLine();
        if (option3 == 1) {
            System.out.println("Zadejte heslo pro účet se jménem " + customer1.getName());
            String pass = sc.nextLine();
            if (pass.equals(customer1.getPass())) ;
            System.out.println("Vítejte " + customer1.getName() + " !");
            System.out.println("------------");
            System.out.println("Zde jsou informace o účtu!");
            System.out.println("Číslo účtu: " + customer1.getAccounts());
            System.out.println("Zůstatek na účtě: " + customer1.getAccmoney() + "CZK");
            System.out.println("---------------------------");
        }

        boolean asd = true;
        while (asd) {
            if (option3 == 1) {
                System.out.println("Zde máte možnosti co můžete dělat!");
                System.out.println("----------------------");
                System.out.println("1) Poslat peníze");
                System.out.println("2) Přidat peníze");
                System.out.println("3) Vytvořit nový účet");
                System.out.println("4) Zrušit účet");
                System.out.println("5) Přejít na jiný účet");
                System.out.println("6) Odejít z Banky");
                int menu = sc.nextInt();


                if (menu == 1) {
                    System.out.println("Účty kam můžete poslat peníze:");
                    System.out.println(customer2.getAccounts());
                    sc.nextLine();
                    System.out.println("Napište číslo účtu kam chcete poslat peníze!");
                    String moneydesti = sc.nextLine();
                    System.out.println("Kolik chete poslat peněz?");
                    int amount = sc.nextInt();
                    if (amount > customer1.getAccmoney()) {
                        System.out.println("Nemáte dostatek peněz na účtě!");
                    }
                    if (moneydesti.equals(customer1.getAccounts())) {
                        System.out.println("Nemůžete poslat peníze sám sobě");
                    }
                    if (moneydesti.equals(customer2.getAccounts())) {
                        customer2.setAccmoney(customer2.getAccmoney() + amount);
                        customer1.setAccmoney(customer1.getAccmoney() - amount);
                        System.out.println("Váš zůstatek na účtě činí: " + customer1.getAccmoney());
                    }

                }

                if (menu == 2) {
                    System.out.println("Zadejte kolik chcete přidat peňez!");
                    int addm = sc.nextInt();
                    customer1.setAccmoney(customer1.getAccmoney() + addm);
                    System.out.println("Váš nový zůstatek činí: " + customer1.getAccmoney());
                }
                if (menu == 3) {
                    System.out.println("U jaké banky chcete být?");
                    System.out.println("1) Airbank");
                    System.out.println("2) KMB");
                    int choose = sc.nextInt();
                    if (choose == 1) {
                        int x = random.nextInt(9999999);
                        bank.setAccountCreate(x);
                        String other = "  _  " + bank.getAccountCreate() + "/" + bank.getAirBank();
                        customer1.setAccounts(customer1.getAccounts() + "/" + other);
                    }
                    if (choose == 2) {
                        int x = random.nextInt(9999999);
                        bank.setAccountCreate(x);
                        String other = bank.getAccountCreate() + "/" + bank.getKmb();
                        customer1.setAccounts(customer1.getAccounts() + "/" + other);
                    }
                    System.out.println("Vytvořili jsme vám nový účet! Toto jsou vaše účty!");
                    System.out.println(customer1.getAccounts());

                }

                if (menu == 4) {
                    sc.nextLine();
                    System.out.println("Opravdu chcete zrušit účet a odejít od naší banky?");
                    System.out.println("ano/ne");
                    String delete = sc.nextLine();
                    if (delete.equals("ano")) {
                        System.exit(1);
                    }
                    if (delete.equals("ne")) {

                    }
                }


                if (menu == 5) {
                    asd = false;
                    boolean rs = true;
                    sc.nextLine();
                    System.out.println("Zadejte heslo pro účet se jménem: " + customer2.getName());
                    String pass2 = sc.nextLine();
                    if (pass2.equals(customer2.getPass())) {
                            System.out.println("Vítejte " + customer2.getName() + " !");
                            System.out.println("------------");
                            System.out.println("Zde jsou informace o účtu!");
                            System.out.println("Číslo účtu: " + customer2.getAccounts());
                            System.out.println("Zůstatek na účtě: " + customer2.getAccmoney() + "CZK");
                            System.out.println("---------------------------");

                        }

                        while (rs) {
                            System.out.println("Zde máte možnosti co můžete dělat!");
                            System.out.println("----------------------");
                            System.out.println("1) Poslat peníze");
                            System.out.println("2) Přidat peníze");
                            System.out.println("3) Vytvořit nový účet");
                            System.out.println("4) Zrušit účet");
                            System.out.println("5) Odejít z Banky");
                            int menu2 = sc.nextInt();
                            if (menu2 == 1) {
                                System.out.println("Účty kam můžete poslat peníze:");
                                System.out.println(customer2.getAccounts());
                                sc.nextLine();
                                System.out.println("Napište číslo účtu kam chcete poslat peníze!");
                                String moneydesti = sc.nextLine();
                                System.out.println("Kolik chete poslat peněz?");
                                int amount = sc.nextInt();
                                if (amount > customer2.getAccmoney()) {
                                    System.out.println("Nemáte dostatek peněz na účtě!");
                                }
                                if (moneydesti.equals(customer2.getAccounts())) {
                                    System.out.println("Nemůžete poslat peníze sám sobě");
                                }
                                if (moneydesti.equals(customer1.getAccounts())) {
                                    customer1.setAccmoney(customer1.getAccmoney() + amount);
                                    customer2.setAccmoney(customer2.getAccmoney() - amount);
                                    System.out.println("Váš zůstatek na účtě činí: " + customer2.getAccmoney());
                                }

                            }

                            if (menu2 == 2) {
                                System.out.println("Zadejte kolik chcete přidat peňez!");
                                int addm = sc.nextInt();
                                customer1.setAccmoney(customer2.getAccmoney() + addm);
                                System.out.println("Váš nový zůstatek činí: " + customer2.getAccmoney());
                            }
                            if (menu2 == 3) {
                                System.out.println("U jaké banky chcete být?");
                                System.out.println("1) Airbank");
                                System.out.println("2) KMB");
                                int choose = sc.nextInt();
                                if (choose == 1) {
                                    int x = random.nextInt(9999999);
                                    bank.setAccountCreate(x);
                                    String other = "  _  " + bank.getAccountCreate() + "/" + bank.getAirBank();
                                    customer2.setAccounts(customer2.getAccounts() + "/" + other);
                                }
                                if (choose == 2) {
                                    int x = random.nextInt(9999999);
                                    bank.setAccountCreate(x);
                                    String other = bank.getAccountCreate() + "/" + bank.getKmb();
                                    customer2.setAccounts(customer2.getAccounts() + "/" + other);
                                }
                                System.out.println("Vytvořili jsme vám nový účet! Toto jsou vaše účty!");
                                System.out.println(customer2.getAccounts());

                            }

                            if (menu2 == 4) {
                                sc.nextLine();
                                System.out.println("Opravdu chcete zrušit účet a odejít od naší banky?");
                                System.out.println("ano/ne");
                                String delete = sc.nextLine();
                                if (delete.equals("ano")) {
                                    System.exit(1);
                                }
                                if (delete.equals("ne")) {

                                }
                            }
                       if (menu2 == 5){
                           System.exit(1);

                        }
                    }

                if (menu == 6) {
                    System.exit(1);
                }


                }
            }
        }


    }


}
