package sio;

import java.util.Scanner;

public class TP1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        do
        {
            do
            {
                System.out.println("1 : Exo1");
                System.out.println("2 : Exo2");
                System.out.println("3 : Exo3");
                System.out.println("4 : Exo4");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = sc.nextInt();

            }while(choix < 0 || choix > 4);

            switch(choix)
            {
                case 1 :
                    double cote;
                    System.out.println("Quelle est la valeur du coté");
                    cote = scanner.nextDouble;
                    System.out.println("L'aire du carré est de:" + coté*coté + " cm² ");
                    break;
                case 2 :
                    int nb1;
                    int nb2;
                    int temp;
                    System.out.prinln("Saisir le premier nombre");
                    nb1 = scanner.nextInt();
                    System.out.println("Saisir le premier deuxième");
                    nb2 = scanner.nextInt();
                    System.out.println("AVANT");
                    System.out.println("nb1 = " + nb1);
                    System.out.println("nb2 = " + nb2);
                    temp = nb1;
                    nb1 = nb2;
                    nb2 = temp;
                    System.out.println("APRES");
                    System.out.println("nb1 = " + nb1);
                    System.out.println("nb2 = " + nb2);
                    break;
                case 3 :
                    int indice;
                    double salBrut;
                    double salNet;
                    double montantRetenues;
                    System.out.println("Quelle est votre indice");
                    indice = scanner.nextInt();
                    salBrut = indice * 2.30;
                    montantRetenues = salBrut - montantRetenues;
                    System.out.println("Salaire brut : " + decimalFormat.format(salBrut));
                    System.out.prinln("Montant Retenues : " + decimalFormat.format(montantRetenues));
                    System.out.println("Salaire net : " + decimalFormat.format(salNet));
                    break;
                case 4 :
                   double rayon;
                   double perimetre;
                   System.out.println("Quelle est la valeur du rayon");
                   rayon = scanner.nextDouble();
                   perimetre = 2 * 3.141592 * rayon;
                   System.out.println("Le perimètre du cercle est de : " + decimalFormat.format(perimetre));
                   break;
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);
    }
}
