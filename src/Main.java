import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        new Sikeres().start();
        new Sikertelen().start();


        top3();

    }
    public void top3(){


    }
}
    class Sikeres extends Thread{

        public void run(){
            while (sikeresbeolvas()){

                try{
                sikeresbeolvas();
                    Thread.sleep(1);
                }
                catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
        }
        public void legtobb(){

        }
        public boolean sikeresbeolvas() {
            try {
                File file = new File("sikeres.csv");
                Scanner R = new Scanner(file);
                while (R.hasNextLine()) {
                    ArrayList<String> sikeresVizsga = new ArrayList<String>();
                    String data = R.nextLine();
                    String[] sor=data.split(";");
                    for (int i = 0; i <= 9; i++) {
                    sikeresVizsga.add(sor[i]);
                    }
                }
                R.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
                return false;
        }
    }
    class Sikertelen extends Thread{

        public void run(){
            while (sikertelenbeolvas()){

                try{
                    sikertelenbeolvas();
                    Thread.sleep(1);
                }
                catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
        }
        public boolean sikertelenbeolvas() {
            try {
                File file = new File("sikertelen.csv");
                Scanner R = new Scanner(file);
                while (R.hasNextLine()) {

                    ArrayList<String> sikertelenVizsga=new ArrayList<String>();
                    String data = R.nextLine();
                    String[] sor=data.split(";");
                    for (int i = 0; i <= 9; i++) {
                        sikertelenVizsga.add(sor[i]);
                    }
                }
                R.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
                return false;
        }

    }

